#include <stdio.h>
#include <stdbool.h>

const char* dangerousOrNot(char players[]){

    int repeated = 0;
    bool isDangerous = false;
    char initialCharacter = players[0];
    for(int i = 1; players[i] != '\0'; i++){

        if(repeated == 7){
            isDangerous = true;
            break;
        }
        if(players[i] == initialCharacter){
            repeated++;
        }else{
            repeated = 1;
            initialCharacter = players[i];
        }

    }

    if(isDangerous) return "YES";
    else return "NO";


}


int main(){

    char input[100];
    scanf("%99s", &input);

    printf("%s", dangerousOrNot(input));

    return 0;
}