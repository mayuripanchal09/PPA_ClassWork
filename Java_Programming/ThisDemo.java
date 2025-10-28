class Demo
{ 
    public int i;
    public static int j;

    static
    {
        j=21;
    }

    public Demo()
    {
        System.out.println("Inside default");
        this.i=11;  //First use
    }

    public Demo(int a)
    {
        this();    //Second Use
        System.out.println("Inside parametrized");
        

    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i);  //Third use
    }
}
class ThisDemo 
{ 
    public static void main(String A[])
    {
       Demo dobj=new Demo(51);
       dobj.Display();
    }
    
}
