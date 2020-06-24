#include<iostream>
#define MAXCHAR 256
using namespace std;

void rabinKarpSearch(string mainString, string pattern, int prime, int array[], int *index) {
   int patLen = pattern.size();
   int strLen = mainString.size();
   int charIndex, pattHash = 0, strHash = 0, h = 1;

   for(int i = 0; i<patLen-1; i++) 
   {
      h = (h*MAXCHAR) % prime;    
   }
   
   for(int i = 0; i<patLen; i++) 
   {
      pattHash = (MAXCHAR*pattHash + pattern[i]) % prime;    
      strHash = (MAXCHAR*strHash + mainString[i]) % prime;   
   }
   
   for(int i = 0; i<=(strLen-patLen); i++)
   {
      if(pattHash == strHash) {     
         for(charIndex = 0; charIndex < patLen; charIndex++) 
         {
            if(mainString[i+charIndex] != pattern[charIndex])
               break;
         }

         if(charIndex == patLen) 
         {    
            (*index)++;
            array[(*index)] = i;
         }
      }

      if(i < (strLen-patLen))
      {    
         strHash = (MAXCHAR*(strHash - mainString[i]*h) + mainString[i+patLen])%prime;
         if(strHash < 0) {
            strHash += prime;   
         }
      }
   }
}

int main() {
   string mainString;
   string pattern;
  getline(cin,mainString);
  getline(cin,pattern);
   int locArray[mainString.size()];
   int prime = 101;
   int index = -1;
   rabinKarpSearch(mainString, pattern, prime, locArray, &index);

   for(int i = 0; i <= index; i++) {
      cout << "Found pattern at index " << locArray[i]<<endl;
   }
}