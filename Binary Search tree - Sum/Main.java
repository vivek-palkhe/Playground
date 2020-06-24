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
int sumt(Node* root){
	if (root==NULL){
		return 0;
	}
	int left=sumt(root->left);
	int right=sumt(root->right);
	
	return root->data+left+right;
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


cout<<"Sum of all nodes are "<<sumt(root);

	
	return 0;
	
}