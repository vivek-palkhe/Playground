#include<iostream>
using namespace std;

struct node
{
  int data;
  struct node *next;
}*head = NULL;

void insert(int value)
{
  struct node *newnode = new node;
  newnode->data=value;
  if(head==NULL)
  {
    head = newnode;
    newnode->next = head;
  }
  else
  {
    struct node *ptr;
    ptr = head;
    while(ptr->next!=head)
    {
      ptr=ptr->next;
    }
    ptr->next=newnode;
    newnode->next=head;
    //head = newnode;
  }
}

void display()
{
  struct node *ptr;
  ptr = head;
  while(ptr->next!=head)
  {
    cout<<ptr->data<<"\n";
    ptr=ptr->next;
  }
  cout<<ptr->data;
}
int main()
{
  int value;
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    else
      insert(value);
  }
  display();
  return 0;
}