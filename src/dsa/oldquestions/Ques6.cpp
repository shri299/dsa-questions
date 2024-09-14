//Insert a node at the beginning of linked list

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
//void Print()
//{
//	Node* temp = head;
//	while (temp!=NULL)
//	{
//		cout << temp->data << " ";
//		temp = temp->next;
//	}
//}
//
//int main()
//{
//	head = NULL;
//	int x, n;
//	cout << "Enter number of elements to be inserted" << endl;
//	cin >> n;
//	for (int i = 0; i < n; i++)
//	{
//		cout << "enter" << i << "th element" << endl;
//		cin >> x;
//		Insert(x);
//		Print();
//		cout << endl;
//	}
//}