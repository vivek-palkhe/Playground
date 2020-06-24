#include<iostream>
using namespace std;

struct node
{
  int data;
  struct node *left;
  struct node *right;
};

struct node *create_node(int val)
{
  struct node *newnode = new node;
  newnode->data = val;
  newnode->left = newnode->right = NULL;
  return newnode;
}

struct node *insert_node(struct node *node, int val)
{
  if(node == NULL)
    return create_node(val);
  if(val < node->data)
    node->left = insert_node(node->left, val);
  else if(val > node->data)
    node->right = insert_node(node->right, val);
  return node;
}

void inorder(struct node *root) {
   if (root != NULL) {   
      inorder(root->left);
      cout<<root->data<<" ";
      inorder(root->right);
   }
} 

void printPreorder(struct node* node) 
{ 
    if (node == NULL) 
        return; 
    cout << node->data << " "; 
    printPreorder(node->left);  
    printPreorder(node->right); 
}  

void printPostorder(struct node* node) 
{ 
    if (node == NULL) 
        return; 
    printPostorder(node->left); 
    printPostorder(node->right); 
    cout << node->data << " "; 
} 
int main()
{
  struct node *root = NULL;
  int n,value;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>value;
    root = insert_node(root , value);
  }
  cout<<"In-Order Traversal: ";
  inorder(root);
  cout<<"\nPre-Order Traversal: ";
  printPreorder(root);
  cout<<"\nPost-Order Traversal: ";
  printPostorder(root);
  return 0;
}