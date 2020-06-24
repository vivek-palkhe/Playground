#include<iostream>
using namespace std;
int main()
{
	int arr[100];
	int val;
	int pri;
	cin>>val;
	int n=val;
		
		for (int i=0;i<val;i++){
			cout<<"Insert the element in queue :"<<endl;
			cin>>arr[i];
		}
	if (val!=0){
		cout<<"Queue elements are :"<<endl;
		for (int i=0;i<val;i++){
			cout<<arr[i]<<" ";
		}
	}
	else{
		cout<<"Queue is empty";
	}
	return 0;
}