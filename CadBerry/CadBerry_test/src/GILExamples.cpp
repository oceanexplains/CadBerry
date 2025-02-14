#include "GILExamples.h"

//________________________________________________________________________________________
// SETTING TARGETS
//________________________________________________________________________________________
#pragma region Setting targets


std::string TargetExample1         = R"(#Target "S.Cerevisiae")";
std::string TargetExample2         = R"(#Target "E.coli")";
std::string TargetExample3         = R"(#Target "Escherichia coli")";
std::string TargetExample4         = R"(#Target "human")";
std::string TargetExample5         = R"(#Target "Pichia")";
std::string TargetExample6         = R"(#Target "Pichia Pastoris")";
std::string TargetExample7         = R"(#Target "Saccharomyces cerevisiae")";
std::string TargetExample8         = R"(#Target "Unoptimized")";
std::string TargetExample9         = R"(#Target "Yeast")";

//This one throws an error because targets can't be DNA
std::string TargetExampleError         = R"(#Target 
'ShouldThrowError')";

#pragma endregion


//________________________________________________________________________________________
// PREPROCESSOR COMMANDS
//________________________________________________________________________________________
#pragma region Preprocessor commands

//Regions
std::string RegionExample               = R"(
//Different styles of #Region and #EndRegion are supported and used in this example

#Target Unoptimized
#Region Region1
	'AAATTT'
	#region Region2
		'CCCGGG'
	#EndRegion
#endRegion
)";

std::string OverlappingRegionExample    = R"(
//EndRegion followed by the region name can end a region by name, allowing for overlaps

#Target Unoptimized
#Region Region1
	'AAATTT'
	#region Region2
		'CCCGGG'
	#EndRegion Region1
	'TTTAAA'
#endRegion Region2
)";


//SetAttr
std::string SetAttrExample = R"(
#Target Unoptimized
#SetAttr "a normal string" "another completely normal string"
#SetAttr "A More Complicated STRING #%$##@$%RWETRBFIKUOI::P}{(*" "~~~~~~~~~#%$#^$%^&YHGF::"
)";


//#Var
//This one's a normal example
std::string CreateVarExample1 = R"(
#Target Unoptimized
#Var Var1 str "SomeString"
#var Var2 num "10.0"
)";


//This one's a stress-test
std::string CreateVarExample2 = R"(
#Target Unoptimized
#Var "SSDGSFDV  SDFSEFDCSR##@23or3fnreiuh34" str TestValue
#Var "THIS IS A NUMBER23" num "3892302332.6"
)";


//#Inc
std::string IncExample = R"(
#Target Unoptimized
#Var "TestVar" num "22233.0"
#Inc "TestVar"
)";

std::string DecExample = R"(
#Target Unoptimized
#Var "TestVar" num "22233.0"
#Dec "TestVar"
)";


//#If
std::string PreproIfExample = R"(
#Target "Unoptimized"

#Var Var1 num "10.0"
#Var Var2 num "10.0"
#Var Counter num "0.0"

#If IsEq(Var1 Var2)
	#Inc Counter
#EndIf
)";


//#Else
std::string PreproElseExample = R"(
#Target "Unoptimized"

#Var Var1 num "10.0"
#Var Var2 num "282373.0"
#Var Counter num "0.0"

#If IsEq(Var1 Var2)
	#Dec Counter
#else
	#Inc Counter
#EndIf
)";

#pragma endregion


//________________________________________________________________________________________
// DNA AND RNA LITERALS
//________________________________________________________________________________________
#pragma region DNA and RNA literals

//DNA literals
std::string DNAExample1 = R"(
#Target "Unoptimized"

//DNA literals can contain all of the cannonical bases
'AAATTTCCCGGG'
)";

std::string DNAExample2 = R"(
#Target "Unoptimized"

//DNA literals can also contain any non-cannonical or degenerate bases
'DSSDGFSSEVREFEWADSFVTERSD'
)";

std::string DNAExample3 = R"(
#Target "Unoptimized"

//Finally, they can contain symbols and numbers, but this is not officially supported and may be removed in the future
'@#@#454356w5r23$#$@453425'
)";


//Amino acid literals
std::string AminoSequenceExample1 = R"(
#Target "Unoptimized"

