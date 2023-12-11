#include <iostream>
#include <vector>
using namespace std;

string angryProfessor(int k, vector<int> a) {
    int arrived = 0;
    
    for(int i = 0; i < a.size(); i++){
        if(a[i] <= 0)
            arrived += 1;
        
    }
    if(arrived >= k)
        return "NO";
    
    else
        return "YES";
    
}