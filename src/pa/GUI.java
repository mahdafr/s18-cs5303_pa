/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 * 
 * The GUI class is the View of the MVC design.
 * This class handles IO to be used for the Backend (model).
 * This is the only class that uses the IO functions for both
 * 	writing/reading nicely to console.
 */
package pa;

import utils.*;

import java.util.LinkedList;

public class GUI {
	private IO io;
	
	public GUI() {
		io = new IO();	
	}
	
	public void writeInstructions() {
		io.writeLn("All lowercase English letters can be used as variables/atoms in propositional formulas. Restrict to using only single-letter atoms.");
		io.writeLn("Parentheses must be used in syntax.");
		io.writeLn("");
		io.writeLn("Representations:");
		io.writeLn("  complement (not) of a formula, a: '(!a)'");
		io.writeLn("  conjunction (^) of formulae, a, b: '(a&b)'");
		io.writeLn("  disjunction (v) of formulae, a, b: '(a|b)'");
		io.writeLn("  implication (->) of formulae, a, b: '(a->b)'");
		io.writeLn("");
	}
	
	public int promptBehavior() {
		io.writeLn("You entered a valid expression. Which option would you like to do?");
		io.writeLn("  (1) Transform to CNF");
		io.writeLn("  (2) Transform to DNF");
		io.writeLn("  (3) Transform to full CNF");
		io.writeLn("  (4) Transform to full DNF");
		io.writeLn("  (5) Evaluate the truth value (requires truth values for each atom)");
		io.writeLn("  (6) Determine its truth evaluation: satisfiable/tautology/contradiction");
		io.writeLn("  (7) All of the above");
		io.write("Option: ");
		return io.getInt();
	}
	
	public String getExpression() {
		io.write("\nEnter a valid test string ('-1' to quit, or '-2' to continue with the same test string): ");
		return io.getStr();
	}

	public java.util.LinkedList<Boolean> getTestValues(java.util.LinkedList<Character> atoms) {
		java.util.LinkedList<Boolean> testVals = new java.util.LinkedList<>();
		io.writeLn("Provide test truth values for the expression. Enter 1 for TRUE or 0 for FALSE.");
		for ( char a : atoms ) {
			io.write("Enter a test value for",a);
			io.write("= ");
			if ( io.getInt()==0 )
				testVals.add(false);
			else
				testVals.add(true);
		}
		return testVals;
	}

	public void result(String s, int prompt) {
		switch ( prompt ) {
			case 1:
				io.write("Expression in CNF: " +s);
				break;
			case 2:
				io.write("Expression in DNF: " +s);
				break;
			case 3:
				io.write("Expression in full CNF: " +s);
				break;
			case 4:
				io.write("Expression in full DNF: " +s);
				break;
		}
		io.writeLn("");
	}

	public void result(boolean val, int prompt) {
		switch ( prompt ) {
			case 5:
				io.write("Expression with given truth values",val);
				break;
			case 6:
				if ( val ) io.writeLn("Expression is Tautology");
				else io.writeLn("Expression is Contradiction");
				break;
			case 60: //hack
				io.writeLn("Expression is Satisfiable");
				break;
		}
		io.writeLn("");
	}
	
	public void end() {
		io.writeLn("Process terminated.");
	}
}