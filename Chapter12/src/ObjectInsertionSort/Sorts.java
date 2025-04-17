package ObjectInsertionSort;

public class Sorts 
{
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
