#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<string,int> psi;
typedef pair<int,int> pii;
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

bool search(int arr[],int l,int r,int x){
    while(l <= r){
        int m = l + (r - 1) / 2;
        if(arr[m] == x)
            return 1;
        if(arr[m] < x)
            l = m + 1;
        else
            r = m - 1;
    }
    return 0;
}

bool sortByVal(const pair<int, int> &a, 
               const pair<int, int> &b) 
{ 
    return (a.second > b.second); 
}






string reverse(string s){
    string S="";
    for(int i = s.length() - 1;i >= 0; ++i)S+=(to_string(s[i]));
return S;
}
int n;
const int MAXN = 4;
int arr[MAXN];
void solve(){
for(int i = 0 ; i < 4 ; ++i)
    cin >> arr [ i ];
sort(arr,arr+4);

if(arr[ 0 ] + arr[ 1 ] > arr[ 2 ] || arr[ 1 ] + arr[ 2 ] > arr[ 3 ])
    puts("TRIANGLE");
else if(arr[ 0 ] + arr[ 1 ] == arr[ 2 ] || arr[ 1 ] + arr[ 2 ] == arr[ 3 ])
    puts("SEGMENT");
else
    puts("IMPOSSIBLE");









}

int main(){



    solve();

    return 0;

}
