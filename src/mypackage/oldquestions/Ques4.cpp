//Insert at nth position in linked list

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
//	Node* temp;
//	temp = head;
//	while (temp!=NULL)
//	{
//		cout << temp->data << " ";
//		temp = temp->next;
//	}
//}
//
//void InsertatT(int t, int tx)
//{
//	Node* temp = new Node();
//	temp->data = tx;
//	Node* temp1;
//	Node* varr;
//	temp1 = head;
//	for (int i = 0; i < t-2; i++)
//	{
//		temp1 = temp1->next;
//	}
//	varr = temp1->next;
//	temp1->next = temp;
//	temp->next = varr;
//
//}
//
//int main()
//{
//	head = NULL;
//	int n, x, t,tx;
//	cout << "Enter number of elements to be inserted" << endl;
//	cin >> n;
//	for (int i = 0; i < n; i++)
//	{
//		cout << "Enter " << i+1 << "th element" << endl;
//		cin >> x;
//		Insert(x);
//	}
//	print();
//	cout << "Enter the position to be inserted" << endl;
//	cin >> t;
//	cout << "Enter the element to be inserted" << endl;
//	cin >> tx;
//	if (t==1)
//	{
//		Insert(tx);
//	}
//	else if (t>n)
//	{
//		cout << "Invalid Position" << endl;
//	}
//	else
//	{
//		InsertatT(t, tx);
//	}
//	print();
//}