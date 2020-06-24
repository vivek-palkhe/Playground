#include<bits/stdc++.h>

using namespace std;

int main()

{
    int n;

    cin>>n;

    int a[n];

    for(int i=0;i<n;i++)

        cin>>a[i];

    int table[n][n];

    for(int i=0;i<n;i++)

    {

        table[i][i]=a[i];

        if(i != n-1)

            table[i][i+1]=max(a[i],a[i+1]);

    }

    int x,y,z,r,c;

    bool flag = true;

    for(int i=2;i<n;i++)

    {

        for(int j=0;j+i<n;j++)

        {

            r=j;

            c=j+i;

            x=table[r+2][c];

            y=table[r+1][c-1];

            z=table[r][c-2];

            if(r == 0 and c == n-1)

            {

                if(max(a[r]+min(x,y),a[c]+min(y,z)) == a[r]+min(x,y))

                    flag=true;

                else

                    flag= false;

            }

            table[r][c]=max(a[r]+min(x,y),a[c]+min(y,z));

        }

    }
 cout<<table[0][n-1]<<endl;

}