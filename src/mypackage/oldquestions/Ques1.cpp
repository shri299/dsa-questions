//print linked list using recursion

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
//void print(Node* track)
//{
//	if (track == NULL)
//	{
//		return;
//	}
//	cout << track->data << " ";
//	print(track->next);
//}
//
//void printReverse(Node* track)
//{
//	if (track==NULL)
//	{
//		return;
//	}
//	printReverse(track->next);
//	cout << track->data << " ";
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
//		cout << "Enter " << i + 1 << "th elements" << endl;
//		cin >> x;
//		Insert(x);
//	}
//	print(head);
//	cout << endl;
//	printReverse(head);
//}