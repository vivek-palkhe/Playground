#include <bits/stdc++.h> 
using namespace std; 
  
int longestUniqueSubsttr(string str) 
{ 
    int n = str.size(); 
    int res = 0; // result 
  
    vector<bool> visited(256); 
  
    for (int i = 0; i < n; i++) { 
        for (int j = i; j < n; j++) { 
  
          
            if (visited[str[j]] == true) 
                break; 
  
           
            else { 
                res = max(res, j - i + 1); 
                visited[str[j]] = true; 
            } 
        } 
  
       
        visited[str[i]] = false; 
    } 
    return res; 
} 
  
int main() 
{ 
    string str;
  getline(cin,str);
    int len = longestUniqueSubsttr(str); 
    cout << len; 
    return 0; 
} 