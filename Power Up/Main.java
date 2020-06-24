#include<bits/stdc++.h>
using namespace std;
int main()
{
	int no;
	cin>>no;
	int ans[no];
	for (int i=0;i<no;i++){
		cin>>ans[i];
	}
	map<int ,int> mp;
	for (int i=0;i<no;i++){
		mp[ans[i]]++;
	}
	int sum;
	for (auto& a:mp){
		sum+=a.first;
	}
	cout<<sum;
	return 0;
}