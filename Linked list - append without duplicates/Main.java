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

void solve(Node* root){
	
	Node* rootPrev=root;
	Node* roottemp=rootPrev;
	
	Node* end=NULL;
	Node* temp=NULL;
	
	while (roottemp!=NULL){
		root=roottemp;
		while (root->next!=NULL){
			root=root->next;
		}
		end=root;
		root=roottemp;
		//cout<<root->data<<endl;
		while (end!=root){
			//cout<<root->data<<" : "<<end->data<<endl;
			if (root->data==end->data){
				temp=end;
				end=end->prev;
				
				if (temp->next==NULL){
					end->next=NULL;
				}
				else{
					temp->next->prev=end;
					end->next=temp->next;
				}
			}
			else{
				end=end->prev;
			}
		}
		roottemp=roottemp->next;
	}
	
	temp=rootPrev;
	while (temp!=NULL){
		cout<<temp->data<<endl;
		temp=temp->next;
	}
	
}
int main(){
	int val;
	bool terminate=false;
	Node* root=NULL;
	Node* temp=NULL;
	Node* r=NULL;
	
	
	while (true){
		cin>>val;
		if (root==NULL && val<0){
			terminate=true;
			break;
		}
		if (root!=NULL && val<0){
			break;
		}
		r=new Node(val);
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
	if (!terminate){
		solve(root);
	}
	return 0;
}