#include<iostream>

using namespace std;

int main()
{
  float value = 6;
  int counter = 0, Multiplier = 5;
  
  cin>>counter;
  
  while(counter>0)
  {
    cout<<value<<" ";
    
    value += Multiplier;	//6 11 21 36
    Multiplier += 5; 		//5 10 15 20 25
    
    counter--;
  }
}