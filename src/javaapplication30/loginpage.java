package javaapplication30;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class loginpage extends JFrame implements ActionListener  {
    
     JFrame f;
     JLabel  l,l1,l2;
       JTextField t1 , t2;
            JButton b;
            loginpage()
            {
                
             l=new JLabel("LOGIN FORM ");
             l.setBounds(80,20,600,50);
             Font h=new Font("Arial",Font.ITALIC,25);
             l.setFont(h);
             l.setForeground(Color.red);
     
             f=new JFrame("loging page");
             l1=new JLabel("User Name");
            l1.setBounds(50,100,100,30);
             t1=new JTextField(); 
            t1.setBounds(150,100,110,25);
             l2=new JLabel("Password");
            l2.setBounds(50,150,100,30);
             t2=new JTextField(); 
            t2.setBounds(150,150,110,25);
            
            b=new JButton("Login");
            b.setBounds(120,210,80,30);
            b.setBackground(Color.blue);
            b.setForeground(Color.white);
            Cursor j=new Cursor(Cursor.HAND_CURSOR);
            b.setCursor(j);
            b.addActionListener(this);
            add(l1);
            add(l2);
            add(t1);
            add(t2);
            add(b);
           add(l);
            setSize(400,400);
            setLocation(400,100);
            setLayout(null);
            setVisible(true);
            }
    
            public void actionPerformed(ActionEvent e)
     {
         if(t1.getText().equals("") && t2.getText().equals(""))
                 {
                      JOptionPane.showMessageDialog(null,"enter details fisrt");
                 }
         
         else
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
           // System.out.println("connected");
            Statement st=con.createStatement();
            String query="select password from stu where username='"+ t1.getText()+"'";
            ResultSet rs=st.executeQuery(query);
            String get_password="";
            while(rs.next())
            {
                get_password=rs.getString(1);
            }
            if(get_password.equals(t2.getText()))
            {
               home j=new home();
            }           
            else
            {
                JOptionPane.showMessageDialog(null," wrong username or password rejected");
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    public static void main(String[] args) {
        
        new loginpage();
           
    }
    
}
