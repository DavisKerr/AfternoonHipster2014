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

	/**
	 * returns the name
	 * @return name
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * sets the name.
	 * @param name The hipsters name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	
	/**
	 * Returns the age of the Hipster.
	 * @return age
	 */
	public int getAge() 
	{
		return age;
	}
	
	/**
	 * sets the age of the Hipster.
	 * @param age the age of the Hipster
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	/**
	 * returns the value of hipsterAlbums.
	 * @return hipsterAlbums
	 */
	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}
	
	
	/**
	 * sets the array values.
	 * @param hipsterAlbums The array of albums used for the combo box.
	 */
	public void setHipsterAlbums(String[] hipsterAlbums) 
	{
		this.hipsterAlbums = hipsterAlbums;
	}
	
	
	
}
