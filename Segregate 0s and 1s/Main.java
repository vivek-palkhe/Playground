#include<iostream>
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
  if(a[i]==0)
    count++;
  else
    z++;
  for(i=0;i<count;i++)
    cout<<"0 ";
  for(i=0;i<z;i++)
    cout<<"1 ";
  return 0;
}