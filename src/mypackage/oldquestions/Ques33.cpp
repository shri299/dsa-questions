//Write a program to reverse an array or string

//#include<iostream>

//using namespace std;

//method one

		//int main()
		//{
		//	int a[] = { 1,2,3,4,5 };
		//	int b[5];
		//
		//	for (int i = 0; i < 5; i++)
		//	{
		//		b[i] = a[5 - i-1];
		//	}
		//
		//	for (int i = 0; i < 5; i++)
		//	{
		//
		//		cout << b[i] << endl;
		//
		//	}
		//}

//method two

		//void reversearr(int a[])
		//{
		//	int temp;
		//	for (int i = 0; i < 3; i++)
		//	{
		//		
		//
		//		temp = *(a + i);
		//		*(a + i) = *(a + 5 - 1 - i);
		//		*(a + 5 - 1 - i) = temp;
		//
		//	}
		//	
		//}
		//
		//int main()
		//{
		//	int a[] = { 1,2,3,4,5 };
		//	
		//	reversearr(a);
		//
		//	for (int i = 0; i < 5; i++)
		//	{
		//		cout << a[i] << endl;
		//	}
		//}

//method three

		//void reversearr(int a[],int start,int end)
		//{

		//	int temp;
		//	while (start<end)
		//	{
		//		temp = a[start];
		//		a[start] = a[end];
		//		a[end] = temp;
		//		start++;
		//		end--;

		//	}
	
		//}

		//int main()
		//{
		//	int a[] = { 1,2,3,4,5,6,7 };

		//	int n = sizeof(a) / sizeof(a[0]);

		//	reversearr(a, 0, n - 1);

		//	for (int i = 0; i < n; i++)
		//	{
		//		cout << a[i] << endl;
		//	}
		//}


//method four

		//void reversearr(int a[], int start, int end)
		//{
		//	int temp;

		//	if (start>=end)
		//	{
		//		return;
		//	}

		//	temp = a[start];
		//	a[start] = a[end];
		//	a[end] = temp;

		//	reversearr(a, start + 1, end - 1);
		//}

		//int main()
		//{
		//	int a[] = { 1,2,3,4,5,6,7 };
		//	int n = sizeof(a) / sizeof(a[0]);

		//	reversearr(a, 0, n - 1);

		//	for (int i = 0; i < n; i++)
		//	{
		//		cout << a[i] << endl;
		//	}
		//}