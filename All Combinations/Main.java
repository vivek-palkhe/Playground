#include<bits/stdc++.h>
using namespace std;
#define SIZE 20 


void printCombinations(int arr[],int n,int selected[],int visited_count){
	if (visited_count==n){
		int i;
		for (int i=0;i<n;i++){
			if (selected[i]==1){
				cout<<arr[i]<<",";
			}
		}
		cout<<endl;
		return ;
	}
	
	selected[visited_count]=1;
	printCombinations(arr,n,selected,visited_count+1);
	selected[visited_count]=0;
	printCombinations(arr,n,selected,visited_count+1);
	
	
	
}
void printCombinationWrapper(int arr[],int no){
	int selected[SIZE]={};
	
	int visited_count=0;
	printCombinations(arr,no,selected,visited_count);
}
int main()
{
	int no;
	cin>>no;
	int arr[no];
	
	for (int i=0;i<no;i++){
		cin>>arr[i];
	}
	
	
	printCombinationWrapper(arr,no);
	return 0;
}