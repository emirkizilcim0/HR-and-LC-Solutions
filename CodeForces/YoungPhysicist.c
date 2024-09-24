#include <stdio.h>

int main(){

    int vectornum;
    scanf("%d",&vectornum);

    int arrays[vectornum][3];

    for(int i = 0; i < vectornum; i++){
        int num1, num2, num3;
        scanf("%d%d%d", &num1, &num2, &num3);
        arrays[i][0] = num1; 
        arrays[i][1] = num2; 
        arrays[i][2] = num3; 
    }


    int x = 0, y = 0, z = 0;
    for(int i = 0; i < vectornum; i++){
        x += arrays[i][0];
        y += arrays[i][1];
        z += arrays[i][2];

    }

    if(x == 0 && y == 0 && z == 0){
        printf("YES");
    }else{
        printf("NO");
    }

    return 0;
}