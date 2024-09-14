//Find whether an array is subset of another array
//Method 1(Brute Force)

//#include<iostream>
//using namespace std;
//
//int main()
//{
//	int arr1[] = { 11,5,34,8,55,23,63,21 };
//	int arr2[] = { 55,34,21,45 };
//	int count = 4;
//	for (int i = 0; i < 8; i++)
//	{
//		for (int j = 0; j < 3; j++)
//		{
//			if (arr1[i]==arr2[j])
//			{
//				count--;
//			}
//		}
//	}
//	if (count==0)
//	{
//		cout << "It is a subset";
//	}
//	else
//	{
//		cout << "Not a subset";
//	}
//}