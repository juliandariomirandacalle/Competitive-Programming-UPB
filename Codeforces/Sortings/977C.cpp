#include <bits/stdc++.h>
using namespace std;

#define forn(i,n) for(int i=0;i<(int)n;i++)
bool order(string &s1,string &s2) 
{ 
    return s1.size() < s2.size(); 
}
const int MAXN = 2e5;
int arr[MAXN];
int main(){
 ios_base::sync_with_stdio(0);cin.tie(0);
    int n,k;
    cin>>n>>k; 
    
    forn(i,n){
        cin>>arr[i];
    }
    sort(arr,arr+n);
    
    if(k==0){
     if(arr[0]==1){
      return cout<<-1,0;
     
     }
     return cout<<1,0;
    }
    
    
    
    k--;
   
    
 
   
    if(arr[k]==arr[k+1]){
     return cout<<-1,0;
    }
cout<<arr[k];
    return 0;
}
