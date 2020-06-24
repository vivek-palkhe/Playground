#include<iostream>
using namespace std;
int main()
{
  int a,b,c,choice;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;

  cin>>choice;
  switch(choice)
  {
    case 1:c=a+b;
      	cout<<c;
      	break;
    case 2:c=a-b;
      cout<<c;
      break;
    case 3:c=a*b;
      cout<<c;
      break;
    case 4:c=a/b;
      cout<<c;
      break;
    case 5:c=a%b;
      cout<<c;
      break;
    default:cout<<"Invalid operation";
  }
}