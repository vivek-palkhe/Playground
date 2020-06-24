#include<bits/stdc++.h>
using namespace std;
bool solve(int arr[],int sum,int no){
	if (sum==0){
		return true;
	}
	
	if (sum>0 && no==0){
		return false;
	}
	if (arr[no-1]<=sum){
		return solve(arr,sum-arr[no-1],no-1) || solve(arr,sum,no-1);
	}
	else{
		return solve(arr,sum,no-1);
	}
	
}

int main()
{
	int no;
	cin>>no;
	int arr[no];
	for (int i=0;i<no;i++){
		cin>>arr[i];
	}
	int sum;
	cin>>sum;
	
	cout<<"Combination Found = "<<solve(arr,sum,no);
	return 0;
}