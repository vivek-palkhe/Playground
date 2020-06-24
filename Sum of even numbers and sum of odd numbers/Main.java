#include<iostream>
using namespace std;
int main()
{
int even=0,odd=0,n,no[15];
  cin>>n;
  for(int i=1;i<n+1;i++)
    cin>>no[i];
    //cout<<no[i];
  for(int i=1;i<n+1;i++)
  if(no[i]%2==0)
  	{
  	even=no[i]+even;
  	}
  	else
  	{
    odd=no[i]+odd;
  	}
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd<<endl;
  
}