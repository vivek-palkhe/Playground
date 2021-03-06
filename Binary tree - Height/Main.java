#include<bits/stdc++.h>
using namespace std;
struct Node{
	int data;
	struct Node* left;
	struct Node* right;
	Node(int v){
      this->data=v;
    }
};
Node* insert(Node* root,int Data){
	if (root==NULL){
		root=new Node(Data);
	}
	else if (Data>root->data){
		root->right= insert(root->right,Data);
	}
	else{
		root->left =insert(root->left,Data);
	}
	
	return root;
	
}
int Height(Node* root){
	if (root==NULL){
		return 0;
	}
	int left=Height(root->left);
	int right=Height(root->right);
	
	return 1+max(left,right);
}

int main()
{

int no;
int val;
Node* root=NULL;
bool terminate=false;
while (1){
	cin>>val;
	if (root==NULL && val<0){
		terminate=true;
		break;
	}
	if (val<=0 && root!=NULL){
		break;
	}
	
	root=insert(root,val);
}


cout<<"Height of the tree is "<<Height(root);

	
	return 0;
	
}