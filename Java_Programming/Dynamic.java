import java.util.Scanner;

class Dynamic 
{
    public static void main(String Ar[])
    {
        Scanner sobj=new Scanner(System.in);

        int length=0;
        int Arr[];

        System.out.println("Enter the no of elements:\n");
        length=sobj.nextInt();

        Arr=new int[length];

        if(Arr==null)
        {
            System.out.println("Unable to allocate memory");
        }
        else
        {
            System.out.println("Memory gets successfully allocated");
        }

        Arr=null;
        System.gc();

    }
    
}
