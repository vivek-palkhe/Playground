#include<iostream>
using namespace std;
int main()
{
	int i,num,div=0;		//initializing variables
	cin>>num;			//user input
	for(i=1;i<=num;i++)		//checking for number of divisor
	{
		if(num%i==0)
		{
			div++;				
		}
	}
	if(div==2)			//no divisors other than 1 and itself
	{
		cout<<"Eligible";
	}
	else
	{
		cout<<"Not eligible";
	}
	return 0;
}