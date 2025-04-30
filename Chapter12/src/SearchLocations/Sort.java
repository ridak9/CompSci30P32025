package SearchLocations;

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

}
