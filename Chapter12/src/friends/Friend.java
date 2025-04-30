package friends;



import java.io.*;

public class Friend implements ComparableNames, Serializable 
{
	//We need the attributes of a Friend object such as firstName....
	//........
	//....
	//....
	
	

	public Friend(/* String ............ */) 
	{
		//...........
	}
	

	//Overload constructor with just the first name and last name
	public Friend(/* ........ */) 
	{
		//............	
	}


	
	private String firstAndLast() 
	{
		//........		
	}
	
	
	
	public String getLast() 
	{
		//......
	}


	
	public String getFirst() 
	{
		//......
	}


	/** 
	 * Displays a friend last name first.
	 * pre: none
	 * post: Friend data has been displayed, last name first.
	 */
	public String displayByLast() 
	{
		//....

		/* Shive, Almo
		 * 403-128-7498
		 * SAlmo@roadrunner.com
		 */
	 }


	
	public String displayByFirst() 
	{
		//....

		
	}


	public int compareToFirstName(Object f) 
	{
		Friend testObj = (Friend)f;
		
	 	return(firstName.compareToIgnoreCase(testObj.getFirst()));
	}

	public int compareToLastName(Object f) {
		Friend testObj = (Friend)f;
		
	 	return(lastName.compareToIgnoreCase(testObj.getLast()));
	}

	public boolean equals(Object f) 
	{
		//..............
	}



	
	public String toString() 
	{
		//.........
	}
}
