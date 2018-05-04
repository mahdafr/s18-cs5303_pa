/**
 *
 * @author Mahdokht Afravi
 * @created Apr 27 F
 *
 * @modified May 03 R
 *
 * Shared operations for transformations between (full) CNF/DNF.
        */
package conv;

public class Ops {
    private String dm = "";

    public Ops() { }

    public String applyDeMorgans(String e) {
        boolean foundNeg = false;
        for ( int i=0 ; i<e.length() ; i++ ) {
            System.out.println(dm + " " + e + i);
            switch ( e.charAt(i) ) {
                case '(':
                case ')':
                    dm += e.charAt(i)+ "";
                    continue;
                case '!':
                    foundNeg = !foundNeg; //switch states
                    continue;
                case '-':
                case '>':
                    dm += e.charAt(i) + "";
                    continue;
                default:
                    if ( !foundNeg )
                        dm += "!" + e.charAt(i);
                    else {
                        foundNeg = !foundNeg;
                        dm += e.charAt(i) + "";
                    }
            }
        }
        return dm;
    }
}