/**
 *
 * @author Mahdokht Afravi
 * @created May 03 R
 *
 * Operations for Other Behaviors for the Model.
 */
package utils;

public class Help {
    private java.util.LinkedList<Character> alphabet;
    private int[] alphabet_used = new int[26];

    public Help() {
        buildAlphabet();
        init();
    }

    private void init() {
        for ( int i =0 ; i<alphabet_used.length ; i++ )
            alphabet_used[i] = 0;
    }

    private java.util.LinkedList<Character> buildAlphabet() {
        alphabet = new java.util.LinkedList<>();
        alphabet.add('a'); alphabet.add('b'); alphabet.add('c'); alphabet.add('d'); alphabet.add('e');
        alphabet.add('f'); alphabet.add('g'); alphabet.add('h'); alphabet.add('i'); alphabet.add('j');
        alphabet.add('k'); alphabet.add('l'); alphabet.add('m'); alphabet.add('n'); alphabet.add('o');
        alphabet.add('p'); alphabet.add('q'); alphabet.add('r'); alphabet.add('s'); alphabet.add('t');
        alphabet.add('u'); alphabet.add('v'); alphabet.add('w'); alphabet.add('x'); alphabet.add('y');
        alphabet.add('z');
        return alphabet;
    }

    public boolean valid(String s) {
        init();
        boolean hasDash = false;
        int openParen = 0, closeParen = 0;
        //contains no other special characters: !, &, |, ->
        for ( int i=0 ; i<s.length() ; i++ ) {
            switch (s.charAt(i)) {
                //is this an acceptable character? a symbol or atom
                case '(':
                    openParen++;
                    continue;
                case ')':
                    closeParen++;
                    continue;
                case '!': //not
                case '&': //and
                case '|': //or
                    continue;
                case '-':
                    hasDash = true;
                    continue;
                case '>':
                    if ( !hasDash )
                        return false;
                    continue;
                default:
                    if ( !alphabet.contains(s.charAt(i)) )
                        return false;
            }
        }
        return ( openParen==closeParen && openParen>0 );
    }

    public java.util.LinkedList<Character> countAtoms(String e) {
        java.util.LinkedList<Character> atoms = new java.util.LinkedList<>();
        //how many of each atom in the expression?
        for ( int i=0 ; i<e.length() ; i++ )
            if ( !symbol(e.charAt(i)) )
                alphabet_used[alphabet.indexOf(e.charAt(i))]++;
        //save the list of atoms (we're using a, using b, using c, ... etc.
        for ( int i=0 ; i<alphabet_used.length ; i++ )
            if ( alphabet_used[i]>0 )
                atoms.add(alphabet.get(i));
        return atoms;
    }

    public boolean[][] truthTable(java.util.LinkedList<Character> atoms) {
        //build the truth table
        boolean[][] tt = new boolean[atoms.size()][(int) Math.pow(2,atoms.size())];
        for ( int i=0 ; i<tt.length ; i++ )
            for ( int j=0 ; j<tt.length ; j++ )
                tt[i][j] = false;
        return tt;
    }

    private boolean symbol(char c) {
        //check if this character
        switch ( c ) {
            case '(':
            case ')':
            case '!':
            case '|':
            case '&':
            case '-':
            case '>':
                return true;
            default:
                return false;
        }
    }
}