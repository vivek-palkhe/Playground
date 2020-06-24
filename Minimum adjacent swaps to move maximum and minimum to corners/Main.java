#include<iostream>
using namespace std;
int main()
{
  int n;
  int a[10];
  cin>>n;
  
  for(int i=1;i<=n;i++)
    cin>>a[i];
  
   int maxx = -1, minn = a[0], l = 0, r = 0; 
    for (int i = 1; i <= n; i++) 
    { 
          if (a[i] > maxx) { 
            maxx = a[i]; 
            l = i; 
    } 
  
        if (a[i] <= minn)
    { 
            minn = a[i]; 
            r = i; 
    } 
    } 
    if (r < l) 
        cout << l + (n - r - 2-1); 
    else
        cout << l + (n - r - 1); 
  
  return 0;
}
  