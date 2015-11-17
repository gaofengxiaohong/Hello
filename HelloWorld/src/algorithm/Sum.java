package algorithm;

public class Sum {
	public static boolean TwoElementsSum(int[] numbers, int x)
	{
		int begin = 0, end = numbers.length - 1;
		while(begin < end)
		{
			int value = numbers[begin] + numbers[end];
			if(value < x)
			{
				begin++;
			}
			else if(value > x)
			{
				end--;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}
