package three.controller;
import three.view.StringView;

/**
 * String Controller for the third project dealing with Strings in java
 * @author MichaelT
 *
 */
public class StringController
{
	private StringView myView;
	
	/**
	 * Creates a StringController object initializing all values.
	 */
	public StringController()
	{
		myView = new StringView();
	}
	
	/**
	 * Starts the view using the displayError method from StringView.
	 */
	public void start()
	{
		String aResponse = "Reponse from something";
		//myView.displayError();
		//myView.showPassedValue(myView.getResponse());
		//myView.moreInteractive("Michael", aResponse);
		myView.testStringMethods();
		
	}
}
