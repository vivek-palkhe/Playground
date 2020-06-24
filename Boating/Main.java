#include<iostream>
using namespace std;
int main()
{
int adult,child;
 int a,b,c,total;
  cin>>a>>b>>c;
  adult=b*75;
  child=c*30;
  total=adult+child;
  if(total<a)
  {
    cout<<"Boat is stable"<<endl;
  }
  else
  {
    cout<<"Boat will drow"<<endl;
  }
}






