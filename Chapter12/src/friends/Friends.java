package friends;



 import java.io.*;
 import java.util.ArrayList;
 import java.util.Scanner;

 
 public class Friends 
 {

	public static void main(String[] args) 
	{
		Friend myFriend;
		FriendsDB friendsList = new FriendsDB();
		/*
		 * a number of variables required to be delcared and initialized
		 * 
		 */


		/* Display to the user a menu that will allowed them to add, remove, and display friends */


		do {
				/*
				* 
				* 
				* 
				*/

			if (choice == 1) 
			{
				System.out.print("Last Name (0) or First Name (1) order? ");
				order = input.nextInt();
				friendsList.displayFriends(order);
			} 
			else if (choice == 2) 
			{
				//...
			} 
			else if (choice == 3) 
			{
				//..............
			} 
			else if (choice == 4) 
			{
				//...........
			}
		} while (choice != 0);

		
		/* write friend information to a file */
		//.....
	}
}