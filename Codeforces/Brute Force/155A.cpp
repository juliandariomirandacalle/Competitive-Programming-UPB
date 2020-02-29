#include <bits/stdc++.h>
using namespace std;
int main(){
int n;
int num;
cin>>n;
cin>>num;
int max=num;
int min=num;
int cont=0;
for(int i=0;i<n-1;i++){
cin>>num;
if(num>max) {cont++;max=num;}
else if(num<min) {cont++;min=num;}
}
cout<<cont;
return 0;
}
