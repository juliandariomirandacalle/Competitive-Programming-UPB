#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
int n;
string s;
cin>>n>>s;
int max=n/11;
int count=0;
 
for(int i=0;s[i];i++){
if(max==0)break;
 
 
if(s[i]=='8'){
count++;
max--;
}
}
 
 
cout<<count;
 
return 0;
}
