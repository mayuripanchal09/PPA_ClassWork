import java.util.Scanner;

class InputOutput 
{
    public static void main(String Arr[])
    {
       Scanner sobj=new Scanner(System.in);

       int No1=0,No2=0;
       int Ans=0;

       System.out.println("Enter first no:\n");
       No1=sobj.nextInt();

       System.out.println("Enter second no:\n");
       No2=sobj.nextInt();

       Ans=No1+No2;
       System.out.println("Addition is:"+Ans);


    }
}
