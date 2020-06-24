#include<iostream>
#include<string>
using namespace std;
int main()
{
string name,designation;
  int id,age;
  float salary;
  
  cout<<"Enter name:"<<endl;
  cin>>name;
  cout<<"Enter ID:"<<endl;
  cin>>id;
  cout<<"Enter age:"<<endl;
  cin>>age;
  cout<<"Enter designation:"<<endl;
  cin>>designation;
  cout<<"Enter Salary:"<<endl;
  cin>>salary;
  
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<name<<endl;
  cout<<"ID of the Employee : "<<id<<endl;
  cout<<"Age of the Employee : "<<age<<endl;
  cout<<"Designation of the Employee : "<<designation<<endl;
  cout<<"Salary of the Employee : "<<salary;
}