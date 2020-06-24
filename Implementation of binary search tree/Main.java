#include<iostream>
using namespace std;
struct node {
   int data;
   struct node *left;
   struct node *right;
};
struct node *createNode(int val) {
   struct node *temp =  (struct node *)malloc(sizeof(struct node));
   temp->data = val;
   temp->left = temp->right = NULL;
   return temp;
}
void inorder(struct node *root) {
   if (root != NULL) {   
      inorder(root->left);
      cout<<root->data<<" ";
      inorder(root->right);
   }
} 
struct node* insertNode(struct node* node, int val) {   
   if (node == NULL) return createNode(val);
   if (val < node->data)
      node->left  = insertNode(node->left, val);
   else if (val > node->data)
      node->right = insertNode(node->right, val);   
   return node;
}
int main() {
   struct node *root = NULL;
  int value;
  cout<<"Tree values are:\n";
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    else
      root = insertNode(root,value);
  }
   //cout<<" ";
   inorder(root);
   return 0;
}