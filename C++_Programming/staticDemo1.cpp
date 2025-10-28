#include<iostream>

using namespace std;

class Demo
{
   public:
      int i;
      int j;
      static int x;

      Demo()
      {
        this->i=0;
        this->j=0;
      }

      Demo(int A,int B)
      {
        this->i=A;
        this->j=B;
      }

      void fun()
      {
        cout<<"Inside fun";
      }

      static void Gun()
      {
        cout<<"Inside Gun\n";
      }


};
int Demo::x=11;

int main()
{
    Demo::Gun();    //Scope Resolution operator
    cout<<"Value of x is:"<<Demo::x<<"\n";

    return 0;
}