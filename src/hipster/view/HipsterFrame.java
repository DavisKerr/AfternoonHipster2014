package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterAppController;

/**
 * The frame of the panel
 * @author Davis Kerr
 *@version 1.0
 */
public class HipsterFrame extends JFrame
{
	/**
	 * References the panel
	 */
	private HipsterPanel basePanel;
	
	/**
	 * Constructs the frame and its elements.
	 * @param baseController the controller
	 */
	public HipsterFrame(HipsterAppController baseController)
	{
		
		this.basePanel = new HipsterPanel(baseController);
		
		setupFrame();
		
	}
	
	/**
	 * sets up the frame and sets its properties
	 */
	private void setupFrame() 
	{
		
		this.setContentPane(basePanel);
		this.setSize(1000, 400);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
}
