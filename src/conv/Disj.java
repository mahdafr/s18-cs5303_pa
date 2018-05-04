/**
 *
 * @author Mahdokht Afravi
 * @created Apr 27 F
 *
 * @modified May 03 R
 *
 * Transforms the expression into (full) Disjunctive Normal Form (DNF).
 */
package conv;

public class Disj {
    private Ops ops;
    private String expr;
    private String dnf;
    private String full;

    public Disj() {
        ops = new Ops();
        expr = "";
        dnf = "";
        full = "";
    }

    public String toDNF(String c) {
        expr = c;
        dnf = ops.applyDeMorgans(expr);
        return dnf;
    }

    public String get() {
        return dnf;
    }

    public String getFull() {
        return full;
    }
}