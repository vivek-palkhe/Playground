#include<bits/stdc++.h>
using namespace std;
struct Node{
	int data;
	
	struct Node* next;
	struct Node* prev;
	
	Node(int data){
		this->data=data;
		this->next=NULL;
		this->prev=NULL;
	}
	
};


void Merge(Node* root1,Node* root2){
	
	Node* NewRoot=NULL;
	Node* temp=NULL;
	Node* curr=NULL;
	
	while (root1!=NULL && root2!=NULL){
		
		//cout<<"Root1 :"<<root1->data<<" Root2 :"<<root2->data<<endl<<endl;
		
		if (root1->data <= root2->data){
			curr=root1;
			root1=root1->next;
			curr->next=NULL;
			curr->prev=NULL;
			
		}
		else{
			curr=root2;
			root2=root2->next;
			curr->next=NULL;
			curr->prev=NULL;
		}
		
		if (NewRoot==NULL){
			//cout<<"New Root Inserted :"<<curr->data<<endl;
			NewRoot=curr;
			temp=curr;
		}
		else{
			//cout<<"Root Inserted :"<<curr->data<<endl;
			temp->next=curr;
			curr->prev=temp;
			temp=curr;
		}
		
		
	}

	while (root1!=NULL){
		curr=root1;
		root1=root1->next;
		curr->next=NULL;
		curr->prev=NULL;
		if (NewRoot==NULL){
			NewRoot=curr;
			temp=curr;
		}
		else{
			temp->next=curr;
			curr->prev=temp;
			temp=curr;
		}
	}
	
	while (root2!=NULL){
		curr=root2;
		root2=root2->next;
		curr->next=NULL;
		curr->prev=NULL;
		if (NewRoot==NULL){
			NewRoot=curr;
			temp=curr;
		}
		else{
		temp->next=curr;
		curr->prev=temp;
		temp=curr;
	}
	}
	
		curr=NewRoot;
		while (curr!=NULL){
			cout<<curr->data<<"->";
			curr=curr->next;
		}
		cout<<"NULL";		
		cout<<endl;
	
	
	

}
int main()
{
	
	Node* root=NULL;
	Node* temp=NULL;
	int no;
	bool terminate=false;
	int size;
	cin>>size;
	while (size--){
		cin>>no;
		Node* r=new Node(no);
		if (root==NULL){
			root=r;
			temp=r;
		}
		else{
			temp->next=r;
			r->prev=temp;
			temp=r;
		}
	}
	
	Node* root1=NULL;
	cin>>size;
	while (size--){
		cin>>no;
		Node* r=new Node(no);
		if (root1==NULL){
			root1=r;
			temp=r;
		}
		else{
			temp->next=r;
			r->prev=temp;
			temp=r;
		}
	}
	
	
	Merge(root,root1);
	return 0;
}