//Evaluates to GGT ATT CTT TAA GCT GTT ATG CCT TTT TGG AGT ACT AAT CAA TAT TGT AAA CGT CAT GAT GAA 
@GILxAVMPFWSTNQYCKRHDE@
)";

std::string AminoSequenceExample2 = R"(
#Target "Yeast"

//Evaluates to GGT ATT TTG TAA GCT GTT ATG CCA TTT TGG TCT ACT AAT CAA TAT TGT AAA AGA CAT GAT GAA 
@GILxAVMPFWSTNQYCKRHDE@
)";

#pragma endregion


//________________________________________________________________________________________
// SEQUENCES AND OPERATIONS
//________________________________________________________________________________________
#pragma region Sequences and operations

//Sequences
std::string SequenceNoParams = R"(
#Target "Unoptimized"

'CCC'
ExampleSequence
'GGG'

sequence ExampleSequence
{
	'AAATTT'
}
)";

std::string MultiSequenceNoParams = R"(
#Target "Unoptimized"

Seq2
'CCC'

sequence Seq2
{
	'AAA'
	Seq1
}

sequence Seq1
{
	'TTT'
}
)";

std::string SequenceWithParams = R"(
#Target "Unoptimized"

Seq1(Seq2)
'CCC'

sequence Seq2
{
	'AAA'
}

sequence Seq1($Param1)
{
	'TTT'
	$Param1
}
)";

std::string SequenceWithParamsWithParams = R"(
#Target "Unoptimized"

Seq1(Seq2)
'CCC'

sequence Seq2($Seq)
{
	$Seq
	'AAA'
}

sequence Seq1($Param1)
{
	'TTT'
	$Param1(Seq3)
}

sequence Seq3
{
	'AAA'
}
)";


//Typed sequences
std::string SequenceWithTypedParams = R"(
#Target "Unoptimized"

Seq1(Seq2)
'CCC'

sequence Seq2 : cds
{
	'AAA'
}

sequence Seq1($Param1 : cds) : cds
{
	'TTT'
	$Param1
}
)";

std::string SequenceWithTypedParamsWithParams = R"(
#Target "Unoptimized"

Seq1(Seq2)
'CCC'

sequence Seq2($Seq : cds)
{
	$Seq
	'AAA'
}

sequence Seq1($Param1)
{
	'TTT'
	$Param1(Seq3)
}

sequence Seq3 : cds
{
	'AAA'
}
)";

std::string SequenceWithMultipleParams = R"(
#Target "Unoptimized"

BigSequence(Seq1, Seq2)

sequence Seq1
{
	'AAA'
}

sequence Seq2
{
	'TTT'
}

sequence BigSequence($S1 $S2)
{
	$S1
	$S2
}
)";

std::string CustomType = R"(
#Target "Unoptimized"

typedef TYPE
)";

std::string CustomTypeInheritance = R"(
#Target "Unoptimized"

typedef TYPE inherits cds
)";


//Operations
std::string OpNoParams = R"(
#Target "Unoptimized"

.Op1
{
	'CCC'
}

operation Op1
{
	'TTT'
	$InnerCode
	'TTT'
}
)";

std::string SequenceWithInnerCode = R"(
#Target "Unoptimized"

//This is equivalent to the last example
.Op1
{
	'CCC'
}

sequence Op1($InnerCode)
{
	'TTT'
	$InnerCode
	'TTT'
}
)";

std::string OpSequenceParams = R"(
#Target "Unoptimized"

.Op1(Seq1)
{
	'CCC'
}

operation Op1($Seq)
{
	'TTT'
	$InnerCode
	$Seq
	'TTT'
}

sequence Seq1
{
	'GGG'
}
)";

//As of right now, you can't call operations passed as parameters. If needed, the following example could let you make use of operations
/*
operation Op($OpParam)
{
	$OpParam($InnerCode = $InnerCode)
}
*/

std::string SequenceForward = R"(
#Target "Unoptimized"

//Create the forward
ShorterAlias => SuperLongGeneName

ShorterAlias

sequence SuperLongGeneName
{
	'AAAAA'
}
)";

