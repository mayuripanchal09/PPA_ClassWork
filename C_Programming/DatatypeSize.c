#include<stdio.h>

int main()
{
    char cValue='M';
    int iValue=54;
    float fValue=56.8f;
    double dValue=75.85798;

    printf("Size of character is:%lu\n",sizeof(cValue));
    printf("Size of integer is:%lu\n",sizeof(iValue));
    printf("Size of float is:%lu\n",sizeof(fValue));
    printf("Size of double is:%lu\n",sizeof(dValue));

    return 0;

}