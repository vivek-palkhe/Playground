#include<bits/stdc++.h>
using namespace std;

void solve(map<int ,list<int>> mat,int nodes,bool visited[]){
	cout<<"BFS :  ";
	int start=0;
	
	list<int> toVisit;
	visited[start]=true;
	toVisit.push_back(start);
	
	
	
	while (!toVisit.empty()){
		int current=toVisit.front();
		toVisit.pop_front();
		cout<<current<<" ";
		
		for (auto& t:mat[current]){
			if (visited[t]!=true){
				visited[t]=true;
				toVisit.push_back(t);
			}
		}
		
	}
	
	
}
void solveUtils(map<int ,list<int>> mat,int nodes){
	
	
	bool visited [nodes];
	memset(visited,0,sizeof(visited));
	
	
	solve(mat,nodes, visited);
	
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