#include <stdio.h>
#include <stdlib.h>
const char* winnerOfTheGame(char gameResults[]){

    int anton = 0;
    int danik = 0;

    for(int i = 0; gameResults[i] != '\0'; i++){

        if(gameResults[i] == 'A'){
            anton++;
        }else if(gameResults[i] == 'D'){
            danik++;
        }

    }
    
    if(anton == danik){
        return "Friendship";
    }else{
        return anton > danik ? "Anton" : "Danik";
    }

}



int main(void){

    int size = 0;
    scanf("%d", &size);

    char* gameResults = (char *) malloc((size+1) * sizeof(char));

    getchar();

    for(int i = 0; i < size; i++){
        scanf("%c", &gameResults[i]);
    }

    printf("%s ", winnerOfTheGame(gameResults));

    free(gameResults);
    return 1;
}

