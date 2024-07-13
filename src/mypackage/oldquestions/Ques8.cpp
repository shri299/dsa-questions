//delete at nth position

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
//void deleteNth()
//{
//	int t;
//	cout << "Enter the position to be deleted" << endl;
//	cin >> t;
//	Node* temp;
//	temp = head;
//	Node* varr;
//	for (int i = 0; i < t-2; i++)
//	{
//		temp = temp->next;
//	}
//	varr = temp->next;
//	temp->next = varr->next;
//	cout << endl;
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
//	deleteNth();
//}