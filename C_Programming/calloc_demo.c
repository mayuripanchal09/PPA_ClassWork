#include<stdio.h>
#include<stdlib.h>

int main()
{
    int length=0;
    int *Arr=NULL;

    printf("Enter the no of elements:\n");
    scanf("%d",&length);

    //Allocate
    Arr=(int *)calloc(length,sizeof(int));
    if(Arr==NULL)
    {
        printf("Enable to allocate memory\n");
    }
    else
    {
        printf("Memory gets successfully allocated\n");
    }

    //Use

    //Free
    free(Arr);

    return 0;
}