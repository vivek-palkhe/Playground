#include<bits/stdc++.h>
#include<string>
#define MAX_SIZE 20
using namespace std;
void swap(char& a,char& b){
	char temp=a;
	a=b;
	b=temp;
}
void permute(string str,int length,char  selected[],int used[],int index){
	int i;
	
	if (index==length){
		cout<<selected<<endl;
		return;
	}
	
	for (i=0;i<length;i++){
		if (used[i]==1){
			continue;
		}
		used[i]=1;
		selected[index]=str[i];
		permute(str,length,selected,used,index+1);
		used[i]=0;
		
	}
}
void solve(string str){
	
	sort(str.begin(),str.end());
	
	char selected[MAX_SIZE]={};
	int used[MAX_SIZE];
	
	permute(str,(str.length()),selected,used,0);
	
}

int main()
{
	string str;
	cin>>str;
	sort(str.begin(),str.end());
	solve(str);
	return 0;
}