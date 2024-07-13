//Minimum number of eleemnts to be deleted in an array so that all remainig are same

#inclue<iostream>
#include<unordered_map>

int main()
{
int a[] = {1,1,2,3,2,5,1,2,5,,3,3,1,1};
int n = 13;
unordered_map<int,int> m;
for(inti=0;i<n;i++)
{
m[a[i]]++;
}
unordered_map<int,int> :: iterator itr;
maxvalue = INT_MIN;
for(itr=m.begin();itr!=m.end();itr++)
{
maxvalue = max(INT_MIN,itr->second);
}
cout<<n-maxvalue;
}