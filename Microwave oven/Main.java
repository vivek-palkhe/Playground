#include<iostream>
using namespace std;

int main()
{
	double no_of_items = 0;
	double heating_time = 0;

	cin>>no_of_items;
	cin>>heating_time;


	if (no_of_items<=0){
		cout<<"Number too Less";
	}
	else if(no_of_items == 1){
		heating_time *= 1;
		cout<<heating_time;
	}
	else if(no_of_items == 2){
		heating_time *= 1.5;
		cout<<heating_time;
	}
	else if(no_of_items == 3){
		heating_time *= 2;
		cout<<heating_time;
	}
	else {
		cout<<"Number of items is more";
	}
}