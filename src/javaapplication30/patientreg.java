/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author RR
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;



public  class patientreg extends JFrame implements ActionListener  {
    JFrame frame;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2,b3;
    patientreg()
    {
         frame =new JFrame();
        frame.setSize(1000, 700);
        frame.setLocation(200, 100);
       Container c= frame.getContentPane(); 
       
       c.setLayout(null);
       
       
       l=new JLabel();
       l.setBounds(250,20,500,80);
       Font p=new Font("Arial",Font.PLAIN,45);
       l.setFont(p);
       l.setForeground(Color.red);
       l.setText("Patient Registration");
       c.add(l);
       
       l10=new JLabel();
       l10.setBounds(80,80,260,100);
       Font p10=new Font("Arial",Font.PLAIN,18);
       l10.setFont(p10);
       l10.setText("Patient Id :");
       t10=new JTextField();
        Font p1p=new Font("Arial",Font.PLAIN,20);
       t10.setFont(p1p);
       t10.setBounds(250,115,400,30);
       c.add(l10);
       c.add(t10);
       
        l1=new JLabel();
       l1.setBounds(80,130,260,100);
       Font p1=new Font("Arial",Font.PLAIN,18);
       l1.setFont(p1);
       l1.setText("Patients name :");
       t1=new JTextField();
        Font pp1=new Font("Arial",Font.PLAIN,20);
       t1.setFont(pp1);
       t1.setBounds(250,165,400,30);
       c.add(l1);
       c.add(t1);
       
       l2=new JLabel();
       l2.setBounds(93,180,230,100);
       Font p2=new Font("Arial",Font.PLAIN,18);
       l2.setFont(p1);
       l2.setText("Patients age :");
       t2=new JTextField();
       Font pp2=new Font("Arial",Font.PLAIN,20);
       t2.setFont(pp2);
       t2.setBounds(250,215, 400, 30);
       c.add(l2);
       c.add(t2);
       
       l3=new JLabel();
       l3.setBounds(95,230,230,100);
       Font p3=new Font("Arial",Font.PLAIN,18);
       l3.setFont(p1);
       l3.setText("Blood group :");
       t3=new JTextField();
       Font pp3=new Font("Arial",Font.PLAIN,20);
       t3.setFont(pp3);
       t3.setBounds(250,265,400,30);
       c.add(l3);
       c.add(t3);
       
       l4=new JLabel();
       l4.setBounds(75,280,230,100);
       Font p4=new Font("Arial",Font.PLAIN,18);
       l4.setFont(p1);
       l4.setText("Father's name :");
       t4=new JTextField();
       Font pp4=new Font("Arial",Font.PLAIN,20);
       t4.setFont(pp4);
       t4.setBounds(250,315, 400, 30);
       c.add(l4);
       c.add(t4);
       
       
       l5=new JLabel();
       l5.setBounds(127,330,230,100);
       Font p5=new Font("Arial",Font.PLAIN,18);
       l5.setFont(p1);
       l5.setText("Gender :");
       t5=new JTextField();
       Font pp5=new Font("Arial",Font.PLAIN,20);
       t5.setFont(pp5);
       t5.setBounds(250,365, 400, 30);
       c.add(l5);
       c.add(t5);
       
       l6=new JLabel();
       l6.setBounds(70,380,230,100);
       Font p6=new Font("Arial",Font.PLAIN,18);
       l6.setFont(p1);
       l6.setText("Local Address :");
       t6=new JTextField();
       Font pp6=new Font("Arial",Font.PLAIN,20);
       t6.setFont(pp6);
       t6.setBounds(250,415, 400, 30);
       c.add(l6);
       c.add(t6);
       
       l7=new JLabel();
       l7.setBounds(90,430,230,100);
       Font p7=new Font("Arial",Font.PLAIN,18);
       l7.setFont(p1);
       l7.setText("City /Distric :");
       t7=new JTextField();
       Font pp7=new Font("Arial",Font.PLAIN,20);
       t7.setFont(pp7);
       t7.setBounds(250,465, 400, 30);
       c.add(l7);
       c.add(t7);
       
       l8=new JLabel();
       l8.setBounds(115,480,230,100);
       Font p8=new Font("Arial",Font.PLAIN,18);
       l8.setFont(p1);
       l8.setText("reg.date :");
       t8=new JTextField();
       Font pp8=new Font("Arial",Font.PLAIN,20);
       t8.setFont(pp8);
       t8.setBounds(250,515, 400, 30);
       c.add(l8);
       c.add(t8);
       
       l9=new JLabel();
       l9.setBounds(115,530,230,100);
       Font p9=new Font("Arial",Font.PLAIN,18);
       l9.setFont(p1);
       l9.setText("Contact :");
       t9=new JTextField();
       Font pp9=new Font("Arial",Font.PLAIN,20);
       t9.setFont(pp9);
       t9.setBounds(250,565, 400, 30);
       c.add(l9);
       c.add(t9);
     
       b1=new JButton("SAVE");
       b1.setBounds(750,200,150,30);
       Font p101=new Font("Arial",Font.BOLD,18);
       b1.setFont(p101);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
       c.add(b1);
       
       b2=new JButton("RESET");
       b2.setBounds(750,280,150,30);
       Font p11=new Font("Arial",Font.BOLD,18);
       b2.setFont(p11);
       b2.setBackground(Color.blue);
       b2.setForeground(Color.white);
       c.add(b2);
       
       b3=new JButton("EXIT");
       b3.setBounds(750,360,150,30);
       Font p12=new Font("Arial",Font.BOLD,18);
       b3.setFont(p12);
       b3.setBackground(Color.blue);
       b3.setForeground(Color.white);
       c.add(b3);
       
       Cursor kk=new Cursor(Cursor.HAND_CURSOR);
       b1.setCursor(kk);
       b2.setCursor(kk);
       b3.setCursor(kk);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.setVisible(true);
    }
  public void actionPerformed(ActionEvent e)
  {
     
      if(e.getSource()==b1)
      {
      try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
      PreparedStatement Pstatement=con.prepareStatement("insert into patientreg values(?,?,?,?,?,?,?,?,?,?)");
      
      Pstatement.setString(1,t10.getText());
      Pstatement.setString(2,t1.getText());
      Pstatement.setString(3,t2.getText());
      Pstatement.setString(4,t3.getText());
      Pstatement.setString(5,t4.getText());
      Pstatement.setString(6,t5.getText());
      Pstatement.setString(7,t6.getText());
      Pstatement.setString(8,t7.getText());
      Pstatement.setString(9,t8.getText());
      Pstatement.setString(10,t9.getText());
      
      if(t10.getText()==""&&t1.getText()==""&&t2.getText()==""&&t3.getText()==""&&t4.getText()==""&&t5.getText()==""&&t6.getText()==""&&t7.getText()==""&&t8.getText()==""&&t9.getText()=="")
      {
          JOptionPane.showMessageDialog(null,"Please Fill All Fields");
      }
      else
      {
      Pstatement.executeUpdate();
      JOptionPane.showMessageDialog(null,"Data Registered Successfully");
      }
      
      }
      catch(Exception e1)
      {
          System.out.println(e1);
      }
      }
      if(e.getSource()==b2)
      {
          t10.setText(" ");
          t1.setText(" ");
          t2.setText(" ");
          t3.setText(" ");
          t3.setText(" ");
          t4.setText(" ");
          t5.setText(" ");
          t6.setText(" ");
          t7.setText(" ");
          t8.setText(" ");
          t9.setText(" ");
          
      }
      if(e.getSource()==b3)
      {
          home j=new home();
      }
      
  }
    public static void main(String[] args) {
        new patientreg();
    }
}
