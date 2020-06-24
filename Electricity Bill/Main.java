#include<iostream>
using namespace std;
int main()
{
int unit,cost;
  cin>>unit;
  if(unit<=200)
  {
    cost=unit*(0.5);
    cout<<"Rs."<<cost;
  }
  else if(unit<=400)
  {
    cost=unit*0.65+100;
    cout<<cost<<endl;
  }
  else if(unit<=600)
  {
    cost=unit*0.80+200;
    cout<<cost<<endl;
  }
  else if(unit>600)
  {
    cost=unit*1.25+425;
    cout<<cost<<endl;
  }
  
}