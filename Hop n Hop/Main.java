#include<iostream>
#include<cmath>
using namespace std;
int main()
{ 
int x1,y1,x2,y2;
int power,power1,power2,sqr,get,set;
cin>>x2;
cin>>y2;
get=x2-3;
set=y2-4;
power1=pow(get,2);
power2=pow(set,2);
power=power1+power2;
sqr=sqrt(power);
cout<<sqr;
}