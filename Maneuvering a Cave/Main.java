#include<bits/stdc++.h>
using namespace std;
int findNo(int endx,int endy){
		if (endx ==0 || endy==0){
			return 1;
		} 
		return findNo(endx-1,endy)+findNo(endx,endy-1);
		
}
int main()
{
	int n;
	int m;
	cin>>n>>m;
	
	cout<<findNo(n-1,m-1);
	return 0;
}