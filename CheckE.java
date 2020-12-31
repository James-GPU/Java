import javax.swing.*;
/**
 * 
 * @author James Ng
 */
public class CheckE {
	public static void main (String[] args){
		String inputWord;
		int e = 0;
		int E = 0;
		// While loop is to repeat the process
		while (true){
			inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence."); // Asks the user to enter a sentence
			 boolean stop = inputWord.equalsIgnoreCase("STOP"); // If the user enters any version of stop, it'll exit the program
			 if (stop){
				 System.exit(0);// If the user enters any form of stop, the program exits
			 }
			
			 for (int i = 0;i < inputWord.length();i++){
				 if (inputWord.charAt(i) == 'e') e++; // If there is a lowercase e, we add one to the variable
				 if (inputWord.charAt(i) == 'E') E++; // If there is a uppercase e, we add one to the variable
				 }
				 //This is to show the e's and E's in the input
			JOptionPane.showMessageDialog(null, "Number of lower case e's: " + e + "\nNumber of upper case e's: " + E);
			e = 0;
			E = 0;
			 }
			 }
}