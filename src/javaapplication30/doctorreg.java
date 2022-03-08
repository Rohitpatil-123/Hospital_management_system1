/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author RR
 */
public class doctorreg extends JFrame implements ActionListener{
    JFrame frame;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,tt1;
    JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9,ll1,l10;
    JButton b1,b2,b3;
    
    doctorreg(){
        frame =new JFrame();
        frame.setSize(1000, 700);
        frame.setLocation(200, 100);
       Container c= frame.getContentPane(); 
       
       c.setLayout(null);
       
       
       l=new JLabel();
       l.setBounds(250,30,500,80);
       Font p=new Font("Arial",Font.PLAIN,45);
       l.setFont(p);
       l.setForeground(Color.red);
       l.setText("Doctor's Registration");
       c.add(l);
       
       ll1=new JLabel();
       ll1.setBounds(80,110,260,100);
       Font p1p=new Font("Arial",Font.PLAIN,18);
       ll1.setFont(p1p);
       ll1.setText("Enter Doctor Id :");
       tt1=new JTextField();
        Font p2p=new Font("Arial",Font.PLAIN,20);
       tt1.setFont(p2p);
       tt1.setBounds(250,145,400,30);
       c.add(ll1);
       c.add(tt1);
       
        l1=new JLabel();
       l1.setBounds(80,160,260,100);
       Font p1=new Font("Arial",Font.PLAIN,18);
       l1.setFont(p1);
       l1.setText("Doctor name :");
       t1=new JTextField();
        Font p2=new Font("Arial",Font.PLAIN,20);
       t1.setFont(p2);
       t1.setBounds(250,195,400,30);
       c.add(l1);
       c.add(t1);
       
       l2=new JLabel();
       l2.setBounds(90,210,230,100);
       Font pp2=new Font("Arial",Font.PLAIN,18);
       l2.setFont(pp2);
       l2.setText("Departmant :");
       t2=new JTextField();
       Font p12=new Font("Arial",Font.PLAIN,20);
       t2.setFont(p12);
       t2.setBounds(250,245, 400, 30);
       c.add(l2);
       c.add(t2);
       
       l3=new JLabel();
       l3.setBounds(65,260,230,100);
       Font p3=new Font("Arial",Font.PLAIN,18);
       l3.setFont(p1);
       l3.setText("Checkup Fees :");
       t3=new JTextField();
       Font pp3=new Font("Arial",Font.PLAIN,20);
       t3.setFont(pp3);
       t3.setBounds(250,295,400,30);
       c.add(l3);
       c.add(t3);
       
       l4=new JLabel();
       l4.setBounds(92,310,230,100);
       Font p4=new Font("Arial",Font.PLAIN,18);
       l4.setFont(p1);
       l4.setText("Experience :");
       t4=new JTextField();
       Font pp4=new Font("Arial",Font.PLAIN,20);
       t4.setFont(pp4);
       t4.setBounds(250,345, 400, 30);
       c.add(l4);
       c.add(t4);
       
       
       l5=new JLabel();
       l5.setBounds(70,360,230,100);
       Font p5=new Font("Arial",Font.PLAIN,18);
       l5.setFont(p1);
       l5.setText("Local Address :");
       t5=new JTextField();
       Font pp5=new Font("Arial",Font.PLAIN,20);
       t5.setFont(pp5);
       t5.setBounds(250,395, 400, 30);
       c.add(l5);
       c.add(t5);
       
       l6=new JLabel();
       l6.setBounds(90,410,230,100);
       Font p6=new Font("Arial",Font.PLAIN,18);
       l6.setFont(p1);
       l6.setText("City / Distric:");
       t6=new JTextField();
       Font pp6=new Font("Arial",Font.PLAIN,20);
       t6.setFont(pp6);
       t6.setBounds(250,445, 400, 30);
       c.add(l6);
       c.add(t6);
       
       l7=new JLabel();
       l7.setBounds(95,460,230,100);
       Font p7=new Font("Arial",Font.PLAIN,18);
       l7.setFont(p1);
       l7.setText("Contact no :");
       t7=new JTextField();
       Font pp7=new Font("Arial",Font.PLAIN,20);
       t7.setFont(pp7);
       t7.setBounds(250,495, 400, 30);
       c.add(l7);
       c.add(t7);
       
       l8=new JLabel();
       l8.setBounds(37,510,230,100);
       Font p87=new Font("Arial",Font.PLAIN,18);
       l8.setFont(p87);
       l8.setText("doctor qualification :");
       t8=new JTextField();
       Font p88=new Font("Arial",Font.PLAIN,20);
       t8.setFont(p88);
       t8.setBounds(250,550, 400, 30);
       c.add(l8);
       c.add(t8);
       
       b1=new JButton("SAVE");
       b1.setBounds(750,200,150,30);
       Font p10=new Font("Arial",Font.BOLD,18);
       b1.setFont(p10);
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
       Font p22=new Font("Arial",Font.BOLD,18);
       b3.setFont(p22);
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
      PreparedStatement Pstatement=con.prepareStatement("insert into doctorreg values(?,?,?,?,?,?,?,?,?)");
      
      Pstatement.setString(1,tt1.getText());
      Pstatement.setString(2,t1.getText());
      Pstatement.setString(3,t2.getText());
      Pstatement.setString(4,t3.getText());
      Pstatement.setString(5,t4.getText());
      Pstatement.setString(6,t5.getText());
      Pstatement.setString(7,t6.getText());
      Pstatement.setString(8,t7.getText());
      Pstatement.setString(9,t8.getText());
           
      Pstatement.executeUpdate();
      JOptionPane.showMessageDialog(null,"Data Registered Successfully");
      
      
      }
      catch(Exception e1)
      {
          System.out.println(e1);
      }
      }
        if(e.getSource()==b2)
        {
            tt1.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
        }
        if(e.getSource()==b3)
        {
            home i=new home();
        }
        
    }
    
    
    public static void main(String[] args) {
        doctorreg o=new doctorreg();
    }
}
