#include<iostream>

using namespace std;

int factor()
{
  static int fact = 2;
  
  if(fact==1)
    fact = 2;
  else
    fact = 1;
  
  return fact;
};

int main()
{
  int counter = 0 ;
  int value = 1;
  
  cin>>counter;
  
  while(counter>0)
  {
    cout<<(value*value)-factor()<<" ";
    value++;
    counter--;
  }
}