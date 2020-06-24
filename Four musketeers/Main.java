#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float forx,forxx,fory,foryy;
  
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  
  forx=(x1+x2+x3);
  forxx=(forx)/3;
  cout<<forxx<<endl;
  
  fory=(y1+y2+y3);
  foryy=(fory)/3;
  cout<<foryy;
}