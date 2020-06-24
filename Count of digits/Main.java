#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
do  {
	n=n/10;
    i=i+1;
}  while(n!=0);

  cout<<i;
}