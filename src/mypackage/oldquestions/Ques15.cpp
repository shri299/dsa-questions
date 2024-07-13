//Decimal to Roman

#include<iostream>
using namespace std;

void DecimalToRoman(int n)
{
	int num[] = { 1,4,5,9,10,40,50,90,100,400,500,900,1000 };
	string roman[] = { "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M" };
	int i = 12;
	while (n!=0)
	{
		int div = n / num[i];
		int rem = n % num[i];
		while (div--)
		{
			cout << roman[i];
		}
		i--;
	}
}

int main()
{
	int n = 36;
	DecimalToRoman(n);
}