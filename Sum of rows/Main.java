#include<iostream>
using namespace std;

int main()
{
    int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;
   // cout << “\nEnter the order of the matrix : “;
    cin >> m >> n;
    int row_arr[m];
    int i, j;
    int mat[m][n];
  //  cout << “\nInput the matrix elements : \n”;
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }

    int z = 0;

    //cout << “\nSum of rows is “;
    for(row=0; row<m; row++)
    {
        sum = 0;
        for(col=0; col<n; col++)
        {
            sum += mat[row][col];
        }
        cout << sum<<endl;
        row_arr[z++] = sum;
    }
    
    //cout << row_ind + 1<<endl;
// return 0;
}// cout << “\nSum of columns is “;
   