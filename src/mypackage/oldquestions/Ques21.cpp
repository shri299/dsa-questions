#include<iostream>
#include<set>
using namespace std;

int main()
{
	int a[] = { 11,1,13,21,3,7 };
	int b[] = { 11,3,17,1 };
	int m = 6, n = 4;
	set<int> s;
	for (int i = 0; i < m; i++)
	{
		s.insert(a[i]);
	}
	for (int i = 0; i < n; i++)
	{
		if (s.find(b[i]) == s.end())
		{
			cout << "Not a subset";
			exit(0);
		}
	}
	cout << "It is a subset";
}