#include<iostream>
using namespace std;

int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 

int main()
{
  int box1,box2,box3, tresure,code;
  cin>>box1>>box2>>box3;
  
  if(box1<box2)
  {
    if(box2<box3)
      tresure=box2;
    else // box3 < box2
    {
      if(box1<box3)
        tresure=box3;
      else
        tresure=box3;
    }
  }
  else
  {
   if(box1<box3)
      tresure=box1;
    else // box3 < box1
    {
      if(box2<box3)
        tresure=box3;
      else
        tresure=box2;
    }
  }
  code = gcd(box1,gcd(box2,box3));
  
  
  /*
  The treasure is in box which has number 4
  The code to open the box is 2
  */
  cout<<"The treasure is in box which has number "<<tresure<<endl;
  cout<<"The code to open the box is "<<code;
}

