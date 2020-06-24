#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int d;
  cin>>d;
  int x=((num<<d)|(num>>(16-d)));
  cout<<x<<"\n";
  int y=((num>>d)|(num<<(16-d)));
  cout<<y<<"\n";
  return 0;
}