package algorithm;

public class BinarySearch {

	public static int Search(int[] numbers, int key)
	{
		int begin = 0, end = numbers.length - 1;
		int mid;
		while(begin <= end)
		{
			mid = (begin + end) / 2;
			if(numbers[mid] > key)
			{
				end = mid - 1;
			}
			else if (numbers[mid] < key)
			{
				begin = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
