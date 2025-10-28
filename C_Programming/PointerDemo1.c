#include<stdio.h>

int main()
{
    int iValue=11;
    char cValue='M';
    
    int *iPtr=&iValue;
    char *cPtr=&cValue;

    printf("Size of iPtr:%lu\n",sizeof(iPtr));  //8
    printf("Size of cPtr:%lu\n",sizeof(cPtr));  //8


    return 0;
}