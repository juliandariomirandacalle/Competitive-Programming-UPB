#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
vector<ll> divisors(ll n){
 vector<ll> div;
 for(int i=1;i<=(int)sqrt(n);i++){
  if(n%i==0){
   div.push_back(i);
   if(i!=n/i){
    div.push_back(n/i);
   }
  }
 }
 return div;
}
int main(){
ios::sync_with_stdio(false);
cin.tie(0);
cout.precision(10);
cout<<fixed;
ll n,k;
cin>>n>>k;
vector<ll> f=divisors(n);

sort(f.begin(),f.end());

if(f.size()<k){
 cout<<-1;
 return 0;
}
else cout<<f[k-1]; 

return 0;
}
