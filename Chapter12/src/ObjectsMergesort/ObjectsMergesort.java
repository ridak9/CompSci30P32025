package ObjectsMergesort;

import java.util.Scanner;

public class ObjectsMergesort 
{
	public static void displayArray(String[] array)
	{
		for(int i =0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("\n");
	}
	
	public static void sortObjectArray()
	{
		Scanner input = new Scanner(System.in);
		int numObjects;
		String[] test;
		String item;
		
		System.out.println("Enter number of objects: ");
		numObjects = input.nextInt();
		
		//Populate Array
		test = new String[numObjects];
		
		for(int i = 0; i < test.length; i++)
		{
			System.out.println("Enter a string: ");
			item = input.next();
			test[i] = item;
		}
		System.out.println("Unsorted Array: ");
		displayArray(test);
		
		Sort.mergesort(test, 0, test.length-1);
		
		System.out.println("Sorted Array: ");
		displayArray(test);
	}
	
	public static void main(String[] args) 
	{
		sortObjectArray();
	}

}
