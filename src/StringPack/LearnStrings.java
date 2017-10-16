package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	private String word = "";

	public LearnStrings(String s) 
	{
		setString(s);
	}// end of constructor

	
	public void setString(String s) 
	{
	  //do tests to make sure you are getting a legit input	
		word = s;
		//System.out.println("String entered is: " + word);
		String msg =  "String entered is: " + word;
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of setString (method)
	
	public char getFirstLetter() {
		
		return word.charAt(0);
		
	} // end of getFirstLetter (method)
	
	public int getLength() {
		
		return word.length();
	} // end of getLength (method)
	
	public char getLastLetter() {
		
		return word.charAt(word.length()-1);
		
	} // end of getLastLetter (method) 
	
	public String getMiddle() {
		
		return word.substring(1, word.length()-1);
		
	} // end of getMiddle (method)
	
	/*
	 * setters -- purpose is to control setting vars
	 * another name is "modifier" and older name is "mutator"
	 * 
	 * getter -- purpose is to retrieve vars also in a controlled way
	 * another name is "accessor" method
	 */
	
}// end of LearnStrings (class)
