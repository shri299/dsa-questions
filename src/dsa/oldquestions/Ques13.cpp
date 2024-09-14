//Implement a stack using linked list

//#include<iostream>
//
//using namespace std;
//
//struct Node
//{
//	int data;
//	Node* next;
//};
//Node* top = NULL;
//
//void push(int x)
//{
//	Node* temp = new Node();
//	temp->data = x;
//	temp->next = top;
//	top = temp;
//}
//
//void pop()
//{
//	if (top==NULL)
//	{
//		return;
//	}
//	Node* temp;
//	temp = top;
//	top = top->next;
//	free(temp);
//}
