/*
 * A program that analyzes a strand of nucleic acids using stochastic probability sampling.
 * These nucleic acids can be composed of either DNA or RNA.
 *
 * (c) 2009 Mathews Lab, University of Rochester Medical Center.
 * Written by Jessica S. Reuter
 */

#ifndef STOCHASTIC_H
#define STOCHASTIC_H

#include "../RNA_class/RNA.h"
#include "../src/ErrorChecker.h"
#include "../src/ParseCommandLine.h"

class stochastic {
 public:
	// Public constructor and methods.

	/*
	 * Name:        Constructor.
	 * Description: Initializes all private variables.
	 */
	stochastic();

	/*
	 * Name:        parse
	 * Description: Parses command line arguments to determine what options are required for a particular calculation.
	 * Arguments:
	 *     1.   The number of command line arguments.
	 *     2.   The command line arguments themselves.
	 * Returns:
	 *     True if parsing completed without errors, false if not.
	 */
	bool parse( int argc, char** argv );

	/*
	 * Name:        run
	 * Description: Run calculations.
	 */
	void run();

 private:
	// Private variables.

	// Description of the calculation type.
	string calcType;

	// Input and output file names.
	string input;            // The input file.
	string ctFile;           // The output ct file.

	// The structure ensemble size.
	int ensemble;

	// Flag signifying if calculation handles RNA (true) or DNA (false).
	bool isRNA;

	// Boolean flag signifying if input is a sequence file (true) or not (false).
	bool isSequence;

	// The random seed.
	int seed;
};

#endif /* STOCHASTIC_H */
