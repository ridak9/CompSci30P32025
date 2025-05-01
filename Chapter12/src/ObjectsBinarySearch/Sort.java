package ObjectsBinarySearch;

import java.util.ArrayList;

public class Sort 
{
	private static void merge(Comparable[] items, int start, int mid, int end)
	{
		Comparable[] temp = new Comparable[items.length];
		
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;
		
		while(!(pos1 > mid && pos2 > end))
		{
			if((pos1 > mid) || ((pos2 <= end) && (items[pos2].compareTo(items[pos1]) < 0)))
			{
				temp[spot] = items[pos2];
				pos2 += 1;
			}
			else
			{
				temp[spot] = items[pos1];
				pos1 += 1;
			}
			spot += 1;
		}
		
		//Copy values from temp back to item
		for(int i = start; i <= end; i++)
		{
			items[i] = temp[i];
		}
	}
	
	//Sorts items[start....end] is sorted low to high
	
	public static void mergesort(Comparable[] items, int start, int end)
	{
		if(start < end)
		{
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
		}
	}
	
	public static void selectionSort(ArrayList<Double> items)
	{
		Double element1, element2;
		
		for(int index = 0; index < items.size(); index++)
		{
			for(int subIndex = index; subIndex < items.size(); subIndex++)
			{
				element1 = items.get(index);
				element2 = items.get(subIndex);
				
				if(element2.compareTo(element1) < 0)
				{
					items.set(index, element2);
					items.set(subIndex, element1);
				}
			}
		}
		
		
	}
	
	public static void insertionSort(Comparable[] items)
	{
		Comparable temp;
		int previousIndex;
		
		for(int index = 1; index < items.length; index++)
		{
			temp = items[index];
			previousIndex = index - 1;
			
			while((items[previousIndex].compareTo(temp) > 0) && (previousIndex > 0))
			{
				items[previousIndex + 1] = items[previousIndex];
				previousIndex = previousIndex - 1;
			}
			if(items[previousIndex].compareTo(temp) > 0)
			{
				items[previousIndex + 1] = items[previousIndex];
				items[previousIndex] = temp;
			}
			else
			{
				items[previousIndex + 1] = temp;
			}
		}
	}

}
