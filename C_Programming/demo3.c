#include<stdio.h>

int main()
{
    double ch=4.6745;
    double *p=&ch;
    double **q=&p;
    double *y=&ch;
    double **x=&p;
    

    printf("%d",sizeof(ch));
    printf("%d",sizeof(*p));
    printf("%d",sizeof(*y));
    printf("%d",sizeof(q));
    printf("%d",sizeof(**x));
    printf("%d",sizeof(**q));
    printf("%d",sizeof(*q));

    return 0;
}