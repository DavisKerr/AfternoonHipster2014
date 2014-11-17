package hipster.view;

import java.awt.Color;
import java.awt.Image;
import hipster.controller.HipsterAppController;
import javax.swing.*;

public class HipsterPanel extends JPanel
{
	
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here :D");
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 72, SpringLayout.WEST, this);
		hipsterImage = new JLabel("Davis Hipster", new ImageIcon(HipsterPanel.class.getResource("/hipster/view/images/davis_hipster.jpg")), JLabel.CENTER);
		
		albumBox = new JComboBox();
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
		
	}
	
	private void setupPanel()
	{
		
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.setSize(1000,300);
		this.add(albumBox);
		this.add(hipsterImage);
		this.add(albumLabel);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 126, SpringLayout.EAST, albumLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, hipsterImage, -131, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 0, SpringLayout.NORTH, hipsterImage);
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 175, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
		
		
	}
	
}
