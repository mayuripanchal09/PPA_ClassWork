import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj1,bobj2,bobj3,bobj4;
    JTextField tobj,pobj;
    JLabel Userlabel,Passlabel,Resultlabel;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);
        fobj.getContentPane().setBackground(Color.YELLOW);

        Userlabel = new JLabel("Number First");
        Userlabel.setBounds(100,60,150,50);

        tobj = new JTextField();
        tobj.setBounds(200,60,200,40);

        Passlabel = new JLabel("Number Second");
        Passlabel.setBounds(100,150,150,50);

        pobj = new JTextField();
        pobj.setBounds(200,150,200,40);

        bobj1 = new JButton("+");
        bobj1.setBounds(100,250,50,30);

        bobj2 = new JButton("-");
        bobj2.setBounds(200,250,50,30);

        bobj3 = new JButton("*");
        bobj3.setBounds(300,250,50,30);

        bobj4 = new JButton("/");
        bobj4.setBounds(400,250,50,30);

        Resultlabel = new JLabel();
        Resultlabel.setBounds(250,300,150,50);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlabel);
        fobj.add(Passlabel);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public void actionPerformed(ActionEvent aobj)
    {
       int num1 = Integer.parseInt(tobj.getText());
       int num2 = Integer.parseInt(pobj.getText());

       if(aobj.getSource() == bobj1)
       {
            Resultlabel.setText("Addition is:"+(num1+num2));
       }
       else if(aobj.getSource() == bobj2)
       {
            Resultlabel.setText("Substraction is:"+(num1-num2));
       }
       else if(aobj.getSource() == bobj3)
       {
            Resultlabel.setText("Multiplication is:"+(num1*num2));
       }
       else if(aobj.getSource() == bobj4)
       {
            Resultlabel.setText("Division is:"+(num1/num2));
       }
    }


}
class Calc
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator",600,400);
    }
    
}
