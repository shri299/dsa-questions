//level order traversals
//Iterative method

#include<iostream>
#include<queue>
using namespace std;

struct Node
{
	int data;
	Node* leftChild;
	Node* rightChild;
	Node(int val) //this is constructor hence has name of the struct and has no return type :-)
	{
		data = val;
		leftChild= NULL;
		rightChild = NULL;
	}
};

void levelOrderTraversal(Node* root)
{
	if (root==NULL)
	{
		return;
	}
	queue<Node*> q;
	q.push(root);
	while (!q.empty())
	{
		Node* current = q.front();
		cout << current->data << " ";
		if (current->leftChild!=NULL)
		{
			q.push(current->leftChild);
		}
		if (current->rightChild != NULL)
		{
			q.push(current->rightChild);
		}
		q.pop();
	}
}
void main()
{

	Node* root = new Node(1);
	root->leftChild = new Node(2);
	root->rightChild = new Node(3);
	root->leftChild->leftChild = new Node(4);
	root->leftChild->rightChild = new Node(5);
	root->rightChild->leftChild = new Node(6);
	root->rightChild->rightChild = new Node(7);
	levelOrderTraversal(root);

}