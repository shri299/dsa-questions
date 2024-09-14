//Pre order, post order and in order traversals
//recursive method

#include<iostream>
using namespace std;

struct Node
{
	int data;
	Node* leftChild;
	Node* rightChild;
	Node(int val)
	{
		data = val;
		leftChild = NULL;
		rightChild = NULL;
	}
};

void preorder(Node* root)
{
	if (root == NULL)
	{
		return;
	}
	cout << root->data << " ";
	preorder(root->leftChild);
	preorder(root->rightChild);
}

void inorder(Node* root)
{
	if (root == NULL)
	{
		return;
	}
	inorder(root->leftChild);
	cout << root->data << " ";
	inorder(root->rightChild);
}

void postorder(Node* root)
{
	if (root == NULL)
	{
		return;
	}
	postorder(root->leftChild);
	postorder(root->rightChild);
	cout << root->data << " ";
	
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
	preorder(root);
	inorder(root);
	postorder(root);

}