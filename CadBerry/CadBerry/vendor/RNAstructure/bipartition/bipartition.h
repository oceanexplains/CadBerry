/*
 * A program that calculates the partition function for two strands of nucleic acids.
 * These strands of nucleic acids can be composed of either DNA or RNA.
 *
 * (c) 2009 Mathews Lab, University of Rochester Medical Center.
 * Written by Jessica S. Reuter
 */

#ifndef BIPARTITION_H
#define BIPARTITION_H

#include "../RNA_class/HybridRNA.h"
#include "../src/ErrorChecker.h"
#include "../src/ParseCommandLine.h"

class bipartition {
 public:
	// Public constructor and methods.

	/*
	 * Name:        Constructor.
	 * Description: Initializes all private variables.
	 */
	bipartition();

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
	string seqFile1;         // The first input sequence file.
	string seqFile2;         // The second input sequence file.
	string pfsFile;          // The output partition function save file.

	// Nucleic acid type (rna, dna or custom)
	string alphabet;
	

	// The temperature at which calculation occurs.
	double temperature;
};

#endif /* BIPARTITION_H */
