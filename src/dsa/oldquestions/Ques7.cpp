//delete element from end of linked list

//#include<iostream>
//
//using namespace std;
//
//struct Node
//{
//	int data;
//	Node* next;
//};
//Node* head;
//
//void Insert(int x)
//{
//	Node* temp = new Node();
//	temp->data = x;
//	temp->next = head;
//	head = temp;
//}
//
//void print()
//{
//	Node* temp1;
//	temp1 = head;
//	while (temp1!=NULL)
//	{
//		cout << temp1->data << " ";
//		temp1 = temp1->next;
//	}
//}
//
//void deleteEnd(int n)
//{
//	Node* temp;
//	temp = head;
//	for (int i = 0; i < n-2; i++)
//	{
//		temp = temp->next;
//	}
//	temp->next = NULL;
//	cout << "\n" << "Elements after deletion" << endl;
//	print();
//}
//
//int main()
//{
//	head = NULL;
//	int n, x;
//	cout << "Enter the number of elements" << endl;
//	cin >> n;
//	for (int i = 0; i < n; i++)
//	{
//		cout << "Enter " << i + 1 << "th element" << endl;
//		cin >> x;
//		Insert(x);
//	}
//	print();
//	deleteEnd(n);
//}