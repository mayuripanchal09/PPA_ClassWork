#include<iostream>

using namespace std;

class Base
{
    public:
        int i,j;
        void fun()
        {
            cout<<"Inside Base fun\n";
        }
        void gun()
        {
            cout<<"Inside Base gun\n";
        }
       virtual void sun()
        {
            cout<<"Inside Base sun\n";
        }
       virtual void bun()
        {
            cout<<"Inside Base bun\n";
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
        void sun()
        {
            cout<<"Inside Derived sun";
        }
        void run()
        {
            cout<<"Inside Derived run";
        }
        void mun()
        {
            cout<<"Inside Derived mun";
        }

};

int main()
{
    cout<<sizeof(Base)<<"\n";    //16
    cout<<sizeof(Derived)<<"\n"; //20
    
    Base *bp=new Derived(); //upcasting

    /*bp->fun();  //Base fun
    bp->gun();  //Base gun
    bp->sun();  //Base sun
    //bp->run();  //Error
   // bp->mun();  //Error
    bp->bun();  //Base bun
    // */

    

    return 0;
}