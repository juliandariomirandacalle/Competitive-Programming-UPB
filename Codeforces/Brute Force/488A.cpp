#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
long long n;
cin>>n;
n++;
int count=1;
 
while((to_string(n)).find('8')==string::npos){
 
n++;
count++;
}
 
cout<<count;
 
return 0;
}
