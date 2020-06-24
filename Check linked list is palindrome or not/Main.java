#include<bits/stdc++.h>
#include<string>
using namespace std;
struct Node{
	char data;
	
	struct Node* next;
	struct Node* prev;
	
	Node(char a){
		this->data=a;
		this->next=NULL;
		this->prev=NULL;
	}
};
bool isPallindrome(Node* root1,Node* root2){
	if (root1==root2){
		return true;
	}
	while (true){
		
		if (root1->data!=root2->data){
			return false;
		}
		if (root1->next==root2 && root1->next->data==root2->data){
			//cout<<"Root 1 : "<<root1->data<<" Root 2 : "<<root2->data<<endl;
			return true;
		}
		else if (root1==root2 && root1->data==root2->data){
			//cout<<"Root 1 : "<<root1->data<<" Root 2 : "<<root2->data<<endl;
			return true;
		}
		else{
			//cout<<"Root 1 : "<<root1->data<<" Root 2 : "<<root2->data<<endl;
			root1=root1->next;
			root2=root2->prev;
		}
	}
	return true;
}
int main()
{
	string str;
	cin>>str;
	int length=str.length();
	Node* root=NULL;
	Node* temp=NULL;
	Node* curr=NULL;
	
	for (int i=0;i<length;i++){
		
		if (root==NULL){
			root=new Node(str[i]);
			temp=root;
		}
		else{
			curr=new Node(str[i]);
			temp->next=curr;
			curr->prev=temp;
			temp=curr;
		}
	}
	temp=root;
	curr=temp;
	Node* tt;
	while (curr!=NULL){
		tt=curr;
		while (tt!=NULL){
				cout<<tt->data<<endl;
				tt=tt->prev;
		}
		if (isPallindrome(temp,curr)){
			cout<<"Is Palindrome"<<endl<<endl;
		}
		else{
			cout<<"Not Palindrome"<<endl<<endl;
		}
		curr=curr->next;
	}
	
	return 0;
}