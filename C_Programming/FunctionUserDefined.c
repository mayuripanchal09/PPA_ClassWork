#include<stdio.h>
int Addition(int iNo1,int iNo2)
{
    int iSum=0;
    iSum=iNo1+iNo2;
    return iSum;
}

int main()
{ 
    int iValue1=0,iValue2=0;
    int iAns=0;

    printf("Enter first num:\n");
    scanf("%d",&iValue1);

    printf("Enter sec num:\n");
    scanf("%d",&iValue2);

    iAns=Addition(iValue1,iValue2);
    printf("Addition is:%d",iAns);

    return 0;
}