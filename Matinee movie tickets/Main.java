/*
Goals -->
1. Adults, >13
2. Children
*/
#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  float age, show_time, price;
  
  cin>>age>>show_time;
  
  if (age<13)
  {
    //children
    if( show_time >13.30 and show_time < 18.00)
      price = 2.0;
    else
      price = 4.0;
  }
 else 
 {
   //adult
    if( show_time >13.30 and show_time < 18.00)
      price = 5.0;
    else
      price = 8.0;
 }
  
  cout<<"$";
  cout << fixed;
  cout<<setprecision(2)<<(float)price;
}