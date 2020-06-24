#include<iostream>
using namespace std;
int main()
{
  int a,b,c,req;
  cin>>a>>b>>c;
  req=a*b*c;
  if(req>50)
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
  else
    cout<<"Doctor, you can proceed with your experiment."<<endl;
}

