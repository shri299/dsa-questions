//sliding window practice
//Maximum Sum Subarray of size K
#include<iostream>
using namespace std;

int main()
{
    //cout<<"hello"<<endl;
    int arr[] = {1,2,3,4,5,6};
    int n = sizeof(arr)/sizeof(arr[0]);
    //cout<<"the size of array is "<<n<<endl;
    int k = 3;
    int i=0,j=0;
    int singlesum=0;
    int ans = INT16_MIN;
    while (j<n)
    {
        singlesum = singlesum + arr[j];
        if (j-i+1<k)
        {
            j++;
            continue;
        }
        if (j-i+1 == k)
        {
            ans = max(ans,singlesum);
            singlesum = singlesum - arr[i];
            i++;
            j++;
        }
        
        
    }

    cout<<"the answer is "<< ans;
    
    
}