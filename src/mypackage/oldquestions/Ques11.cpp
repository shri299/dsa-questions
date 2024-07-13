//Maximum Sum Subarray of size K

//#include<iostream>
//using namespace std;
//
//int mss(int s[], int n,int k)
//{
//	int sum=0;
//	int i = 0, j = 0;
//	while (j < n)
//	{
//		if (j-i+1<k)
//		{
//			j++;
//			//sum = sum + s[j];
//		}
//		else if (j-i+1==k)
//		{
//			sum = sum - s[i];
//			//find max sum
//			i++;
//			j++;
//		}
//		
//	}
//
//}
//
//int main()
//{
//	int s[] = { 100, 200, 300, 400 };
//	int k;
//	int n = sizeof(s) / sizeof(s[0]);
//	cout << "Enter the window size" << endl;
//	cin >> k;
//	cout << "The maximum sum is " << mss(s, n, k);
//}