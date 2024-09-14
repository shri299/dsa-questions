//First Negative Number in every Window of Size K

#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;

int main()
{
    queue<int> v;
    int arr[] = {2,-1,-3,6,-2,-5,12,43};
    int n = sizeof(arr)/sizeof(arr[0]);
    int i=0,j=0;
    int k=3;
    while (j<n)
    {
        if (arr[j]<0)
        {
            v.push(arr[j]);
        }
        
        if(j-i+1<k)
        {
            j++;
        }
        else if (j-i+1==k)
        {
            if (v.empty())
            {
                i++;
                j++;
            }
            else
            {
                if (arr[i]<0)
                {
                    cout<<v.front()<<" ";
                    v.pop();
                    i++;
                    j++;
                }
                else
                {
                    cout<<v.front()<<" ";
                    i++;
                    j++;
                }
                
                
            }
            
            
        }
        
    }
    

}