#include<iostream>

using namespace std;

int main()
{
    int length=0;
    int *Arr=NULL;

    cout<<"Enter the no of elements:\n";
    cin>>length;
    
    //Allocate the memory
    Arr=new int[length];

    if(Arr==NULL)
    {
        cout<<"Unable to allocate memory\n";
    }
    else
    {
        cout<<"Memory gets successfully allocated\n";
    }

    //Use the Memory

    //Deallocate the memory
    delete []Arr;


    return 0;
}