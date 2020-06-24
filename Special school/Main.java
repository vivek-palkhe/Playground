#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
    string str1,str2; 
  cin>>str1;
  cin>>str2;
    // Reverse str[beign..end] 
    reverse(str1.begin(), str1.end()); 
  
    //cout << str1;
  if(str2==str1)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    return 0; 
} 