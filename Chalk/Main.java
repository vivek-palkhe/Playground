#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int chalks;
  
  cin>>chalks;
  
  cout<<chalks + floor(sqrt(chalks)) + 1;
}