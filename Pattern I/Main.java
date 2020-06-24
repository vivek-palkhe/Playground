#include<iostream>
using namespace std;

int main()
{
    int value = 0; //What Do we Want to Print on screen 
    cin>>value; //
    
    for (int i = 0; i<=3;i++)
    {
      for (int j = 0; j<=i;j++)
          cout<<value; // 3 \n 44 \n 555 \n 6666 \n 
      
      cout<<endl;
      value ++; //Only Addition, Not Printing
    }
    
    value --;
    
    for (int i = 0; i<=3;i++)
    {
      for (int j = 0; j<=3-i;j++)
          cout<<value; //6666 \n 555 \n 44 \n 3
      
      cout<<endl;
      value --; // Only Subtract Value
    }
    	
}