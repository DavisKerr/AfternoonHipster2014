package hipster.controller;

/**
 * The runner. This calls the controller. 
 *@author Davis Kerr
 *@version 1.0
 */
public class HipsterRunner 
{

	/**
	 * Main method. The program starts here.
	 * @param args No idea what this does :/
	 */
	public static void main(String[] args) 
	{
		
		HipsterAppController myApp = new HipsterAppController();
		myApp.start();
		
	}

}
