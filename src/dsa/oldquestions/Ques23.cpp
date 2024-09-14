//Given an array A[] and a number x, check for pair in A[] with sum as x (aka Two Sum)

#include<iostream>
using namespace std;

//Brute force approach O(n square)

int main()
{
	int arr[] = { 0,-1,2,-3,1 };
	int x = -2;
	int n = sizeof(arr) / sizeof(arr[0]);
	for (int i = 0; i < n-1; i++)
	{
		for (int j = i+1; j < n; j++)
		{
			if (arr[i]+arr[j]==x)
			{
				cout << arr[i] << " " << arr[j] << endl; ;
			}
		}
	}
}