#include<iostream>

using namespace std;

class Demo
{
    public:
        void Display()
        {
            cout<<"Inside Display";
        }
};

int main()
{
    Demo dobj;
    cout<<sizeof(dobj);  //1 byte

    return 0;
}