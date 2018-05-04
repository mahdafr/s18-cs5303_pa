/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 *
 * @modified May 03 R
 * 
 */
package pa;

public class Backend {
	private conv.Conj CNF;
	private conv.Disj DNF;
	private utils.Help h;
	private java.util.LinkedList<Character> atoms;
	private String expr;
	private boolean[][] truthTable;
	private Eval evaluation;

	public enum Eval {
		Satisfiable,
		Tautology,
		Contradiction
	}
	
	public Backend() {
		CNF = new conv.Conj();
		DNF = new conv.Disj();
		h = new utils.Help();
		atoms = new java.util.LinkedList<>();
	}
	
	public void doAll() {
		toCNF();
		toDNF();
		toFullCNF();
		toFullDNF();
		evaluate();
	}
	
	/* ****************** Operations for Transformations ****************** */
	/**
	 * Transforms the expression into Conjunctive Normal Form (CNF).
	 */
	public String toCNF() {
		return CNF.toCNF(expr);
	}
	
	/**
	 * Transforms the expression into Disjunctive Normal Form (DNF).
	 */
	public String toDNF() {
		return DNF.toDNF(CNF.get());
	}

	/**
	 * Transforms the CNF into full Conjunctive Normal Form (CNF).
	 */
	public String toFullCNF() {
		//TODO
		return CNF.getFull();
	}

	/**
	 * Transforms the DNF into full Disjunctive Normal Form (CNF).
	 */
	public String toFullDNF() {
		//TODO
		return DNF.getFull();
	}

	/**
	 * Get the truth value of the expression with a list of truth values.
	 */
	public boolean getTruthValue(java.util.LinkedList<Boolean> truthVals) {
		return true;
	}

	/**
	 * Evaluate the expression to an option: Eval.Satisfiable, Eval.Tautology, Eval.Contradiction.
	 */
	public void evaluate() {
		//TODO
	}

	/* ****************** Operations for Accessing/Mutators on this Instance ****************** */
	/**
	 * Save the test expression.
	 */
	public boolean setExpression(String s) {
		if ( h.valid(s) ) {
			expr = s;
			atoms = h.countAtoms(s);
			truthTable = h.truthTable(atoms);
			return true;
		}
		return false;
	}
	
	/**
	 * Get the test expression.
	 */
	public String getExpression() {
		return expr;
	}
	
	/**
	 * Get the Conjunctive Normal Form (CNF).
	 */
	public String getCNF() {
		return CNF.get();
	}
	
	/**
	 * Get the Disjunctive Normal Form (DNF).
	 */
	public String getDNF() {
		return DNF.get();
	}

	/**
	 * Get the full Conjunctive Normal Form (CNF).
	 */
	public String getFullCNF() {
		return CNF.getFull();
	}

	/**
	 * Get the full Disjunctive Normal Form (DNF).
	 */
	public String getFullDNF() {
		return DNF.getFull();
	}

	/**
	 * Get the list of atoms in the propositional formula.
	 */
	public java.util.LinkedList<Character> getAtoms() {
		return atoms;
	}

	/**
	 * Get the evaluation: sat/tau/con.
	 */
	public Eval getEvaluation() {
		return evaluation;
	}

    public boolean isTautology() {
        return evaluation.equals(Eval.Tautology);
    }

    public boolean isSatisfiable() {
        return evaluation.equals(Eval.Satisfiable);
    }

    public boolean isContradiction() {
        return evaluation.equals(Eval.Contradiction);
    }
}