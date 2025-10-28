import java.util.Scanner;

class ExceptionDemo7
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter first no:");
        iNo1=sobj.nextInt();

        System.out.println("Enter second no:");
        iNo2=sobj.nextInt();
        try
        {
            System.out.println("Inside try block");
            iAns=iNo1/iNo2;
        }
        System.out.println("Helloooo");      //Error
        catch(ArithmeticException aobj)   //specific catch
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);
        }
        catch(Exception eobj)            //generic catch
        {
            System.out.println("Inside generic catch block");
        }
        finally
        {
            System.out.println("Inside finally block");
        }
        

        System.out.println("Division is:"+iAns);
    }
}
