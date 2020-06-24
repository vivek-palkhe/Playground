#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int d1, d2, c1, c2;
  cin>>d1>>c1>>d2>>c2;
  int dt = d1+d2; int ct = c1+c2;
  if (ct>100){
    dt += 1;
    ct -= 100;
  }
  cout<<dt<<endl<<ct;
}