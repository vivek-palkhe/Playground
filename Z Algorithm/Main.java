#include<iostream>
using namespace std;

void fillZArray(string conStr, int zArr[]) {
   int n = conStr.size();
   int windLeft, windRight, k;
   windLeft = windRight = 0;    
   for(int i = 1; i < n; i++) {
      if(i > windRight) {
         windLeft = windRight = i;     
         while(windRight < n && conStr[windRight-windLeft] == conStr[windRight]) {
            windRight++;     
         }
         zArr[i] = windRight-windLeft;
         windRight--;
      }else {
         k = i-windLeft;
         if(zArr[k] < windRight-i+1)
            zArr[i] = zArr[k];    
         else {
            windLeft = i;
            while(windRight < n && conStr[windRight - windLeft] == conStr[windRight]) {
               windRight++;
            }
            zArr[i] = windRight - windLeft;
            windRight--;
         }
      }
   }
}

void zAlgorithm(string mainString, string pattern, int array[], int *index) {
   string concatedStr = pattern + "$" + mainString;    
   int patLen = pattern.size();
   int len = concatedStr.size();
   int zArr[len];
   fillZArray(concatedStr, zArr);

   for(int i = 0; i<len; i++) {
      if(zArr[i] == patLen) {
         (*index)++;
         array[(*index)] = i - patLen -1;
      }
   }
}

int main() {
   string mainString;
   string pattern;
  getline(cin,mainString);
  getline(cin,pattern);
   int locArray[mainString.size()];
   int index = -1;
   zAlgorithm(mainString, pattern, locArray, &index);

   for(int i = 0; i <= index; i++) {
      cout << "Found pattern at index " << locArray[i]<<endl;
   }
}