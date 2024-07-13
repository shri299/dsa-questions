//Binary Search - Search element in a circular sorted array

int circularSearch(int a[], int n, int x)
{
	int low = 0, high = n - 1;
	while (low<=high)
	{
		int mid = (low + high) / 2;
		if (x==a[mid])
		{
			return mid;
		}
		if (a[mid]<=a[high]) //right half is sorted
		{
			if (x > a[mid] && x <= a[high])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		else
		{
			if (a[low]<=x && x<a[mid])
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
	}
	return -1;
}


