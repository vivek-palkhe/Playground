#include<iostream>
#include<iomanip>
using namespace std;

float Overs(float balls)
{
  float overs = (int)balls/6;
  
  overs+= (balls-(overs*6))/10;
  
  return overs;
}

float RunRate(float runs, float balls)
{
  return runs/Overs(balls);
}

int main()
{
  int tot_balls = 0;
  int Aus_runs = 0;
  int ind_runs = 0;
  int ind_balls = 0;
  
  cin>>tot_balls;
  cin>>Aus_runs;
  cin>>ind_runs;
  cin>>ind_balls;
  
  float tot_ovr = Overs(tot_balls);
  float ind_ovr = Overs(ind_balls);
  float cur_rate = RunRate(ind_runs, ind_balls);
  float req_rate = RunRate(Aus_runs, tot_balls);
  
  
  cout << tot_ovr<<endl;
  cout << ind_ovr<<endl;
  cout << fixed << setprecision(1)<< cur_rate<<endl;
  cout << req_rate<<endl;
  
  if(req_rate > cur_rate)
    cout<<"Not ";
  cout<<"Eligible to Win";
  return 0;
}