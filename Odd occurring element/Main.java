#include<bits/stdc++.h> 
using namespace std; 
  

int getOddOccurrence(int arr[], int arr_size) 
{ 
    for (int i = 0; i < arr_size; i++) { 
          
        int count = 0; 
          
        for (int j = 0; j < arr_size; j++) 
        { 
            if (arr[i] == arr[j]) 
                count++; 
        } 
        if (count % 2 != 0) 
            return arr[i]; 
    } 
    return -1; 
} 
  
int main() 
    { 
        int n,arr[15] ;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  
        cout << getOddOccurrence(arr, n); 
  
        return 0; 
    }