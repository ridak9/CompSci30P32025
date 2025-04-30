package friends;



import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class FriendsDB 
{
	//Declare a private ArrayList of Friends
	//A variable to keep track of number of friends you can call it numFriends
		
	
	public FriendsDB() 
	{
		File friendsFile = new File("...we need the file directory.......");
		//Initialize the friends ArrayList
		//Declare an Object of a Friend class you can call it aFriend
		
		/* Create a new file for friends if one does not exist */

		if (!/* ........ */) 
		{
			try 
			{
				//Create new file

				System.out.println("There are no friend records in your database.");
			} 
			catch (IOException e) {
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}

    		//initialize numFriends to zero
    	} 
		else 
		{	
			/* load existing friends into array */
			
			try 
			{
				FileInputStream in = new FileInputStream(/*...... */);
				ObjectInputStream readFriends = new ObjectInputStream(/*.....*/);
				/* numFriends */ = (int)readFriends.readInt();

				if (/* numFriends */ == 0) 
				{
					System.out.println("There are no existing friend records in your database.");
				} 
				else 
				{
					for (int i = 0; i < /* numFriends */; i++) 
					{
						aFriend = (Friend)readFriends.readObject();

						//Now aFriend needs to be added to the ArrayList of friends

					}
				}
				readFriends.close();
			} 
			catch (FileNotFoundException e) {
				System.out.println("File could not be found.");
    			System.err.println("FileNotFoundException: " + e.getMessage());
    		} 
			catch (IOException e) {
				System.out.println("Problem with input/output.");
    			System.err.println("IOException: " + e.getMessage());
    		} 
			catch (ClassNotFoundException e) {
				System.out.println("Class could not be used to cast object.");
    			System.err.println("ClassNotFoundException: " + e.getMessage());
    		}
    	}
	}


	
	public void addFriend() 
	{
		/*
		 
		In this method we need to a newFriend object
		The newFriend object should pass on to the Friend class constructor:
		A first name
		A last name
		A telephone number
		and an email address

		After tne newFriend has been created then add them to friends ArrayList

		Increment the numFriends to plus one



		 */
		
	}

	
	
	public void deleteFriend(String fName, String lName) 
	{
		
		//Create a variable to keep track of the friend index that we want to delete

		//We need to create a Friend object that will have the names that are passed on to this method

		//Once the Friend object is created then we can find this object's index(location) in the friends ArrayList
		
		//Check to see if the friendIndex is greater than -1 since this will assure as that there is a friend in the list
				//direct the friends ArrayList to remove this friendIndex
				//display that the friend record has been removed
				//update your numFriends variable to decrease by one
		
		//Otherwise
				//Display that this friend record does not exist
	 	
	}
	
	
	
	public void displayFriends(int order) 
	{
		Friend retrievedFriend;
		
		/* sort list of friends and then display */

		if (order == 0) 
		{
			//Call SelectionSorts to sort the last names the friends in the ArrayList
			
			for (int friendData = 0; friendData < friends.size(); friendData++) 
			{
				//retrieve a friend from the friends ArrayList

				System.out.println(retrievedFriend.displayByLast());
			}
		} 
		else 
		{
			//Call SelectionSorts to sort the first names the friends in the ArrayList
			
			for (int friendData = 0; friendData < friends.size(); friendData++) 
			{
				//retrieve a friend from the friends ArrayList

				System.out.println(retrievedFriend.displayByFirst());
			}
		}
	}
	
	
	
	public void findFriend(String fName, String lName) 
	{
		/* This method is similar to the algorithm in deleteFriend()
		 
		Create a variable to keep track of the friend index that we want to find

		We need to create a Friend object that will have the names that are passed on to this method

		Once the Friend object is created then we can find this object's index(location) in the friends ArrayList
		
		Check to see if the friendIndex is greater than -1 since this will assure as that there is a friend in the list
				retrieve the friend from the friends ArrayList by assigning to a Friend variable such as foundFriend
				display that the friend has been found and their information
				
		
		Otherwise
				Display that this friend record does not exist
			
		 */	
		
		
	}
	
	
	/**
	 * Friend records are written to a file for storage.
	 * pre: none
	 * post: friend records have been written to acctFile.
	 */
	public void update() 
	{
		//Create a File object with the file direcotry
				
		try 
		{
			
			FileOutputStream out = new FileOutputStream(/* pass the new File variable name */);
			ObjectOutputStream writeFriends = new ObjectOutputStream(out);
			writeFriends.writeInt(numFriends);
			
			for (/* Walk across the friends ArrayList, the data type here is Object and you can use for example an object variable frnd */)
			{
				writeFriends.writeObject(frnd);
			}
			writeFriends.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} 
		catch (IOException e) 
		{
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} 
	}
}