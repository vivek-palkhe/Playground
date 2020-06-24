#include <bits/stdc++.h> 
using namespace std; 
const int MAX = 100; 
  
// Function to find the maximum 
// element of each column. 
void largestInColumn(int mat[][MAX], int rows, int cols) 
{ 
    for (int i = 0; i < cols; i++) { 
        // initialize the maximum element 
        // with 0 
        int maxm = mat[0][i]; 
  
        // Run the inner loop for rows 
        for (int j = 1; j < rows; j++) { 
            // check if any element is greater  
            // than the maximum element 
            // of the column and replace it 
            if (mat[j][i] > maxm) 
                maxm = mat[j][i]; 
        } 
  
        // print the largest element of the column 
        cout << maxm << endl; 
    } 
} 
  
// Driver code 
int main() 
{ 
    int n , m ;
  cin>>n>>m;
    int mat[100][100];
  for(int i=0;i<n;i++)
  for(int j=0;j<m;j++)
    cin>>mat[i][j];
    largestInColumn(mat, n, m); 
  
    return 0; 
}