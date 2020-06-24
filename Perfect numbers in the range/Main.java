#include<iostream>
#include<cctype>
#include<algorithm>
using namespace std;

int main()
{
  int n,i,sum;
  int mn,mx;
  //printf("Input the starting range or number : ");
cin>>mn;
  //printf("Input the ending range of number : ");
cin>>mx;
  //printf("The Perfect numbers within the given range : ");
  for(n=mn;n<=mx;n++){
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;

    }
    if(sum==n)
cout<<n<<" ";
  }
  cout<<"\n";
}