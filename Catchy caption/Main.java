#include<iostream>
#include<string>
#include<cstdio>
using namespace std;
int main()
{
  int counter=0;
  char str[100];
gets(str);
    for (int i = 0; str[i] != '\0';i++)
    {
      if(str[i]==' ')
      {
        counter++;
      }
    }
  //cout<<counter;
  if(counter>10)
    cout<<"Caption not eligible for the contest"<<endl;
  else
    cout<<"Caption eligible for the contest"<<endl;
}


