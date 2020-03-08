#include <bits/stdc++.h>
using namespace std;
int almostPrime(int n){
 int cont=0;
 for(int i=2;i<=(int)sqrt(n);++i){
  if(n%i==0){
   cont++;
   while(n%i==0){
    n/=i;
    
   }
  }
 }
 if(n!=1){cont++;}
 return cont;
}
int main(){
 ios::sync_with_stdio(false);
 cin.tie(0);
 cout.precision(10);
 cout<<fixed;
 int n;
 cin>>n;
 int cont=0;
for(int i=6;i<=n;i++){
 if(almostPrime(i)==2){
  cont++;
 }
}
cout<<cont;
 return 0;
}
