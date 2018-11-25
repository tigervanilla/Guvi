// lower_bound and upper_bound in vector 
#include <iostream> 
#include <algorithm> // for lower_bound, upper_bound and sort 
#include <vector>	 // for vector 

using namespace std; 

int main () 
{ 
	int n,k;
    cin>>n>>k;
    int gfg[n]={0};
    for(int i=0;i<n;i++)
        cin>>gfg[i];
	
	vector<int> v(gfg,gfg+n); // 5 6 7 7 6 5 5 6 

	sort (v.begin(), v.end()); // 5 5 5 6 6 6 7 7 

	vector<int>::iterator lower,upper; 
	lower = lower_bound (v.begin(), v.end(), k); 

	cout << v[lower- v.begin()] << '\n'; 

	return 0; 
} 
