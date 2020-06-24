#include<iostream>
using namespace std;
int main()
{
int fact=1,n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
 cout<<"The factorial of "<<n<<" is "<<fact;

}