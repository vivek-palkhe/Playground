#include<bits/stdc++.h>
	using namespace std;

	void solve(map<int ,list<int>> mat,int start,bool visited[]){
		
		cout<<start<<" ";
		visited[start]=true;
		
		for(auto& a:mat[start]){
			if (!visited[a]){
				solve(mat,a,visited);
			}
		}
		
	}
	void solveUtils(map<int ,list<int>> mat,int nodes){
		
		
		bool visited [nodes];
		memset(visited,0,sizeof(visited));
		
		cout<<"DFS : ";
		solve(mat,0 , visited);
		
	}
	int main()
	{
		int no;
		cin>>no;
		if (no==0){
			cout<<"Graph doesn't exist"<<endl;
		}
		else{
		
		int a,b;
		map<int, list<int>> mat;
		
		while(1){
			cin>>a;
			cin>>b;
			if (a<0 && b<0){
				break;
			}
			mat[a].push_front(b);
			mat[b].push_front(a);
			
		}
		
		solveUtils(mat,no);
		}
		return 0;
	}