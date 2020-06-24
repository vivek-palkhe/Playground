/*
#include<iostream>
using namespace std;
int main()
{
int a,b,c;
  cin>>a>>b>>c;
  if(c%2==0)
  {
    cout<<"No"<<endl;
  }
  else
  {
    cout<<"Yes"<<endl;
  }


}
*/
#include<iostream>
using namespace std;
int main()
{
  int rows,cols,checkTree;
  
  cin>>rows>>cols>>checkTree;
  
  if (checkTree < cols || checkTree % cols == 0 || checkTree % cols == 1)
    cout<<"Yes";
  else
    cout<<"No";
  
}