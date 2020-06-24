/*
i)  Add the two inputs.
ii) Find all Factors
iii) Add all factors(excluding itself)
iv) if they are equal (--ii-- and --iii-- ) --> They can See th emessage


*/
#include<iostream>
using namespace std;
int main()
{
  int first,second,total;
  cin>>first;
  cin>>second;
  
  total=first+second;
  int temp=0;
  
 for(int i=1;i<total;i++)
 {
   if(total%i==0)
   {
    temp+=i;
   }
 }
  if(temp==total)
  {
    cout<<"They can read the message"<<endl;
  }
  else
  {
    cout<<"They can't read the message"<<endl;
  }
}



   
