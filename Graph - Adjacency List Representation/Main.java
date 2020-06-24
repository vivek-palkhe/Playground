#include <bits/stdc++.h>
   using namespace std;
   int main()
   {
       int n, u, v, m;
     cout<<"Enter the number of vertices:"<<endl;
       cin>> n;
     cout<<"Enter the number of edges:"<<endl;
		cin>>m;
       vector< vector<int> > A(n);
       for(int i=0; i< m; i++)
       {
            cout<<"Enter the Start node and End node of edge "<<i+1<<endl;

           cin>> u>> v;
           A[u].push_back(v);
           A[v].push_back(u); 
       }

     	cout<<"Adjacency List:"<<endl;

        for(int i=0; i<n; i++)
       {
            cout<< i<< "--->";
            for(int j=0; j<A[i].size(); j++)
                cout<< A[i][j]<<" ";
            cout <<  "\n";
       } 
       
       return 0;
     }