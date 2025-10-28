#include<iostream>

using namespace std;

class Base
{
    public:
         int i,j;

         void fun()
         {
            cout<<"Inside Base fun";
         }

};

class Derived:public Base
{
    public:
        int x;

        void gun()
         {
            cout<<"Inside Derived gun";
         }

};

int main()
{
    Base bobj;
    Derived dobj;

    cout<<"Size pf Base class object:"<<sizeof(bobj)<<"\n";
    cout<<"Size pf Derived class object:"<<sizeof(dobj)<<"\n";

    return 0;
}