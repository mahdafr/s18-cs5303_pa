/**
 * 
 * @author Mahdokht Afravi
 * @modified Mar 22 R
 * 
 * This class handles input/output behavior.
 * 	Concerns: File and Console streams.
 */
package utils;

public class IO {
	java.util.Scanner sc;
	
	public IO() {
		sc = new java.util.Scanner(System.in);
	}

	/* ****************** Methods on Input ****************** */
	public int getInt() {
		return sc.nextInt();
	}

	public char getChar() {
		return sc.next().charAt(0);
	}
	
	public String getStr() {
		return sc.next();
	}
	
	/* ****************** Methods on Output ****************** */
	/** ************ Output 2D Arrays ************ */
	public void write(String message, int[][] matrix) {
		System.out.println(message + ":");
		for ( int i=0 ; i<matrix.length ; i++ ) {
			System.out.print("  ");
			for ( int j=0 ; j<matrix[i].length ; j++ )
				System.out.print(matrix[i][j] + " ");
		}
		System.out.println();
	}
	
	public void write(String message, char[][] matrix) {
		System.out.println(message + ":");
		for ( int i=0 ; i<matrix.length ; i++ ) {
			System.out.print("  ");
			for ( int j=0 ; j<matrix[i].length ; j++ )
				System.out.print(matrix[i][j] + " ");
		}
		System.out.println();
	}

	/** ************ Output 1D Arrays ************ */
	public void write(String message, int[] array) {
		System.out.print(message + ": ");
		for ( int i=0 ; i<array.length ; i++ )
			System.out.print(array[i]);
		System.out.println();
	}

	public void write(String message, char[] array) {
		System.out.print(message + ": ");
		for ( int i=0 ; i<array.length ; i++ )
			System.out.print(array[i]);
		System.out.println();
	}
	
	/** ************ Output Simple Types ************ */
	public void write(String message, int value) {
		System.out.println(message + ": " + value);
	}

	public void write(String message, char value) {
		System.out.println(message + ": " + value);
	}
	
	public void write(String message, boolean result) {
		System.out.println(message + ": " + result);
	}
	
	/** ************ Output a Message ************ */
	public void writeLn(String message) {
		System.out.println(message);
	}
	public void write(String message) {
		System.out.print(message);
	}
	
	/** ************ Output Stacks ************ */
	public void write(String message, java.util.Stack<Integer> stack) {
		System.out.print(message + ": ");
		while ( !stack.empty() )
			System.out.print(stack.pop());
		System.out.println();
	}
}