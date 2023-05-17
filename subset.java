import java .util.*;

 class subset {
	
	static int maxDiff(int []arr, int n)
	{
		int SubsetSum_1 = 0, SubsetSum_2 = 0;
		for (int i = 0; i <= n - 1; i++)
		{
			boolean isSingleOccurrence = true;
			for (int j = i + 1; j <= n - 1; j++)
			{
				if (arr[i] == arr[j])
				{
					isSingleOccurrence = false;
					arr[i] = arr[j] = 0;
					break;
				}
			}
			if (isSingleOccurrence)
			{
				if (arr[i] > 0)
					SubsetSum_1 += arr[i];
				else
					SubsetSum_2 += arr[i];
			}
		}
		
		return Math.abs(SubsetSum_1 - SubsetSum_2);
	}
	

	static public void main (String[] args)
	{
		int []arr = { 4, 2, -3, 3, -2, -2, 8 };
		int n = arr.length;
		
		System.out.println("Maximum Difference = "
							+ maxDiff(arr, n));
	}
}
