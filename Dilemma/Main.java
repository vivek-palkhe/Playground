#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
  char str[10];
  int count=0,num, n;
  cin>>num;
  for(int a=0;a<num;a++)
  {
    cin>>n;
    for(int k=0;k<n;k++)
      cin>>str[k];
  for(int i=0;i<n;i++)
  {
    if(str[i]=='c')
    {
      for(int j=0;j<strlen(str);j++)
      {
        if(str[j]=='v')
        {
          count = count + 2;
          str[i]='0';
          str[j]='0';
          break;
        }
      }
    }
  }
  cout<<count<<endl;
    count = 0;
  }
  return 0;
}