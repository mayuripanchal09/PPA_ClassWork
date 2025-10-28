#include<iostream>

using namespace std;

class Base  //8
{
    public:
         int i,j;

         void fun()
         {
            cout<<"Inside Base fun\n";
         }

};

class Derived:public Base  //12
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

    dobj.fun();
    dobj.gun();

    return 0;
}