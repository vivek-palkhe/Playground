#include<bits/stdc++.h>
using namespace std;

void solve(list<int> l){
	stack<int> h;
	cout<<"Before reversing:"<<endl;
	while (l.size()!=0){
		h.push(l.front());
		cout<<l.front()<<" ";
		l.pop_front();
	}
	cout<<endl;
	while (h.size()!=0){
		l.push_back(h.top());
		h.pop();
	}
	cout<<"After reversing:"<<endl;
	while (l.size()!=0){
		cout<<l.front()<<" ";
		l.pop_front();
	}
	
}
int main()
{
	
	list<int> l1;
	int val;
	bool terminate=false;
	while (1){
		cin>>val;
		if (val<0 && l1.size()!=0){
			break;
		}
		else if (val<0 && l1.size()==0){
			terminate=true;
			break;
		}
		l1.push_back(val);
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