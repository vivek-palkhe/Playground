#include<bits/stdc++.h>
using namespace std;
struct Node{
	int data;
	struct Node* next;
	Node(int Data){
		this->data=Data;
	}
};
void print(Node* root){
	while(root!=NULL){
		cout<<root->data<<" ";
		root=root->next;
	}
	
}
int main()
{
	int val;
	bool terminate=false;
	Node* root=NULL;
	Node* curr=NULL;
	
	while (1){
		
		cin>>val;
		if (root==NULL && val<0){
			terminate=true;
			break;
		}
		else if (root!=NULL && val<0){
			break;
		}
		Node* nn=new Node(val);
		
		if (root==NULL){
			root=nn;
			curr=root;
		}
		else{
			curr->next=nn;
			curr=nn;
		}
		
	}
	
	if (!terminate){
		print(root);
	}
	return 0;
}