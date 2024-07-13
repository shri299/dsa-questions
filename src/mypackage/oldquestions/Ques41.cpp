//Median of two sorted arrays of same size

//#include<iostream>
//#include<algorithm>
//using namespace std;


//int main()
//{
//	int arr1[] = { 1,12,15,26,38 };
//	int arr2[] = { 2,13,17,30,45 };
//	int n1 = sizeof(arr1) / sizeof(arr1[0]);
//	int n2 = sizeof(arr2) / sizeof(arr2[0]);
//	int n3;
//	int arr3[100];
//	for (int i = 0; i < n1; i++)
//	{
//		arr3[i] = arr1[i];
//	}
//	n3 = n1 + n2;
//	
//	int t = 0;
//	for (int i = n1; i < n1+n2; i++)
//	{
//		arr3[i] = arr2[t];
//		t++;
//	}
//	sort(arr3, arr3+n3);
//	if ((n1+n2)%2==0)
//	{
//		cout << (arr3[(n1 + n2) / 2] + arr3[((n1 + n2) / 2) - 1])/2 << endl;
//	}
//	else
//	{
//		cout << arr3[(n1 + n2 - 1) / 2] << endl;
//	}
//}

//use the merge sort logic

//int main()
//{
//	int arr1[] = { 1,12,15,26,38 };
//	int arr2[] = { 2,13,17,30,45 };
//	int n1 = sizeof(arr1) / sizeof(arr1[0]);
//	int n2 = sizeof(arr2) / sizeof(arr2[0]);
//	int arr3[100];
//	int i = 0, j = 0, k = 0;
//	while (i<n1 && j<n2)
//	{
//		if (arr1[i] <= arr2[j])
//		{
//			arr3[k] = arr1[i];
//			i++;
//			k++;
//		}
//		else {
//			arr3[k] = arr2[j];
//			j++;
//			k++;
//		}
//	}
//	while (i<n1)
//	{
//		arr3[k] = arr1[i];
//		k++;
//		i++;
//	}
//	while (j < n2)
//	{
//		arr3[k] = arr2[j];
//		k++;
//		j++;
//	}
//	int n3 = n1 + n2;
//	cout << (arr3[n3 / 2] + arr3[(n3 / 2) - 1]) / 2;
//}

//recursive method