std::string SequenceForwardWithParams = R"(
#Target "Unoptimized"

//Create the forward
ShorterAlias => SuperLongGeneName

ShorterAlias(Seq)

sequence SuperLongGeneName($Param1)
{
	'AAAAA'
	$Param1
}

sequence Seq
{
	'TTT'
}
)";

std::string OperationForward = R"(
#Target "Unoptimized"

SimplerName => ThisIsAPromoterWithAVeryLongName



operation ThisIsAPromoterWithAVeryLongName
{
	'TTT'
	$InnerCode
	'TTT'
}

)";

#pragma endregion

//________________________________________________________________________________________
// FOR AND FROM
//________________________________________________________________________________________


std::string ForExample = R"(
#Target "Unoptimized"

for "Yeast"
{
	//Evaluates to GGT ATT TTG TAA GCT GTT ATG CCA TTT TGG TCT ACT AAT CAA TAT TGT AAA AGA CAT GAT GAA 
	@GILxAVMPFWSTNQYCKRHDE@
}
)";


//________________________________________________________________________________________
// OPERATORS
//________________________________________________________________________________________


std::string UnaryOperatorExample = R"(
#Target "Unoptimized"

sequence TestData
{
	'TTT'
}

//Output should be TTTAAAAATTTAAAAA
TestData *5a
*5a TestData

operator *5a => Seq

sequence Seq($LVALUE)
{
	$LVALUE
	'AAAAA'
}
)";

std::string BinaryOperatorExample = R"(
#Target "Unoptimized"

sequence TestData1
{
	'TTT'
}

sequence TestData2
{
	'AAA'
}

//Output should be TTTAAA
TestData1 & TestData2

operator & => OperatorSequence

sequence OperatorSequence($LVALUE $RVALUE)
{
	$LVALUE
	$RVALUE
}
)";


//________________________________________________________________________________________
// DISTRIBUTIONS
//________________________________________________________________________________________


std::string DistributionExample = R"(
#Target "Unoptimized"

//This sequence will only be evaluated if "debug" or "Rel_full" are passed as distributions
DistSeq

[debug, Rel_full]
sequence DistSeq
{
	'TTT'
}
)";


//________________________________________________________________________________________
// NAMESPACES
//________________________________________________________________________________________


std::string SingleNamespace = R"(
#Target "Unoptimized"

TestNamespace::TestSequence

namespace TestNamespace
{
	sequence TestSequence
	{
		'TTT'
	}
}
)";

std::string MultipleNamespaces = R"(
#Target "Unoptimized"

TestNamespace1::TestNamespace2::TestSequence

namespace TestNamespace1
{
	namespace TestNamespace2
	{
		sequence TestSequence
		{
			'TTT'
		}
	}
}
)";

std::string NamespaceSequenceAsParameter = R"(
#Target "Unoptimized"

Seq1(ns1::Seq2)
'CCC'

namespace ns1
{
	sequence Seq2
	{
		'AAA'
	}
}

sequence Seq1($Param1)
{
	'TTT'
	$Param1
}
)";


//________________________________________________________________________________________
// BOOLS
//________________________________________________________________________________________
#pragma region Bools

#pragma region BoolImpl
#define BoolImpl R"(
using "tests"

// Creates a bool implementation to make sure everything works
ibool TestImpl
{
	Alloc => _alloc
	Dealloc => _dealloc

	Set => _set
	Use => _use
	NumAvailable => tests::NumAvailable

	And => _and
	Or => _or
	Not => _not
}


//______________________________________________________________________________
// Implementation
//______________________________________________________________________________

sequence _alloc {}
sequence _dealloc {}

sequence _set($name : data)
{
    'AAAA'
}

sequence _use($inner : any)
{
    'TTTT'
    $inner
    'TTTT'
}

