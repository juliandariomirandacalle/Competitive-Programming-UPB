#include <bits/stdc++.h>

using namespace std;

int main(){
int b,g,n;
cin>>b>>g>>n;
int blue=b;
int red=g;
int count=0;
for(int i=0;i<=n;i++){

b=i;
g=n-i;
if(red<g || blue<b)continue;

if(b+g==n)count++;


}
cout<<count;


return 0;
}
