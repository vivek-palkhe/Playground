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
void findMin(Node* root){
	
	Node* ptr1;
	Node* ptr2;
	ptr1=root;
	cout<<"Linked list before removal of duplicates"<<endl;
	while(ptr1!=NULL){
		cout<<ptr1->data<<endl;
		ptr1=ptr1->next;
	}
	ptr1=root;
	ptr2=ptr1->next;
	while (ptr1->next!=NULL){
		if (ptr1->data==ptr2->data){
			Node* t=NULL;
			
			if (ptr2->next==NULL){
				ptr2->prev->next=ptr2->next;
				//cout<<"Pointer 1 :"<<ptr1->data<<"  Pointer2 :"<<ptr2->data<<endl;
				t =ptr2;
				if (ptr1==NULL){
					break;
				}
				ptr1=ptr1->next;
				if (ptr1==NULL){
					break;
				}
				//cout<<"Pointer 1 :"<<ptr1->data<<"  Pointer2 :"<<ptr2->data<<endl;
				ptr2=ptr1->next;
				//cout<<"Pointer 1 :"<<ptr1->data<<"  Pointer2 :"<<ptr2->data<<endl;
				
			}else{
				ptr2->next->prev=ptr2->prev;
				ptr2->prev->next=ptr2->next;
				//cout<<"ptr2->next->prev :"<<ptr2->next->prev->data<<" ptr2->prev->next :"<<ptr2->prev->next->data<<endl;
				t=ptr2;
				//cout<<"Current ptr2 :"<<ptr2->data;
				ptr2=ptr2->next;
				//cout<<"Next ptr2 :"<<ptr2->data;
			}
			delete(t);
		}
		else {
			if (ptr2->next==NULL){
				ptr1=ptr1->next;
				ptr2=ptr1->next;
			}
			else{
				ptr2=ptr2->next;
			}
		}
		
	}
	
	ptr1=root;
	cout<<"Linked list after removal of duplicates"<<endl;
	
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
	findMin(root);
	}
	return 0;
}