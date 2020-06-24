#include <iostream>
#include <algorithm>
#include <vector> 
using namespace std;
int main()
{
    int n; 
    cin >> n;
    vector<string> arr(n);
    for(auto& i : arr)
    cin >> i;
    sort(arr.begin(), arr.end(), [](const string &x, const string &y){
        return x+y > y+x;
    } 
    );
    for(auto& i : arr)
        cout << i;
    cout << '\n';
}