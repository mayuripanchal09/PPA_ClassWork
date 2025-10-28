#include<stdio.h>

struct Demo
{
    int i;
    float f;
    int j;
};

int main()
{ 
    struct Demo obj;

    obj.i=11;
    obj.f=58.85f;
    obj.j=64;

    printf("%d\n",obj.i);
    printf("%d\n",obj.f);
    printf("%d\n",obj.j);

    return 0;
}