#include<iostream>
using namespace std;
int main()
{
 float mileage,petrol,distance,total;
  cin>>mileage>>petrol>>distance;
  
  total=mileage*petrol;
  if(total<distance)
  {
    cout<<"Cannot reach"<<endl;
  }
  else
  {
    
	cout<<"Can reach"<<endl;
  }
  


  


}