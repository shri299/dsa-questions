#include<iostream>
#include<map>;
using namespace std;


int fact(int n)
{
	if (n==0)
	{
		return 1;
	}

	return n * fact(n - 1);
}

void count_pairs()
{
	int arr[3][2] = { {1,2},{2,4},{3,6} };
	map<int, int> m;
	for (int i = 0; i < 3; i++)
	{
		if (arr[i][0]>=arr[i][1])
		{
			m[arr[i][0] / arr[i][1]]++;
		}
		if (arr[i][0] < arr[i][1])
		{
			m[arr[i][1] / arr[i][0]]++;
		}
		
	}

	map<int, int>::iterator itr;
	int count = 0;
	int sub;

	for (itr = m.begin(); itr != m.end(); itr++)
	{
		if (itr->second>1)
		{
			sub = fact(itr->second - 2);
			count = count + (fact(itr->second))/sub;
		}
	}

	if (count==0)
	{
		cout << "No such pairs" << count << endl;
	}
	else
	{
		cout << count/2;
	}

}

int main()
{
	count_pairs();
}