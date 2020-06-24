#include <iostream>
using namespace std;
struct Node { 
   int data; 
   struct Node *next; 
}; 
struct Node* top = NULL; 
void push(int val) {
   struct Node* newnode = (struct Node*) malloc(sizeof(struct Node)); 
   newnode->data = val; 
   newnode->next = top; 
   top = newnode; 
}
void display() {
   struct Node* ptr;
   if(top==NULL)
      cout<<"stack is empty";
   else {   
      ptr = top; 
      while (ptr != NULL) { 
         cout<< ptr->data <<" "; 
         ptr = ptr->next; 
      } 
   }
   cout<<endl;
}
int main() {
   int ch, val; 
  while(1){
          cin>>val;
           
  if(val==-1)
    break;
     push(val);
 
  }
     display();
      return 0;
}