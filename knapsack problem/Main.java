#include <bits/stdc++.h> 
using namespace std; 
  
int max(int a, int b) { return (a > b) ? a : b; } 
  
int knapSack(int W, int wt[], int val[], int n) 
{ 
    if (n == 0 || W == 0) 
        return 0; 

  if (wt[n - 1] > W) 
        return knapSack(W, wt, val, n - 1); 
  
    else
        return max( 
            val[n - 1] + knapSack(W - wt[n - 1],  
                                    wt, val, n - 1), 
            knapSack(W, wt, val, n - 1)); 
} 
  
int main() 
{ int n;
    int val[20] ; 
    int wt[20] ; 
    int W ; 
 cin>>n;
 for(int i=0;i<n;i++)
   cin>>val[i];
 
 cin>>n;
 for(int i=0;i<n;i++)
 cin>>wt[i];
 
 cin>>W;
  cout << knapSack(W, wt, val, n); 
    return 0; 
}