#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int amount1,discount1,charges1;
  int amount2,discount2,charges2;
  int amount3,discount3,charges3;
  int total1,total2,total3;

//flipkart
  cin>>amount1>>discount1>>charges1;
//snapdeal
  cin>>amount2>>discount2>>charges2;
//amazon
  cin>>amount3>>discount3>>charges3;
  
  total1=amount1-(amount1*discount1/100)+charges1;
  cout<<"In Flipkart Rs."<<total1<<endl;
  
  total2=amount2-(amount2*discount2/100)+charges2;
  cout<<"In Snapdeal Rs."<<total2<<endl;
  
  total3=amount3-(amount3*discount3/100)+charges3;
  cout<<"In Amazon Rs."<<total3<<endl;

  if(total1<=total2 && total1<=total3)
  {
    cout<<"He will prefer Flipkart"<<endl;
  }
  else if(total2<total1 && total2<total3)
  {
    cout<<"He will prefer Snapdeal"<<endl;
  }
  else if(total3<total1 && total3<total2 )
  {
    cout<<"He will prefer Amazon"<<endl;
  }
  
  
  
}




