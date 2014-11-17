package hipster.model;

/**
 * Hipster object for the Hipster Project 2014
 * @author Davis Kerr
 *@version 1.1 11/13/14
 */

public class Hipster 
{
	
	/**
	 * The name of the "Hipster"
	 */
	private String name;
	/**
	 * The age of the "Hipster"
	 */
	private int age;
	/**
	 * The hipster album.
	 */
	private String [] hipsterAlbums;
	
	/**
	 * constructs the Hipster with default name, age, and albums.
	 */
	public Hipster()
	{
		
		name = "";
		age = 99;
		hipsterAlbums = null;
		
	}
	
	
	/**
	 * Constucts the hipster with name and age given from anouther class.
	 * @param name what the hipster is called
	 * @param age how old the hipster is.
	 */
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setHipsterAlbums(String[] hipsterAlbums) 
	{
		this.hipsterAlbums = hipsterAlbums;
	}
}
