package javaapplication30;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import static java.lang.Class.forName;
import java.util.logging.Level;
import java.util.logging.Logger;
class JavaApplication30 extends JFrame implements ActionListener{
    
      JFrame f;
      JLabel l,l1,l2,l3,l4,ll4,l5,l6,l10;
      JTextField t1,t2,t3,t4,tt4,t5,t6;   
        JButton b1,b2,b3;
        
       JavaApplication30()
       {
      f=new JFrame("signup page");
      
     l=new JLabel("REGISTRATION FORM ");
     l.setBounds(150,50,600,50);
     Font h=new Font("Arial",Font.ITALIC,25);
     l.setFont(h);
     l.setForeground(Color.red);
     
    l1=new JLabel(" First name");
    l1.setBounds(150,120,70,15);
    t1=new JTextField ();
    t1.setBounds(250,120,150,20);
   
    l2=new JLabel ("Last Name");
    l2.setBounds(150,150,90,30);
    t2=new JTextField();
    t2.setBounds(250,155,150,20);        
    
    l3=new JLabel("Username");
    l3.setBounds(150,180,70,40);
    t3=new JTextField();
    t3.setBounds(250,190,150,20);
    
    l4=new JLabel ("password");
    l4.setBounds(150,210,70,50);
    t4=new JTextField();
    t4.setBounds(250,225,150,20);
    
    ll4=new JLabel ("Confirm password");
    ll4.setBounds(150,240,70,50);
    tt4=new JTextField("");
    tt4.setBounds(250,260,150,20);
    
    l5=new JLabel ("Email id");
    l5.setBounds(150,270,70,60);
    t5=new JTextField();
    t5.setBounds(250,295,150,20);
  
    b1=new JButton("Submit");
    b1.setBounds(120,350,90,30);
    b1.setBackground(Color.blue);
    b1.setForeground(Color.white);
    
    b2=new JButton("Reset");
    b2.setBounds(230,350,90,30);
    b2.setBackground(Color.blue);
    b2.setForeground(Color.white);
    
    b3=new JButton("Exit");
    b3.setBounds(340,350,90,30);
    b3.setBackground(Color.blue);
    b3.setForeground(Color.white);
    
    Cursor j=new Cursor(Cursor.HAND_CURSOR);
    b1.setCursor(j);
    b2.setCursor(j);
    b3.setCursor(j);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
  b3.addActionListener(this);
    
    add(l1);add(l2);add(l3);add(l4);add(l5);
    add(ll4);add(tt4);
    f.setLocation(200,55);add(l);
f.setSize(200, 200);
    add(b1);add(b2);add(b3);
    add(t1);add(t2);add(t3);add(t4);add(t5);
    setSize(600,600);
    setLocation(200,100);
    setLayout(null);
    setVisible(true);
    
       }

       public void actionPerformed(ActionEvent e) {
           
           if(e.getSource()==b2)
            {
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" ");
                t4.setText(" ");
                tt4.setText(" ");
                t5.setText(" ");
            }
          if(e.getSource().equals(b3))
          {
              mainpage p=new mainpage();
          }
        if(e.getSource()==b1)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                
                PreparedStatement Pstatement=connection.prepareStatement("insert into stu values(?,?,?,?,?,?)");
                
                
                Pstatement.setString(1,t1.getText());
                Pstatement.setString(2,t2.getText());               
                Pstatement.setString(3,t3.getText());
                Pstatement.setString(4,t4.getText());
                Pstatement.setString(5,tt4.getText());
                Pstatement.setString(6,t5.getText());                
               
               
               if(t4.getText().equalsIgnoreCase(tt4.getText()))
                {
                   
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password did not match");
                }
               
 
 
                
 
            } catch (SQLException e1) {
                System.out.println(e1);
            }  catch (ClassNotFoundException ex) { 
                   Logger.getLogger(JavaApplication30.class.getName()).log(Level.SEVERE, null, ex);
               } 
            
 
        }
        
 
    }
public static void main(String[] args ){

   JavaApplication30 k= new  JavaApplication30();


}
}
