//Given an array A[] and a number x, check for pair in A[] with sum as x (aka Two Sum)

#include<iostream>
//#include<algorithm>
#include<unordered_set>
using namespace std;

//Hashing Approach

int main()
{
    int a[] = { 1, 4, 45, 6, 10, 8 };
    int x = 16;
    int n = sizeof(a) / sizeof(a[0]);
    unordered_set<int> s;
    int temp;
    /*for (int i = 0; i < n; i++)
    {
        temp = x - a[i];
        if (s.find(temp)==s.end())
        {
            s.insert(a[i]);
        }
        else
        {
            cout << a[i] << " " << temp;
        }
    }*/
    for (int i = 0; i < n; i++)
    {
        s.insert(a[i]);
    }
    for (int i = 0; i < n; i++)
    {
        temp = x - a[i];
        if (s.find(temp) != s.end())
        {
            cout << a[i] << " " << temp<<endl;
            s.erase(a[i]);
            s.erase(temp);
            
        }
    }
}
