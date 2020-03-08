#include <bits/stdc++.h>
using namespace std;

int main(){
 ios::sync_with_stdio(false);
 cin.tie(0);
 cout.precision(10);
 cout<<fixed;
 int n;
 cin>>n;
 string s;
 for(int i=0;i<n;i++){
  int cont=0;
  cin>>s;
  for(int j=0;s[j];j++){
   if(s[j]=='1'&&s[j+1]=='0'){
    for(int k=j;s[k];k++){
     if(s[k+1]=='1'){
      cont+=k-j;
      break;
     }
    }
   }
  }
  cout<<cont<<'\n';
 }
 return 0;
}
