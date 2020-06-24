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
	if(head==NULL)
	{
		head = newnode;
		newnode->next = NULL;
	}
	else
	{
		struct node *ptr;
		ptr = head;
		while(ptr->next!=NULL)
			ptr=ptr->next;
		newnode->next=NULL;
		ptr->next=newnode;
		//head = newnode; 
	}
}

void delete_node()
{
	if(head==NULL)
		cout<<"No elements";
	else
	{
		struct node *temp;
		temp = head;
		head = temp->next;
		delete(temp);
	}
}

void disp()
{
	struct node *ptr;
	ptr = head;
	while(ptr!=NULL)
	{
		cout<<ptr->data<<"\n";
		ptr = ptr->next;
	}
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
		{
			insert(value);
		}
	}
	//disp();
	delete_node();
	disp();
}