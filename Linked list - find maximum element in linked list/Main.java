#include<iostream>
using namespace std;

struct node
{
  int data;
  struct node *next;
}*head=NULL;

void insert(int value)
{
  struct node *newnode = new node;
  newnode->data = value;
  if(head == NULL)
  {
    head = newnode;
    newnode->next=NULL;
  }
  else
  {
    newnode->next = head;
    head = newnode;
  }
}

void maximum()
{
  int max = 0;
  struct node *ptr;
  ptr = head;
  while(ptr!=NULL)
  {
    if(ptr->data >= max)
      max = ptr->data;
    ptr = ptr->next;
  }
  cout<<max;
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
  maximum();
  return 0;
}