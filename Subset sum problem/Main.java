#include<iostream>
using namespace std;
int main()
{
    int n,sum;
    cin>>n>>sum;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    int table[n+1][sum+1];
    for(int i=0;i<sum+1;i++)
        table[0][i]=false;
    for(int i=0;i<n+1;i++)
        table[i][0]=true;
    for(int i=1;i<n+1;i++)
    {
        for(int j=1;j<sum+1;j++)
        {
            if(j<a[i-1])
                table[i][j]=table[i-1][j];
            else
                table[i][j]=table[i-1][j]||table[i-1][j-a[i-1]];
        }
    }
    if(table[n][sum])
        cout<<"Yes";
    else
        cout<<"No";
}