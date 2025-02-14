#pragma once
#include "CadBerry.h"

#define Error(msg, token) CDB_BuildError(msg, token->line)

//All the GIL error messages
#define ERROR_001 "Error GIL001 (line {0}): \"import\" expected a file name"
#define ERROR_002 "Error GIL002 (line {0}): \"using\" expected a file name"
#define ERROR_003 "Error GIL003 (line {0}): \"#target\" expected an organism name"
#define ERROR_004 "Error GIL004 (line {0}): \"#SetAttr\" expected an attribute name and value"
#define ERROR_005 "Error GIL005 (line {0}): \"#Var\" expected a variable name, type, and value"
#define ERROR_006 "Error GIL006 (line {0}): \"#Region\" expected a region name"
#define ERROR_007 "Error GIL007 (line {0}): \"#Inc\" expected a variable name to increment"
#define ERROR_008 "Error GIL008 (line {0}): \"#Dec\" expected a variable name to decrement"
#define ERROR_009 "Error GIL009 (line {0}): \"#If\" expected a condition"
#define ERROR_010 "Error GIL010 (line {0}): an \"#If\" needs to be ended by \"#Else\" or \"#EndIf\""
#define ERROR_011 "Error GIL011 (line {0}): \"#Else\" must be preceeded by \"#If\""
#define ERROR_012 "Error GIL012 (line {0}): a \"#Else\" needs to be ended by \"#EndIf\""
#define ERROR_013 "Error GIL013 (line {0}): sequence parameters must be defined using $ParamName"
#define ERROR_014 "Error GIL014 (line {0}): we have a typed parameter ($Param : ) but no type after the colon"
#define ERROR_015 "Error GIL015 (line {0}): \"for\" needs an organism name to translate to"
#define ERROR_016 "Error GIL016 (line {0}): \"for\" must be followed by something to translate (ex. {{ SomeSequence }})"
#define ERROR_017 "Error GIL015 (line {0}): \"from\" needs an organism name to translate from"
#define ERROR_018 "Error GIL016 (line {0}): \"from\" must be followed by something to translate (ex. {{ SomeSequence }})"
#define ERROR_019 "Error GIL019 (line {0}): when defining a sequence, you need to give it a name"
#define ERROR_020 "Error GIL020 (line {0}): when defining a sequence, you need to give it a body"
#define ERROR_021 "Error GIL021 (line {0}): we have a typed sequence, but no type after the colon"
#define ERROR_022 "Error GIL022 (line {0}): when defining an operator, you must give it a name and a sequence to point to"
#define ERROR_023 "Error GIL023 (line {0}): when defining an operator, you must give it a name"
#define ERROR_024 "Error GIL024 (line {0}): when defining an operator, you must give it a sequence to point to"
#define ERROR_025 "Error GIL025 (line {0}): we have a sequence forward (NewName => OldName), but no name after the arrow"
#define ERROR_026 "Error GIL026 (line {0}): we have a namespace accession operator (::), but no namespace after it"
#define ERROR_027 "Error GIL027 (line {0}): we have a typedef, but no name for the new type"
#define ERROR_028 "Error GIL028 (line {0}): we have a type inheritance, but no type to inherit from"
#define ERROR_029 "Error GIL029 (line {0}): when calling an operation, you need to give it a body"
#define ERROR_030 "Error GIL030 (line {0}): when creating a namespace, you need to give it a name and body"
#define ERROR_031 "Error GIL031 (line {0}): when creating a namespace, you need to give it a name"
#define ERROR_032 "Error GIL032 (line {0}): when creating a namespace, you need to give it a body"
#define ERROR_033 "Error GIL033: Operator \"{0}\" was set to sequence \"{1}\", which does not exist"
#define ERROR_034 "Error GIL034: Sequence forward was set to sequence \"{0}\", which does not exist"
#define ERROR_035 "Error GIL035: Parameter \"{0}\" on line {1} is not a parameter of sequence"
#define ERROR_036 "Error GIL036: Boolean implementation on line {0} does not have a name or definition"
#define ERROR_037 "Error GIL037: Boolean implementation on line {0} does not have a name (expected name after ibool)"
#define ERROR_038 "Error GIL038: Boolean implementation on line {0} does not have a definition (expected {{ }} after name)"
#define ERROR_039 "Error GIL039: Boolean implementation \"{0}\" is missing required sequence \"{1}\""
#define ERROR_040 "Error GIL040: Bool defined on line {0} does not have a name"
#define ERROR_041 "Error GIL041: Bool defined on line {0} uses the same name as another bool or sequence"
#define ERROR_042 "Error GIL042: We have a bool being set to something, but no value provided on line {0}"
#define ERROR_043 "Error GIL043: Unexpected right parentheses on line {0}"
#define ERROR_044 "Error GIL044: Expected identifier after NOT token on line {0}"
#define ERROR_045 "Error GIL045: Expected identifier in boolean expression on line {0}"
#define ERROR_046 "Error GIL046: Insufficient bool implementations defined to implement all bool operations"
#define ERROR_047 "Error GIL047 (line {0}): Referenced bool \"{1}\" (full name \"{2}\") that does not exist"
#define ERROR_048 "Error GIL048: Bool \"{0}\" (full name \"{1}\") was not assigned a bool implementation. This is most likely a compiler error. \
If you downloaded this program from the GitHub repo, please make an issue there (https://github.com/CamelCaseCam/CadBerry/issues). "
#define ERROR_049 "Error GIL049: Logic gate on line {0} is missing a right or left operand"