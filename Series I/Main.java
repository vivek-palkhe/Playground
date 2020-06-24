#include<iostream>

using namespace std;

int main()
{
  float value = 0.5;
  int counter = 0;
  
  cin>>counter;
  
  while(counter>0)
  {
    cout<<value<<" ";
    
    value *= 3;
    counter--;
  }
}