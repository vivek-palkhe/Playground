#include<bits/stdc++.h>
using namespace std;

int SOlve(vector<int> data,int x,int y){
	if (x>=y){
		return 0;
	}
	
	int mn=INT_MAX;
	for (int k=x;k<y;k++){
		int temp=SOlve(data,x,k)+SOlve(data,k+1,y)+data[x-1]*data[k]*data[y];
		
		mn=min(mn,temp);
	}
	
	return mn;
}
int main()
{
	int no;
	cin>>no;
	int newSize=no*2;
	int arr[newSize];
	for (int i=0;i<newSize;i++){
		cin>>arr[i];
	}
	
	vector<int> data;
	
	data.push_back(arr[0]);
	
	for (int i=1;i<newSize-2;i=i+2){
		data.push_back(arr[i]);
	}
	data.push_back(arr[newSize-1]);
	/*
	
	for (auto a=data.begin();a!=data.end();a++){
		cout<<*a<<" ";
	}*/
	
	
	cout<<SOlve(data,1,data.size()-1);
	return 0;
}