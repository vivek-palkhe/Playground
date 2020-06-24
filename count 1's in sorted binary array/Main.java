#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n,a[10],i,count=0,z=0;
  
  cin>>n;
  for(i=0;i<n;i++)
  {
	cin>>a[i];
  }
  for(int i=0;i<n;i++)
  if(a[i]==1)
    count++;
  else
    z++;
  
  cout<<"Count of 1's in given array is "<<count;
  return 0;
}