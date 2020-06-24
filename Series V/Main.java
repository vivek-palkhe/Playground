#include<iostream>

using namespace std;

int main()
{
  float value = 11;
  int counter = 0;
  
  cin>>counter;
  
  while(counter>0)
  {
    cout<<value*value<<" ";
    value++;
    value++;
    value++;
    value++;
   // value++;
  //  value *= 3;
    counter--;
  }
}