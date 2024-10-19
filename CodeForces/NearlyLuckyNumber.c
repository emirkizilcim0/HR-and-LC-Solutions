#include <stdio.h>


const char * luckyNumber(long long number){

    int count = 0;

    while(number != 0){

        long long digit = number % 10;
        if(digit == 4 || digit == 7){
            count++;
        }
        number = number / 10;

    }

    if(count == 4 || count == 7){

        return "YES";
    }else{
        return "NO";
    }

}


int main(void){

    long long input;
    scanf("%d", &input);

    printf("%s", luckyNumber(input));

    return 0;
}