//Reverse a linked list using recursion

//#include<iostream>
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
//	Node* temp1 = head;
//	while (temp1!=NULL)
//	{
//		cout << temp1->data << " ";
//		temp1 = temp1->next;
//	}
//}
//
//void reverse(Node* track)
//{
//	if (track->next==NULL)
//	{
//		head = track;
//		return;
//	}
//	reverse(track->next);
//	Node* q;
//	q = track->next;
//	q->next = track;
//	track->next = NULL;
//}
//
//
//int main()
//{
//	head = NULL;
//	int x, n;
//	cout << "Enter the number of elements" << endl;
//	cin >> n;
//	for (int i = 0; i < n; i++)
//	{
//		cout << "Enter " << i + 1 << "th element" << endl;
//		cin >> x;
//		Insert(x);
//	}
//	print();
//	cout << endl;
//	reverse(head);
//	print();
//}