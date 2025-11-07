import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj,pobj;
    JLabel Userlabel,Passlabel,Resultlabel;
    private Socket sobj;
    private DataInputStream diobj;
    private DataOutputStream doobj;
    private String host = "localhost";
    private int port = 2500;
    

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

        bobj = new JButton("Add");
        bobj.setBounds(200,250,150,40);

        Resultlabel = new JLabel();
        Resultlabel.setBounds(250,300,150,50);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlabel);
        fobj.add(Passlabel);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);
        
        fobj.setLayout(null);
        fobj.setSize(width,height);

        
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public void connection() throws IOException
    {
        sobj = new Socket(host,port);
        diobj = new DataInputStream(sobj.getInputStream());
        doobj = new DataOutputStream(sobj.getOutputStream());
    }

    public void actionPerformed(ActionEvent aobj) 
    {
       int num1 = Integer.parseInt(tobj.getText());
       int num2 = Integer.parseInt(pobj.getText());

       try
       {  
       doobj.writeInt(num1);
       doobj.writeInt(num2);

       int sum = diobj.readInt();
       Resultlabel.setText("Addition is:"+sum);
       }
       catch(IOException e)
       {

       }
       
    }


}
class ClientHW
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Addition",600,400);
        try
        { 
            mobj.connection(); 
        }
        catch(IOException e)
        {

        }
    }
    
}