sequence _and($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _or($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _not($input : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}
)"
#pragma endregion

std::string BoolImplementationExample = R"(
#Target "Unoptimized"
using "tests"

// Creates a bool implementation to make sure everything works
ibool TestImpl
{
    Alloc => _alloc
    Dealloc => _dealloc

    Set => _set
    Use => _use
    NumAvailable => TestModule::NumAvailable

    And => _and
    Or => _or
    Not => _not
}

//______________________________________________________________________________
// Implementation
//______________________________________________________________________________

sequence Input1($inner : any)
{
    'AAAA'
    $inner
    'AAAA'
}

sequence Output1
{
    'CCCC'
}

sequence Input2($inner : any)
{
    'TTTT'
    $inner
    'TTTT'
}

sequence Input3($inner : any)
{
    'GGGG'
    $inner
    'GGGG'
}

sequence Input4($inner : any)
{
    'CCCC'
    $inner
    'CCCC'
}

sequence _alloc {}
sequence _dealloc {}

sequence _set($name : data)
{
    'AAAA'
}

sequence _use($inner : any)
{
    'TTTT'
    $inner
    'TTTT'
}

sequence _and($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _or($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _not($output)
{
    'GGGG'
    $output
    'GGGG'
}
)";


std::string BoolExample = R"(
#Target "Unoptimized"
using "tests"

// Creates a bool implementation to make sure everything works
ibool TestImpl
{
	Alloc => _alloc
	Dealloc => _dealloc

	Set => _set
	Use => _use
	NumAvailable => tests::NumAvailable

	And => _and
	Or => _or
	Not => _not
}

// Simple test
bool b1 = Input1 & Input2
bool b2 = Input3 | ! Input4

if (b1 & b2)
{
    Output1
}


//______________________________________________________________________________
// Implementation
//______________________________________________________________________________

sequence Input1($InnerCode : any)
{
    'AAAA'
    $InnerCode
    'AAAA'
}

sequence Output1
{
    'CCCC'
}

sequence Input2($InnerCode : any)
{
    'TTTT'
    $InnerCode
    'TTTT'
}

sequence Input3($InnerCode : any)
{
    'GGGG'
    $InnerCode
    'GGGG'
}

sequence Input4($InnerCode : any)
{
    'CCCC'
    $InnerCode
    'CCCC'
}

sequence _alloc {}
sequence _dealloc {}

sequence _set($name : data)
{
    'AAAA'
}

sequence _use($inner : any)
{
    'TTTT'
    $inner
    'TTTT'
}

sequence _and($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _or($left : data, $right : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}

sequence _not($input : data, $output : any)
{
    'GGGG'
    $output
    'GGGG'
}
)";

std::string SequenceBoolExample = R"(
#Target "Unoptimized"

//Define a sequence that defines and uses local bools

sequence TestSequence
{
	bool b1 = DummyInput1 & DummyInput2
	if (b1)
	{
		DummyOutput
	}
}

TestSequence
TestSequence

/*
Lowered code:
_and(tbool1, tbool2, set(testsequence@r1@b1))   GGGGAAAAGGGG
_use(testsequence@r1@b1, DummyOutput)			TTTTAAATTTT
_and(tbool3, tbool4, set(testsequence@r2@b1))	GGGGAAAAGGGG
_use(testsequence@r2@b1, DummyOutput)			TTTTAAATTTT

DummyInput1(set(tbool1))						TTTAAAA
DummyInput2(set(tbool2))						GGGAAAA

Output:
GGGGAAAAGGGGTTTTAAATTTTGGGGAAAAGGGGTTTTAAATTTTTTTAAAAGGGAAAA
*/

sequence DummyInput1($InnerCode : any)
{
	'TTT'
    $InnerCode
}

sequence DummyInput2($InnerCode : any)
{
	'GGG'
    $InnerCode
}

sequence DummyOutput
{
	'AAA'
}

)" BoolImpl;


std::string SequenceParamBoolExample = R"(
#Target "Unoptimized"

//Define a sequence that defines and uses local bools passed as parameters

sequence Test($b1, $b2, $output)
{
	bool b = $b1 & $b2
	if (b)
	{
		$output
	}
}

Test(DummyInput1, DummyInput2, DummyOutput1)
Test(DummyInput1, DummyInput2, DummyOutput2)

sequence DummyInput1($inner : any)
{
	'TTT'
    $inner
}

sequence DummyInput2($inner : any)
{
	'GGG'
    $inner
}

sequence DummyOutput1
{
	'AAA'
}

sequence DummyOutput2
{
	'CCC'
}
)" BoolImpl;

#pragma endregion