#include<iostream>
using namespace std;

int nextFibb(int curr = 1) //Sequence Generator
{
  static int prev = 0;
  int next = curr + prev;
  prev = curr;
  
  return next;
}

int main()
{
  int value = 1;
  int counter = 0;
  
  cin>>counter;
  
  counter-=2; //because we have considered 0 and 1 already
  
  while(counter > 0)
  {
    value = nextFibb(value);
    counter --;
  }
  
  cout<<value;
}