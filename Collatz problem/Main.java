#include<iostream>
using namespace std;

int nextCollatz(int n) //Sequence Generator Function
{
  if( n%2 == 0) 	n /= 2;
  else 				n = (3*n) +1;
  return n;
}

int main()
{
  int value = 0;    
  int up_counter = 0; // Counter to Count number of steps taken to reach 1
  
  cin>> value;	// Initial Value taken input
  
  while(value != 1)
  {
    cout<<value<<endl;
    value = nextCollatz(value);
    up_counter++;
  }
  
  cout<<1<<endl<<up_counter;
}