//First Negative Number in every Window of Size K 

#include<iostream>
using namespace std;

//my approach

//void firstNegative(int a[], int n, int k)
//{
//	int i = 0, j = 0;
//	while (j<n)
//	{
//		if (n-i<k)
//		{
//			break;
//		}
//		if (j - i + 1 < k)
//		{
//			if (a[j]<0)
//			{
//				cout << a[j] << " ";
//				i++;
//				j = i;
//				continue;
//			}
//			j++;
//		}
//		else
//		{
//			i++;
//			j = i;
//		}
//	}
//}

//brute force

//void firstNegative(int a[], int n, int k)
//{
//	for (int i = 0; i <=n-k; i++)
//	{
//		for (int j = i; j < i + k; j++)
//		{
//			if (a[j]<0)
//			{
//				cout << a[j] << " ";
//				break;
//			}
//		}
//	}
//}

//Third method is making a list to store the negative number.  and as soon as it hits windows size pop the 1st element from list(also check if list is empty)

	//thirdmethod()
        //while(j<n)
            //if(j-i+1<k)
                //j++
                //if(arr[j]<0)
                    //push the element in list
              //elseif(j-i+1==k)
                      //check if the list is empty and if yes print zero
                      //pop and print first element in list and update the begin pointer
                      //update i and j

int main()
{
	int a[] = { 1,-2,-3};
	int n = sizeof(a) / sizeof(a[0]);
	int k = 3;
	//firstNegative(a, n, k);
}