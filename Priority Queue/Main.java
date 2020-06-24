#include<bits/stdc++.h>
using namespace std;

void solve(map<int,int> l){
	
	for (auto& a :l){
		cout<<a.second<<" ";
	}
	
}
int main()
{
	
	map<int,int> l1;
	int val;
	int pri;
	
	bool terminate=false;
	while (1){
		cout<<"Enter the value to insert:"<<endl;
		cin>>val;
		
		if (val<0 && l1.size()!=0){
			break;
		}
		else if (val<0 && l1.size()==0){
			terminate=true;
			break;
		}
		cout<<"Enter the priority of that value:"<<endl;
		cin>>pri;
		l1[pri]=val;
	}
	if (!terminate){
		if (l1.size()!=0)
			solve(l1);
	}
	else{
		cout<<"Queue is empty";
	}
	return 0;
}
