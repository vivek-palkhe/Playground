#include<iostream>
using namespace std;
int main()
{
  int count,sum=0,num,n;
  cin>>num;
  for(count=0;sum<num;count++)
  {
    cin>>n;
  	sum=sum+n;
  }
cout<<"The number of turns is "<<count;
return 0;
}
