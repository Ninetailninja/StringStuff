package three.view;

import javax.swing.JOptionPane;

/**
 * View object for the String Project.
 * @author MichaelT
 *
 */
public class StringView
{
	/**
	 * Shows the runtime error when a non-integer is typed into the JOptionPane input field.
	 */
	public void displayError()
	{
		int test;
		String temp;
		
		JOptionPane.showMessageDialog(null, "Let's watch the program crash!");
		temp = JOptionPane.showInputDialog("Type your favorite number!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + test);
	}
	
	public String getResponse()
	{
		//must have a value assigned to a variable to use it within a method.
		String response = null;
		
		response = JOptionPane.showInputDialog("Type a response in plz.");
		//local variable may not have been initialized.
		return response;
	}
	
	public void showPassedValue(String currentValue)
	{
		//Use formal parameter within a method.
		JOptionPane.showMessageDialog(null, currentValue);
	}
	
	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey " + first + "\nsays: " + second);
	}
	
	public void testStringMethods()
	{
//		String testString = "a String that should be longer than it is.";
//		JOptionPane.showMessageDialog(null, "The substring method test!");
//		JOptionPane.showMessageDialog(null, "We are going to go from the 7th letter in the test string");
//		JOptionPane.showMessageDialog(null, "The test string is \n" + testString);
//		JOptionPane.showMessageDialog(null, "The testString.substring(7) call gives us : \n" + testString.substring(7));
		testFirstMethod();
		testSecondMethod();
		testThirdMethod();
		
		
	}
	
	private void testFirstMethod()
	{
		String something = "";
		something = JOptionPane.showInputDialog("Type something in");
		JOptionPane.showMessageDialog(null, "I will tell you what the length of what you typed in is.");
		JOptionPane.showMessageDialog(null, "The length of " +something+ " is " +something.length());
		
	}
	
	private void testSecondMethod()
	{
		String input = "";
		input = JOptionPane.showInputDialog("Type something in and we will convert to all uppercase");
		JOptionPane.showMessageDialog(null, "Here it is : " +input.toUpperCase());
	}
	
	private void testThirdMethod()
	{
		String aString = "once upon a merry go round.";
		JOptionPane.showMessageDialog(null, "We have the string: " +aString + "\n We will replace all the letters o with the letter i.");
		JOptionPane.showMessageDialog(null, aString.replace("o", "i"));
		
	}
}
