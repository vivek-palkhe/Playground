#include<iostream>
using namespace std;
int main()
{
  int n = 0; // no_of_Mugs
  int s = 0; // vol_of_each_Mug
  int v = 0;
  
  cin>>n>>s;
  for(int i = 0;i<n;i++)
  {
    cin>>v;
    s-=v;
  }
  
  if(s>=0) 	cout<<"YES";
  else 		cout<<"NO";
}
/*

n ---- no_of_Mugs
s ---- Vol_of_Cup
*/