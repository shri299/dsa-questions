//Given an array A[] and a number x, check for pair in A[] with sum as x (aka Two Sum)

#include<iostream>
#include<algorithm>
using namespace std;

//Sort and apply two pointer approach(0(logn))

int main()
{
	int arr[] = { 0,-1,2,-3,1,-2,-4 };
	int x = -2;
	int n = sizeof(arr) / sizeof(arr[0]);
	sort(arr, arr + n);
	int l = 0, r = n - 1;
	while (l<r)
	{
		if (arr[l] + arr[r] == x)
		{
			cout << arr[l] << " " << arr[r] << endl;
			l++;
			r--;
		}
		else if (arr[l]+arr[r]>x)
		{
			r--;
		}
		else
		{
			l++;
		}
	}
}
