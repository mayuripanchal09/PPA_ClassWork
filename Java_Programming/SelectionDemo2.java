import java.util.Scanner;

class SelectionDemo2 
{
    public static void main(String Ar[])
    {
       Scanner sobj=new Scanner(System.in);
       int iStd=0;

       System.out.println("Enter your standard:");
       iStd=sobj.nextInt();

       if(iStd==1)
       {
        System.out.println("Exam at 10 am");
       }
       else if(iStd==2)
       {
        System.out.println("You can't 11 am");
       }
       else if(iStd==3)
       {
        System.out.println("You can't 12 am");
       }
       else if(iStd==4)
       {
        System.out.println("You can't 1 pm");
       }
       else
       {
        System.out.println("Invalid standard");
       }


    }
}
