#include<iostream>

using namespace std;

class Arithmatic
{
   public:
    int iNo1;
    int iNo2;

    Arithmatic()
    {
        this->iNo1=0;
        this->iNo2=0;
    }

    Arithmatic(int A,int B)
    {
        this->iNo1=A;
        this->iNo2=B;
    }

    int Addition()
    {
        int this->iAns=0;
        iAns=this->iNo1+this->iNo2;
        return iAns;
    }


    int Substraction()
    {
        int this->iAns=0;
        iAns=this->iNo1-this->iNo2;
        return iAns;
    }
};

int main()
{   
    Arithmatic aobj1(11,10);
    Arithmatic aobj2(21,20);


    int iRet=0;

    iRet=aobj1.Addition();
    cout<<"Addition is:"<<iRet<<"\n";

    iRet=aobj1.Substraction();
    cout<<"Substraction is:"<<iRet<<"\n";

    iRet=aobj2.Addition();
    cout<<"Addition is:"<<iRet<<"\n";

    iRet=aobj2.Substraction();
    cout<<"Substraction is:"<<iRet<<"\n";
    
    
    return 0;
}