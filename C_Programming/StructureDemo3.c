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

   struct Demo *p=&obj;

   p->i=11;
   p->f=74.84f;
   p->j=4387;

   printf("%d\n",p->i);
   printf("%d\n",p->f);
   printf("%d\n",p->j);


    return 0;
}