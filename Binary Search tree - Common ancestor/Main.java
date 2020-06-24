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
int glo;
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
bool find(Node* root,int data){
	if (root==NULL){
		return false;
	}
	if (root->data==data){
		return true;
	}
	return (find(root->left,data) || find(root->right,data));
}
int CommonAnsister(Node* root,int a,int b){
	if (root==NULL){
		return true;
	}
	if (root->data==a || root->data==b){
		return root->data;
	}
	if (a>root->data && b>root->data){
		return CommonAnsister(root->right,a,b);
	}
	else if(a<root->data && b<root->data){
		return CommonAnsister(root->left,a,b);
	}
	else if (max(a,b)>root->data && min(a,b)<root->data){
		return root->data;
	}
	/*else if ()
	bool left=find(root,a);
	bool right=find(root,b);
	
	if (left && right)
	{
		return root->data;
	}*/
	
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
cout<<"Enter the value of n1 and n2:"<<endl;
int a,b;
cin>>a>>b;

cout<<"Common ancestor of "<<a<<" and "<<b<<" is "<<CommonAnsister(root,a,b);
	
	return 0;
	
}