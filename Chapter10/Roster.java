package SkillBuilders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) 
	{

		File stuNameFile;
		Scanner input = new Scanner(System.in);
		String fileName;
		String firstName, lastName;
		int numStudents;

		/* obtain file name and number of students from user */
		
		//...
		//...
		//...
		//...

		try {
			
			/* write objects */
			
			FileOutputStream out = new FileOutputStream(stuNameFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for (int i = 0; i < /*?*/; i++) 
            {
				//..................
			}
			writeStu.close();
    		System.out.println("Data written to file.");

    		
    		/* read and display objects */
    		
			FileInputStream in = new FileInputStream(stuNameFile);
			ObjectInputStream readStuName = new ObjectInputStream(in);
			
			
			for (int i = 0; i < /*?*/; i++) 
			{
				//........
			}
			readStuName.close();
			
    	} catch (FileNotFoundException e) 
		{
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) 
		{
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) 
		{
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
    	}
	

	}

}
