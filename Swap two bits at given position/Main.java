#include <iostream>
#include <bitset>
using namespace std;

// Function to swap bits are position p and q in integer n
int swap(int n, int p, int q)
{
	// if bits are different at position p and q
	if (((n & (1 << p)) >> p) ^ ((n & (1 << q)) >> q))
	{
		n ^= (1 << p);
		n ^= (1 << q);
	}
	return n;
}

int main()
{
	int n;
	int p, q;  // (3rd and 7th bit from the right)
	cin>>n;
  cin>>p>>q;
  	n = swap (n, p, q);

	cout<<n << endl;
    	n = swap (n, p, q);

  cout<<bitset<8>(n);

	return 0;
}