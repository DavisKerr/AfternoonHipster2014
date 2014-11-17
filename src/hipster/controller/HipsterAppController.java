package hipster.controller;

import java.awt.Image;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterAppController 
{

private HipsterFrame baseFrame;
private Hipster selfHipster;
private String [] myAlbums;
	
	public HipsterAppController()
	{
		selfHipster = new Hipster("Davis", 38);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		
		selfHipster.setHipsterAlbums(myAlbums);
		
	}
	
	private void buildAlbumArray()
	{
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

}
