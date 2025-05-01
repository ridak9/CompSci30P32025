package ObjectsBinarySearch;

public class Searches 
{
	public static int binarySearch(Comparable[] items, int start, int end, Comparable goal) {

		if (start > end) {
			return(-1);
		} 
		else 
		{
			int mid = (start + end) / 2;
			if (goal.compareTo(items[mid]) == 0) 
			{
				return(mid);
			} 
			else if (goal.compareTo(items[mid]) < 0) 
			{
				return(binarySearch(items, start, mid-1, goal));
			} 
			else 
			{
				return(binarySearch(items, mid+1, end, goal));
			}
		}
	}

}
