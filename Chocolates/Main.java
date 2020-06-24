#include<bits/stdc++.h>
#include<cmath>
using namespace std;
class heap{
	
	int top;
	int size;
	vector<int> heaptree;
	
	public :
		heap(){
			top=-1;
			size=0;
			heaptree.clear();
		}
		
		void push_in_heap(int no){
			heaptree.push_back(no);
			size=heaptree.size();
			heapify();
		}
		
		void heapify(){
			int temp=0;
			while (temp < size && size>0){
				int left=2*temp+1;
				int right=2*temp+2;
				
				
				if (heaptree[temp]<heaptree[left] && size>1 && left<size){
					int t=heaptree[temp];
					heaptree[temp]=heaptree[left];
					heaptree[left]=t;
				} 
				if(heaptree[temp]<heaptree[right] && size>2 && right<size){
					int t=heaptree[temp];
					heaptree[temp]=heaptree[right];
					heaptree[right]=t;
				}
					temp++;
				
			}
		}
		
		int heap_top(){
			return heaptree[0];
		}
		
		int heap_pop(){
			int dat=heaptree[0];
			heaptree[0]=heaptree[size-1];
			size--;
			heaptree.pop_back();
			
			heapify();
			return dat;
		}
		void heap_show(){
			for (int i=0;i<size;i++){
				cout<<heaptree[i]<<" ";
			}
			cout<<endl;
		}
		int getSize(){
			return size;
		}
		int Sumall(){
			int sum=0;
			for (int i=0;i<size;i++){
				sum+=heaptree[i];
			}
			return sum;
		}
	
	
};
int main()
{
	int no;
	cin>>no;
	int tt;
	heap h;
	for (int i=0;i<no;i++){
		cin>>tt;
		h.push_in_heap(tt);
	}
	int n;
	cin>>n;
		int nnn;
	while(n--){
		nnn=sqrt(h.heap_pop());
		h.push_in_heap(nnn);
		
		h.heapify();
	}
	cout<<h.Sumall();
	return 0;
}