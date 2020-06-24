#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
 int Size, i, a[10];
 int Even_Count = 0, Odd_Count = 0;
 
 //printf("\n Please Enter the Size of an Array :  ");
cin>>Size; 
// printf("\nPlease Enter the Array Elements\n");
 for(i = 0; i < Size; i++)
 {
cin>>a[i];
 }
  
 for(i = 0; i < Size; i ++)
 {
   if(a[i] % 2 == 0)
   {
     Even_Count++;
   }
   else
   {
     Odd_Count++;
   }
 }
   cout<< Odd_Count<<endl;

 cout<<Even_Count<<endl;
 return 0;
}