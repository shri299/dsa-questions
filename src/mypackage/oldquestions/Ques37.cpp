//Move all negative numbers to beginning and positive to end with constant extra space

//#include<iostream>
//
//using namespace std;
//
//int main()
//{
//	int arr[] = { 1,-23,-46,2,67,-44,98,-55 };
//	int n = sizeof(arr) / sizeof(arr[0]);
//	int temp,t=0;
//	for (int i = 0; i < n; i++)
//	{
//		if (arr[i] >= 0)
//		{
//			continue;
//		}
//		else
//		{
//			temp = arr[t];
//			arr[t] = arr[i];
//			arr[i] = temp;
//			t++;
//		}
//	}
//
//	for (int i = 0; i < n; i++)
//	{
//		cout << arr[i] << " ";
//	}
//}