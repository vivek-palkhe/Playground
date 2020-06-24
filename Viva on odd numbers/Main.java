#include<iostream>
#include<iomanip>
using namespace std;
int correct = 0;

float calc_score(int guess) {
  if (guess>0)  {
    if (guess %2 == 0) return -0.5;
    else {
      correct++;
      return 1;
    }
  }
  else
    return -1;
}

int main()
{
  int guess=0;
  float score, t_score=0;
  
  do
  {
    cin>>guess;
    score = calc_score(guess);
    t_score += score;
    
  }while(guess >= 0 && correct != 3);
  
  cout<<t_score;
}