//Boundry traversal in binary tree

#include<iostream>
#include<stack>
using namespace std;

struct Node
{
    int val;
    Node* left;
    Node* right;
    Node(int x)
    {
        val = x;
        left = NULL;
        right = NULL;
    }
};


void boundryTraversal(Node* root)
{
    //make a stack to store nodes
    stack<int> s;
    //traverse left excluding the leafs(top to bottom)
    //traverse leaf using inorder
    stack<int> ss;
    //traverse right excluding leaf(bottom to top)
    //pop from stack 2 push in stack 1
    //stack 1 will be the final answer
}

