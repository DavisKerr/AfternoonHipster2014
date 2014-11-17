package hipster.controller;

import java.awt.Image;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * The controller for the hipster program.
 * @author Davis Kerr
 *@version 1.0
 */
public class HipsterAppController 
{
/**
 * The frame for the gui
 */
private HipsterFrame baseFrame;
/**
 * The hipster object found in the Hipster class.
 */
private Hipster selfHipster;
/**
 * An array called myAlbums to hold info.
 */
private String [] myAlbums;
	
	/**
	 * Constuctor that constucts the hipster,the frame, and starts the buildAlbumArray method.
	 */
	public HipsterAppController()
	{
		// Creates a new hipster with the name of davis and an age of 17:
		selfHipster = new Hipster("Davis", 17); 
		buildAlbumArray();
		selfHipster.setHipsterAlbums(myAlbums);
		baseFrame = new HipsterFrame(this);
	}
	
	/**
	 * sets up the Hipster album in the self hipster.
	 */
	public void start()
	{
		
		
		
	}
	
	/**
	 * Builds (fills) the array.
	 */
	private void buildAlbumArray()
	{
		//three ways to build an array:
		
		//kind of hipster
		myAlbums = new String[4];
		myAlbums[0] = "I AM HIPSTER";
		myAlbums[1] = "THIS IS HIPSTER!!!";
		myAlbums[2] = "My name is hipster. THE hipster";
		myAlbums[3] = "Studio HIPSTER";
		//hipster
		String [] otherAlbums = {"stuff", "other", "way for", "hipster array"};
		
		//Ultra hipster
		String [] wierdAlbums;
		
		wierdAlbums = new String [] {"sfdsagfsad", "dsfasgg", "fsfsgs", "dfgs"};
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

}
