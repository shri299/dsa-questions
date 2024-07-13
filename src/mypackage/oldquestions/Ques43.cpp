//Minimum swaps required bring elements less equal K together
//#include<iostream>
//using namespace std;
//
//int main()
//{
//	int arr[30];
//	int n;
//	cout << "enter number of elements" << endl;
//	cin >> n;
//	cout << "Enter hte elements" << endl;
//	for (int i = 0; i <n; i++)
//	{
//		cin >> arr[i];
//	}
//	int t = 0, temp;
//	int k;
//	cout << "enter the key" << endl;	
//	cin >> k;
//	for (int i = 0; i < n; i++)
//	{
//		if (arr[i] <= k)
//		{
//			temp = arr[i];
//			arr[i] = arr[t];
//			arr[t] = temp;
//
//			t++;
//		}
//	}
//	cout << "the new array is" << endl;
//	for (int i = 0; i < n; i++)
//	{
//		cout<<arr[i]<<" ";
//	}
//	cout << "the number of swaps are " << t;
//}