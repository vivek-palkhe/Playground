#include<iostream>
using namespace std;
int main()
{
  int i,j,k,N,count=0;
 // scanf(“%d”,&N);
  cin>>N;
  for(i=1;i<=N;i++)
  {
    k=1;
    for(j=0;j<i;j++)
    {
     // printf(“%d”,i);
      cout<<i;
      if(k<i)
      {
        //printf(“*”);
        cout<<"*";
        k=k+1;
      }
    }
    //printf(“\n”);
    cout<<"\n";
  }
  for(i=N;i>0;i--)
  {
    k=1;
    for(j=0;j<i;j++)
    {
     // printf(“%d”,i);
      cout<<i;
      if(k<i)
      {
        //printf(“*”);
        cout<<"*";
        k=k+1;
      }
    }
    //printf(“\n”);
    cout<<"\n";
  }
  return 0;
}