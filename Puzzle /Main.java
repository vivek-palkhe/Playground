#include<iostream> 
using namespace std; 
  
int main() 
{ 
    int m,n;
    cin>>m>>n;
    int mat[m][n];
    for (int i = 0; i < m; i++) 
       for (int j = 0; j < n; j++) 
  
          // Prints ' ' if j != n-1 else prints '\n'           
          cin >> mat[i][j];
          
   /*       
          
    for (int i = 0; i < m; i++) 
       for (int j = 0; j < n; j++) 
  
          // Prints ' ' if j != n-1 else prints '\n'           
          cout<< mat[i][j]<< " \n"[j == n-1];  
     */     
          
    for(int j = 0; j < n; j++)
    {       
      for(int i = 0; i < m;i++)
      {
         cout<<mat[i][j]<<" ";
      }
      cout<<endl;
    }      
          
  
    return 0; 
} 