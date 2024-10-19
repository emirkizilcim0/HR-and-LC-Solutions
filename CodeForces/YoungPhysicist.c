#include <stdio.h>

const char * result(int vectorNumber, int (*coordinates)[3]){

    int x = 0, y = 0, z = 0;
    for(int i = 0; i < vectorNumber; i++){
        x += coordinates[i][0];
        y += coordinates[i][1];
        z += coordinates[i][2];

    }

    if(x == 0 && y == 0 && z == 0){
        return "YES";
    }else{
        return "NO";
    }

}


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

    const char * res = result(vectornum, arrays);

    printf("%s\n", res);
    
    return 0;
}