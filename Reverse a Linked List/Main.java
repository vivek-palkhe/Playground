#include<iostream>
using namespace std;
		struct Node{
			int data;
			struct Node* next;
			Node(int data){
				this->data=data;
				this->next=NULL;
			}
		};

		void solve(Node* root)
		{
			if (root==NULL){
				return ;
			}
			solve(root->next);
			cout<<root->data<<" ";
		}
		int main(){
			
			int no;
			Node* root=NULL;
			Node* temp=NULL;
			cin>>no;
			if (no<0){
                  cout<<"No value has been inserted"<<endl;
			}else{
				Node* r=new Node(no);
					root=r;
					temp=r;
				
				while(1){
					cin>>no;
					if (no<0){
						break;
					}
					Node* r=new Node(no);
					
						temp->next=r;
						temp=r;
					
				}
			
			
			cout<<"Original Order:"<<endl;
			temp=root;
			while(root!=NULL){
				cout<<root->data<<" ";
				root=root->next;
			}
			cout<<endl;
			cout<<"Reverse Order:"<<endl;
			solve(temp);
			}
		}