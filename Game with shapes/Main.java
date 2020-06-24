#include<iostream>
using namespace std;
int main()
{
  float radius,length;
  cin>>radius>>length;
  if(length>=2*radius)
    cout<<"circle can be inside a square"<<endl;
  else
    cout<<"circle cannot be inside a square"<<endl;
}