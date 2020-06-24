#include<iostream>
using namespace std;

int main()
{
    //fill your code
    int n;
  cout<<"Enter the number of elements in the array"<<endl;
    cin >> n;
    cout<<"Enter the elements in the array"<<endl;

    int arr[n];

    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int i;
    int odd = 0, even = 0;
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            odd++;
        if(arr[i] % 2 == 0)
            even++;
    }
    if(odd == n)
        cout <<"The array is Odd"<<endl;
    else if(even == n)
        cout <<"The array is Even"<<endl;
    else
        cout <<"The array is Mixed"<<endl;
    return 0;
}