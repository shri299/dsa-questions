//Implement a stack using array

//#include<iostream>
//using namespace std;
//
//#define MAX_SIZE 101
//int a[MAX_SIZE];
//int top = -1;
//
//void push(int x)
//{
//	if (top==MAX_SIZE-1)
//	{
//		cout << "Overflow Error" << endl;
//		return;
//	}
//	top++;
//	a[top] = x;
//}
//
//void pop()
//{
//	if (top==-1)
//	{
//		cout << "Stack is already empty" << endl;
//	}
//	top--;
//}
//
//int Top()
//{
//	return a[top];
//}
//
//void print()
//{
//	for (int i = 0; i <= top; i++)
//	{
//		cout << a[i] << " ";
//	}
//	cout << endl;
//}
//
//int main()
//{
//	push(12); print();
//	push(13); print();
//	push(14); print();
//	push(15); print();
//	pop();    print();
//	push(16); print();
//}