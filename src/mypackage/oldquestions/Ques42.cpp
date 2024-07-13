//Find minimum number of merge operations to make an array palindrome

//#include<iostream>
//using namespace std;
//
//void GetMergeCount(int arr[], int n)
//{
//	int ans = 0, i = 0, j = n - 1;
//	while (i<=j)
//	{
//		if (arr[i] == arr[j])
//		{
//			i++;
//			j--;
//		}
//		else if (arr[i]>arr[j])
//		{
//			j--;
//			arr[j] = arr[j] + arr[j + 1];
//			ans++;
//		}
//		else
//		{
//			i++;
//			arr[i] = arr[i] + arr[i - 1];
//			ans++;
//		}
//	}
//	cout << "the count is " << ans;
//}
//
//int main()
//{
//	int arr[30];
//	int n;
//	cout << "Enter the value on n" << endl;
//	cin >> n;
//	cout << "Enter the elements" << endl;
//	for (int i = 0; i < n; i++)
//	{
//		cin >> arr[i];
//	}
//	GetMergeCount(arr, n);
//}