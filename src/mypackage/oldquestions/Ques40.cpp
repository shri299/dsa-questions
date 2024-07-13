//kadane algorithm

//#include<iostream>
//
//using namespace std;
//
//int main()
//{
//	int arr[] = { 1,-3,23,5,-11,-4,12 };
//	int n = sizeof(arr) / sizeof(arr[0]);
//	int sum = 0, ans = 0;
//	for (int i = 0; i < n; i++)
//	{
//		if (sum + arr[i] > 0)
//		{
//			sum = sum + arr[i];
//		}
//		else
//		{
//			sum = 0;
//		}
//		ans = max(sum, ans);
//	}
//	cout << ans;
//}