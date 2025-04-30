package friends;



 import java.util.ArrayList;

 public class SelectionSorts 
 {


	public static void sortFirst(ArrayList items) 
	{

		for (int index = 0; index < items.size(); index++) 
		{
			for (int subIndex = index; subIndex < items.size(); subIndex++) 
			{
				ComparableNames item1 = (ComparableNames) items.get(subIndex);
				ComparableNames item2 = (ComparableNames) items.get(index);

				if (item1.compareToFirstName(item2) < 0) 
				{
					ComparableNames temp = item2;
					items.set(index, item1);
					items.set(subIndex, temp);
				}
			}
		}
	}


	
	public static void sortLast(/* ????? */) 
	{
		//...............................
		
	}
}
