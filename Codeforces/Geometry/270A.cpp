#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define forn(i,n) for(int i=0;i<(int)n;i++)
int gcd(int a, int b) 
{ 
    // Everything divides 0  
    if (a == 0) 
       return b; 
    if (b == 0) 
       return a; 
   
    // base case 
    if (a == b) 
        return a; 
   
    // a is greater 
    if (a > b) 
        return gcd(a-b, b); 
    return gcd(a, b-a); 
}
 
bool sortByVal(const pair<int, int> &a, 
               const pair<int, int> &b) 
{ 
    return (a.second < b.second); 
}
 
int main(){
     ios_base::sync_with_stdio(0);cin.tie(0);
 
 
int t;
cin >> t;
while( t-- ){
int n;
cin >> n;
 
 
for(int i = 3;; i++ ){
    double ang = 180 - ( (double)360 / i);
    if( ang == n) {cout << "YES" << '\n';break;}
    else if( ang > n)  {cout << "NO" << '\n';break;}
}
}
    return 0;
}
