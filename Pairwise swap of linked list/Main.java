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
void Pairwise(Node* root){
	
	Node* ptr1,*ptr2;
	
	ptr1=root;
	ptr2=ptr1->next;
	
	while(ptr2!=NULL){
		int temp;
		temp=ptr1->data;
		ptr1->data=ptr2->data;
		ptr2->data=temp;		
		
		if (ptr1->next==NULL||ptr2->next==NULL){
			break;
		}
		
		ptr1=ptr1->next->next;
		ptr2=ptr2->next->next;
		
	}	
	
	ptr1=root;
	while(ptr1!=NULL){
		cout<<ptr1->data<<endl;
		ptr1=ptr1->next;
	}
	
	
}
int main()
{
	int val;
	Node* root=NULL;
	Node* curr=NULL;
	bool terminate=false;
	while(1){
		cin>>val;
		if (val<0 && root!=NULL){
			break;
		}
		if (val<0 && root==NULL){
			terminate=true;
			break;
		}
		Node* temp=new Node(val);
		
		if (root==NULL){
			root=temp;
			curr=root;
		}
		else{
			curr->next=temp;
			temp->prev=curr;
			curr=temp;
		}
		
	}
	if (terminate){
		cout<<"-1";
	}else{
	Pairwise(root);
	}
	return 0;
}