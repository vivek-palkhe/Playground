#include<iostream>
#include<string>
using namespace std;
struct node
{
  int data;
  struct node* next;
  
  node(int data)
  {
    this->data=data;
    this->next=NULL;
  }
};

int main()
{
  int no;
  cin>>no;
  if(no>=0)
  {
    node* root=new node(no);
    node* temp=root;
    
    while(1)
    {
      cin>>no;
      if(no<0)
      {
        break;
      }
      node* temp2 = new node(no);
      temp->next=temp2;
      temp=temp2;
    }
    temp=root;
    while(temp!=NULL)
    {
      cout<<temp->data<<endl;
      temp=temp->next;
    }
  }
  return 0;
}