#include<stdio.h>
int main(){
    int age;
    char div;

    printf("Enter your age:\n");
    scanf("%d",&age);

    printf("Enter your div:\n");
    scanf("%c",&div);

    printf("You have entered age=%d and div=%c",age,div);
    return 0;
}