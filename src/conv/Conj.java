/**
 *
 * @author Mahdokht Afravi
 * @created Apr 27 F
 *
 * @modified May 03 R
 *
 * Transforms the expression into(full) Conjunctive Normal Form (CNF).
 */
package conv;

public class Conj {
    private Ops ops;
    private String expr;
    private String cnf;
    private String full;

    public Conj() {
        ops = new Ops();
        expr = "";
        cnf = "";
        full = "";
    }

    public String toCNF(String e) {
        expr = e;
        removeImplications();
        cnf = ops.applyDeMorgans(expr);
        return cnf;
    }

    private void removeImplications() {
        //TODO
    }

    public String get() {
        return cnf;
    }

    public String getFull() {
        return full;
    }
}