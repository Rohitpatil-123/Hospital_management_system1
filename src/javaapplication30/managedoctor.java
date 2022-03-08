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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class managedoctor extends JFrame implements ActionListener {
    JFrame frame;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,tt1;
    JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9,ll1;
    JButton b1,b4,b5,b2,b3;
    
    managedoctor(){
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
       l.setText("Manage Doctor's Details");
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
       l8.setBounds(95,510,230,100);
       Font p77=new Font("Arial",Font.PLAIN,18);
       l8.setFont(p77);
       l8.setText("qualification :");
       t8=new JTextField();
       Font pp71=new Font("Arial",Font.PLAIN,20);
       t8.setFont(pp71);
       t8.setBounds(250,545, 400, 30);
       c.add(l8);
       c.add(t8);
       
       b1=new JButton("SEARCH");
       b1.setBounds(750,160,150,30);
       Font p10=new Font("Arial",Font.BOLD,18);
       b1.setFont(p10);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
       c.add(b1);
       
       b4=new JButton("UPDATE");
       b4.setBounds(750,230,150,30);
       Font p15=new Font("Arial",Font.BOLD,18);
       b4.setFont(p15);
       b4.setBackground(Color.blue);
       b4.setForeground(Color.white);
       c.add(b4);
       
       b5=new JButton("DELETE");
       b5.setBounds(750,290,150,30);
       Font p16=new Font("Arial",Font.BOLD,18);
       b5.setFont(p16);
       b5.setBackground(Color.blue);
       b5.setForeground(Color.white);
       c.add(b5);
       
       b2=new JButton("RESET");
       b2.setBounds(750,360,150,30);
       Font p11=new Font("Arial",Font.BOLD,18);
       b2.setFont(p11);
       b2.setBackground(Color.blue);
       b2.setForeground(Color.white);
       c.add(b2);
       
       b3=new JButton("EXIT");
       b3.setBounds(750,440,150,30);
       Font p22=new Font("Arial",Font.BOLD,18);
       b3.setFont(p22);
       b3.setBackground(Color.blue);
       b3.setForeground(Color.white);
       c.add(b3);
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b5.addActionListener(this);
       b4.addActionListener(this);
       
       Cursor kk=new Cursor(Cursor.HAND_CURSOR);
       b1.setCursor(kk);
       b2.setCursor(kk);
       b3.setCursor(kk);
       b4.setCursor(kk);
       b5.setCursor(kk);
       
       frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from doctorreg where doctor_id="+tt1.getText());
            while(rs.next())
            {
                t1.setText(rs.getString(2));
                t2.setText(rs.getString(3));
                t3.setText(rs.getString(4));
                t4.setText(rs.getString(5));
                t5.setText(rs.getString(6));
                t6.setText(rs.getString(7));
                t7.setText(rs.getString(8));
                t8.setText(rs.getString(9));
            }
              con.close();
            }
            catch(Exception e7)
            {
                System.out.println(e7);
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
            t8.setText("");
            
        }
        if(e.getSource()==b3)
        {
            home l=new home();
        }
        if(e.getSource()==b5)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                String sql="DELETE FROM doctorreg WHERE  doctor_id="+tt1.getText();
                PreparedStatement statement =con.prepareStatement(sql);
                int rowsDelete;
                rowsDelete=statement.executeUpdate();
                if(rowsDelete>0)
        {
        JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
        }
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(managedoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(managedoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        if(e.getSource()==b4)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                
                
                PreparedStatement statement=con.prepareStatement("update doctorreg set doctor_id=? ,doctor_name=?,department=?,checkup_fees=?,experience=?,local_address=?,city_distric=?,contact_no=?,qualification=? where doctor_id="+tt1.getText());
                statement.setString(1, tt1.getText());
                statement.setString(2, t1.getText());
                statement.setString(3, t2.getText());
                statement.setString(4, t3.getText());
                statement.setString(5, t4.getText());
                statement.setString(6, t5.getText());
                statement.setString(7, t6.getText());
                statement.setString(8, t7.getText());
                statement.setString(9, t8.getText());
                
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
                con.close();
            }
            catch(Exception e8)
            {
                System.out.println(e8);
            }
        }
            
        }
        public static void main(String[] args) {
        new managedoctor();
    }
    }
    
    
    

