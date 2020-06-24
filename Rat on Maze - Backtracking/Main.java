#include<bits/stdc++.h>
using namespace std;
#define N 20
bool isSafe(int x,int y,int arr[][N],int size){
	
	if (x>=0 && x<size && y>=0 && y<size && arr[x][y]!=0){
		return true;
	}
	return false;
	
}
bool PathFind(int arr[][N],int ans[][N],int x,int y,int size){
	
	if (x==size-1 && y==size-1 && arr[x][y]==1){
		ans[x][y]=1;
		return true;
	}
	
	if (isSafe(x,y,arr,size)){
		
		ans[x][y]=1;
		
		if (PathFind(arr,ans,x+1,y,size)){
			return true;
		}
		if (PathFind(arr,ans,x,y+1,size)){
			return true;
		}
		
		ans[x][y]=0; 
		return false;
	}
	
}

void solve(int size){
	int arr[N][N];
	int ans[N][N];
	
	for (int i=0;i<size;i++){
		for (int j=0;j<size;j++){
			cin>>arr[i][j];
			ans[i][j]=0;
		}
	}
	if (PathFind(arr,ans,0,0,size)){
		
		cout<<"Path to get out of maze"<<endl;
		for (int i=0;i<size;i++){
			cout<<" ";
			for (int j=0;j<size;j++){
				cout<<ans[i][j]<<"  ";
			}
			cout<<endl;
		}
	}
	else{
		cout<<"Sorry...."<<endl;
	}	
}
int main()
{
	int m;
	cout<<"Enter n value:"<<endl;
	cin>>m;
	
	solve(m);
	return 0;
}