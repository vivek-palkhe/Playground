#include<iostream>
#include<string>
#include<cmath>
using namespace std;

bool kaprekar(int n)
{
  if(n==1)
    return true;
  
  int sq=n*n;
  int count=0;
  
  while(sq)
  {
    count++;
    sq/=10;
  }
  sq=n*n;
  for(int i=1;i<count;i++)
  {
    int eq=pow(10,i);
    if(eq==n)
      continue;
    
    int sum=sq/eq+sq%eq;
    if(sum==n)
      return true;
  }
  return false;
}

  int main()
  {
    int check;
    cin>>check;
   	 if(kaprekar(check)==true)
     
      			cout<<"Kaprekar Number"<<endl;
    		else
      			cout<<"Not a Kaprekar Number"<<endl;
    return 0;
    
    
    
  }