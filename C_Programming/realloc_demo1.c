#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *Arr=NULL;

    //Allocate
    Arr=(int *)malloc(5*sizeof(int));
    
    //Use
    Arr=(int *)realloc(Arr,10*sizeof(int));
    //Free
    free(Arr);

    return 0;
}