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
    newnode->next = NULL;
  }
  else
  {
    newnode->next = head;
    head = newnode;
  }
}

void find_element(int value)
{
	int count = 1;
	struct node *ptr;
	ptr = head;
	while(ptr!=NULL)
	{
		if(count == value)
		{
			cout<<ptr->data<<" is the nth node element in the list";
			break;
		}
		ptr = ptr->next;
		count = count + 1;
	}
	if(ptr==NULL)
		cout<<"There is no nth node in the list";
}

int main()
{
  int value,fval;
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    else
      insert(value);
  }
  cout<<"Enter the nth node:\n";
  cin>>fval;
  find_element(fval);
  return 0;
}