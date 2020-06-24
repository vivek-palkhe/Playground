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
Node* reverse (Node *head, int k)  
{  
    Node* current = head;  
    Node* next = NULL;  
    Node* prev = NULL;  
    int count = 0;  
      
    while (current != NULL && count < k)  
    {  
        next = current->next;  
        current->next = prev;  
        prev = current;  
        current = next;  
        count++;  
    }  
    if (next != NULL)  
    head->next = reverse(next, k);  
  
    return prev;  
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
		int val;
		cin>>val;
	Node* ans=reverse(root,val);
	
	while(ans!=NULL){
		cout<<ans->data<<endl;
		ans=ans->next;
	}
	}
	return 0;
}
