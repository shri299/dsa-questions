/#include<iostream>
//#include<String>
////#include<unordered_map>
//using namespace std;
//
//int firstcodition(string s, int n, int c[])
//{
//	//s[i]==s[n-i+1]
//	int count = 0;
//	for (int i = 0; i < n / 2; i++)
//	{
//		if (s[i] != s[n - i - 1])
//		{
//			if (c[i]<=c[n-1-i])
//			{
//				count = count + c[i];
//			}
//			else
//			{
//				count = count + c[n-1-i];
//			}
//		}
//	}
//	return count;
//}
//
//int secondcodition(string s, int n,int c[])
//{
//	//s[i]==s[n-i+1]
//	int count = 0;
//	for (int i = 0; i < n / 2; i++)
//	{
//		if (s[i + 1] != s[n - i - 1])
//		{
//			if (c[i + 1] <= c[n - i - 1])
//			{
//				count = count + c[i + 1];
//			}
//			else
//			{
//				count = count + c[n-1-i];
//			}
//		}
//	}
//	return count;
//}
//
//int thirdcodition(string s, int n,int c[])
//{
//	//s[i]==s[n-i+1]
//	int count = 0;
//	for (int i = 0; i < n / 2; i++)
//	{
//		if (s[i] != s[n - i - 2])
//		{
//			if (c[i] <= c[n - i - 2])
//			{
//				count = count + c[i];
//			}
//			else
//			{
//				count = count + c[n-i-2];
//			}
//			
//		}
//	}
//	return count;
//}
//
//int fourthcodition(string s, int n,int c[])
//{
//	//s[i]==s[n-i+1]
//	int count = 0;
//	for (int i = 0; i < n / 2; i++)
//	{
//		if (s[i + 1] != s[n - i - 1])
//		{
//			if (c[i + 1] <=c[n - i - 1])
//			{
//				count = count + c[i + 1];
//			}
//			else
//			{
//				count = count + c[n-1-i];
//			}
//		}
//	}
//	return count;
//}
//
//void findmin(int countone, int counttwo)
//{
//	if (countone <= counttwo)
//	{
//		cout << countone;
//	}
//	else
//	{
//		cout << counttwo;
//	}
//}
//
//void twodrome(int first, int second, int third, int fourth)
//{
//	if (first == 0 && second == 0)
//	{
//		cout << " two drome";
//		return;
//	}
//	if (third == 0 && fourth == 0)
//	{
//		cout << " two drome";
//		return;
//	}
//	findmin(first + second, third + fourth);
//}
//
//int main()
//{
//	string s = "dsdt{lifcl";
//	int c[] = { 5,7,9,8,1,2,8,5,4,5 };
//	int n = s.size();
//	int first = firstcodition(s, n,c);
//	int second = secondcodition(s, n,c);
//	int third = thirdcodition(s, n,c);
//	int fourth = fourthcodition(s, n,c);
//
//	twodrome(first, second, third, fourth);
//}