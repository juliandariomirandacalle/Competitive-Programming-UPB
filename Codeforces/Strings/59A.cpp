#include <bits/stdc++.h>


using namespace std;

int main(){
ios::sync_with_stdio(false);
cin.tie(0);
cout.precision(10);
cout<< fixed;
string s;
cin>>s;
int upper=0;
int lower=0;

for(int i=0;s[i];i++){
if(isupper(s[i]))upper++;
else lower++;


}
if(upper>lower) {for (auto & c: s) c = toupper(c);}
else {for (auto & c: s) c = tolower(c);}

cout<<s;
return 0;
}
