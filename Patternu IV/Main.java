#include <iostream>
using namespace std;

int input = 0;

void printPattern()
{
	static int value = 1;
	static bool Front = true;

	if (Front)	// :	----------->11112 33334
	{
		for (int i=0;i<input-1;i++)
				cout<<value;
		cout<<++value;
		Front = false;
	}
	else 		// : <-------------32222 54444
	{
		cout<<++value;	
		for (int i=0;i<input-1;i++)
			cout<<value-1;
		Front = true;
	}

}

int main() 
{
	cin>>input;
	for (int i = 0; i<input; i++)
	{
		printPattern();
		cout<<endl;
	}

	return 0;
}