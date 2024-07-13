//reverse a linked list(Iterative method)

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
//void Reverse()
//{
//	Node* current = head; //for traversing
//	Node* prev = NULL;//for keeping address of next node
//	Node* nextt; //to store address of next node
//	while (current!=NULL)
//	{
//		nextt = current->next;
//		current->next = prev;
//		prev = current;
//		current = nextt;
//	}
//	head = prev;
//}
//
//void Insert(int x)
//{
//	Node* temp = new Node();
//		temp->data = x;
//		temp->next = head;
//		head = temp;
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
//int main()
//{
//		head = NULL;
//
//		int n, x;
//		cout << "Enter the number of elements" << endl;
//		cin >> n;
//		for (int i = 0; i < n; i++)
//		{
//			cout << "Enter " << i + 1 << "th element" << endl;
//			cin >> x;
//			Insert(x);
//		}
//		print();
//		cout << endl;
//		Reverse();
//		print();
//}