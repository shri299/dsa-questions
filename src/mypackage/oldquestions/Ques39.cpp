//cyclic rotate array

//#include<iostream>
//
//using namespace std;
//
//int main()
//{
//	int arr[] = { 4,9,5,6,3,22 };
//	int n = sizeof(arr) / sizeof(arr[0]);
//	int x = arr[n - 1];
//	int i = n;
//	while (i>= 2)
//	{
//		arr[i - 1] = arr[i - 2];
//		i--;
//	}
//
//	arr[0] = x;
//
//	for (int i = 0; i < n; i++)
//	{
//		cout << arr[i] << " ";
//	}
//}