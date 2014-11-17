package hipster.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import hipster.controller.HipsterAppController;

import javax.swing.*;

/**
 * The panel for the gui. This displays what you see.
 *@author Davis Kerr
 *@version 1.2
 */
public class HipsterPanel extends JPanel
{
	
	/**
	 * the HipsterAppController class.
	 */
	private HipsterAppController baseController;
	/**
	 * The combo box.
	 */
	private JComboBox albumBox;
	/**
	 * The label that displays information based on the albumBox selection
	 */
	private JLabel albumLabel;
	/**
	 * Shows an image
	 */
	private JLabel hipsterImage;
	/**
	 * The layout style.
	 */
	private SpringLayout baseLayout;
	
	/**
	 * The constructor of the panel.
	 * @param baseController The controller.
	 */
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController; // links the panel to the controller
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here :D");
		//sets the hipsterImage label to be a picture.
		hipsterImage = new JLabel("Davis Hipster", new ImageIcon(HipsterPanel.class.getResource("/hipster/view/images/davis_hipster.jpg")), JLabel.CENTER);
		
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 84, SpringLayout.EAST, albumBox);
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * sets up the index for the combo box
	 */
	private void setupComboBox()
	{
		//references the controller. the controller references the Hipster class. The hipster class references the hipsterAlbums.
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
		
	}
	
	/**
	 * Sets up the elements in the panel.
	 */
	private void setupPanel()
	{
		
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.setSize(1000,300);
		this.add(albumBox);
		this.add(hipsterImage);
		this.add(albumLabel);
		
	}
	
	/**
	 * Positions the elements.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, hipsterImage, -131, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 175, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 110, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 78, SpringLayout.WEST, this);
	}
	
	/**
	 * Sets up the listeners. 
	 */
	private void setupListeners()
	{
		//The albumBox listener detects when it is changed.
		albumBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent selected) 
			{
				
				if(albumBox.getSelectedIndex() == 0)//if the array index = 0
				{
					albumLabel.setText("You are truly a hipster");
				}
				else if(albumBox.getSelectedIndex() <= 2)//if the array index is 1 or 2
				{
					albumLabel.setText("You may have some hipster quality");
				}
				else //if the array index is 3
				{
					albumLabel.setText("NOT A HIPSTER");
				}
				
			}
			
			
			
		});
		
	}
	
}
