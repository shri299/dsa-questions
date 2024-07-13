void postorder(Node* root)
{
	stack<Node*> s1;
	stack<Node*> s2;
	s1.push(root);
	Node* current;
	while (!s1.empty())
	{
		
		
		current = s1.top();
		s2.push(current);
		s1.pop();
		if (current->left!=NULL)
		{
			s1.push(current->left);
		}
		if (current->right != NULL)
		{
			s1.push(current->right);
		}
		
	}
	while (!s2.empty())
	{
		cout << s2.top()->data << " ";
		s2.pop();
	}
}


int main()
{
	Node* root = new Node(1);
	root->right = new Node(7);
	root->left = new Node(2);
	root->left->left = new Node(3);
	root->left->right = new Node(4);
	root->left->right->left = new Node(5);
	root->left->right->right = new Node(6);
	//preorder(root);
	//inorder(root);
	postorder(root);
}