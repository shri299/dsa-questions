//Insert a node at end of linked list

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
//	if (head==NULL)
//	{
//		temp->data = x;
//		temp->next = NULL;
//		head = temp;
//	}
//	else
//	{
//		temp->data = x;
//		temp->next = NULL;
//		Node* temp1 = head;
//		while (temp1->next!=NULL)
//		{
//			temp1 = temp1->next;
//		}
//		temp1->next = temp;
//	}
//}
//
//void Print()
//{
//	Node* A = head;
//	while (A!=NULL)
//	{
//		cout << A->data << " ";
//		A = A->next;
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
//	}
//	Print();
//}