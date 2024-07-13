//Union and Intersection of two Linked Lists
//using hashing

//#include<iostream>
//#include<set>
//using namespace std;
//
//struct Node
//{
//	int data;
//	Node* next;
//};
//Node* head;
//Node* head1;
//Node* unionhead;
//Node* intersectionhead;
//
//void InsertFirst(int x)
//{
//	Node* temp = new Node();
//	temp->data = x;
//	temp->next = head;
//	head = temp;
//}
//
//void InsertSecond(int x)
//{
//	Node* temp = new Node();
//	temp->data = x;
//	temp->next = head1;
//	head1 = temp;
//}
//
//void InsertUnion(int x)
//{
//	Node* temp = new Node();
//	temp->data = x;
//	temp->next = unionhead;
//	unionhead = temp;
//}
//
//void FindUnionAndIntersection()
//{
//	Node* temp;
//	temp = head;
//	set<int> s;
//	while (temp!=NULL)
//	{
//		s.insert(temp->data);
//		temp = temp->next;
//	}
//	temp = head1;
//	while (temp!=NULL)
//	{
//		if (s.find(temp->data) == s.end())
//		{
//			s.insert(temp->data);
//		}
//		else
//		{
//			InsertUnion(temp->data);
//		}
//	}
//
//	//print set
//	set<int>::iterator itr;
//	for (itr=s.begin();itr!=s.end();itr++)
//	{
//		cout << *itr << endl;
//	}
//
//}
//
//int main()
//{
//	head = NULL;
//	head1 = NULL;
//	unionhead = NULL;
//	intersectionhead = NULL;
//	//Insert in first linked list
//	InsertFirst(10);
//	InsertFirst(15);
//	InsertFirst(4);
//	InsertFirst(20);
//	//Insert in second linked list
//	InsertSecond(8);
//	InsertSecond(4);
//	InsertSecond(2);
//	InsertSecond(10);
//
//	FindUnionAndIntersection();
//	
//}
