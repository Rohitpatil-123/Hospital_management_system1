/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author RR
 */
public class appoinment extends JFrame implements ActionListener {
    JFrame o;
    JLabel k, k1,k2,k3,k4,k5,k6,k7,k8,k9;
    JButton l1,l2,l3,l4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JTextArea a1,a2;
     final DefaultListModel<String> l14 ;
            final JList<String> list1;
            final DefaultListModel<String> l15 ;
            final JList<String> list2;
    appoinment(){
       o=new JFrame();
       
        k=new JLabel("Apointment Details");
        k.setBounds(200,50,400,80);
        Font h=new Font("Arial",Font.PLAIN,45);
        k.setFont(h);
        k.setForeground(Color.red);
        add(k);
       
       
        k1=new JLabel("Apointment id :");
        k1.setBounds(100,160,200,40);
        Font h1=new Font("Arial",Font.PLAIN,20);
        k1.setFont(h1);
        t1=new JTextField();
        t1.setBounds(260,165,100,30);
        Font h2=new Font("Arial",Font.PLAIN,20);
        t1.setFont(h2);
        add(t1);
        add(k1);
        
        k2=new JLabel("Date :");
        k2.setBounds(400,160,200,40);
        Font h3=new Font("Arial",Font.PLAIN,20);
        k2.setFont(h3);
        t2=new JTextField();
        t2.setBounds(460,165,100,30);
        Font h4=new Font("Arial",Font.PLAIN,20);
        t2.setFont(h4);
        add(t2);
        add(k2);
        
        k3=new JLabel("Patient Id and name");
        k3.setBounds(100,210,200,40);
        Font h5=new Font("Arial",Font.PLAIN,20);
        k3.setFont(h5);
        add(k3);
        l14= new DefaultListModel<>();            
          list1 = new JList<>(l14);  
          list1.setBounds(100,260,200,150);
          add(list1);
        
        l4=new JButton("Get Data");
        l4.setBounds(310,215, 120,30);
        Font h19=new Font("Arial",Font.BOLD,20);
        l4.setFont(h19);
        l4.setBackground(Color.green);
        l4.setForeground(Color.white);
        add(l4);
        
        k4=new JLabel("doctor Id and name");
        k4.setBounds(450,210,200,40);
        Font h6=new Font("Arial",Font.PLAIN,20);
        k4.setFont(h6);
        add(k4);
       l15= new DefaultListModel<>();            
          list2 = new JList<>(l15);  
          list2.setBounds(450,260,200,150);
          add(list2);

        
        k5 =new JLabel("Patient Id  :");
        k5.setBounds(100,430,120,30);
        Font h7=new Font("Arial",Font.PLAIN,20);
        k5.setFont(h7);
        add(k5);
        t4=new JTextField();
        t4.setBounds(210,430,100,30);
        Font h8=new Font("Arial",Font.PLAIN,20);
        t4.setFont(h8);
        add(t4);   
        
        k6 =new JLabel("Doctor Id :");
        k6.setBounds(400,430,100,30);
        Font h9=new Font("Arial",Font.PLAIN,20);
        k6.setFont(h9);
        add(k6);
        t5=new JTextField();
        t5.setBounds(510,430,110,30);
        Font h10=new Font("Arial",Font.PLAIN,20);
        t5.setFont(h10);
        add(t5);   
        
        k7 =new JLabel("patient name:");
        k7.setBounds(65,470,150,30);
        Font h11=new Font("Arial",Font.PLAIN,20);
        k7.setFont(h11);
        add(k7);
        t6=new JTextField();
        t6.setBounds(210,470,200,30);
        Font h12=new Font("Arial",Font.PLAIN,20);
        t6.setFont(h12);
        add(t6);   
        
        k8 =new JLabel("Fees :");
        k8.setBounds(430,470,100,30);
        Font h13=new Font("Arial",Font.PLAIN,20);
        k8.setFont(h13);
        add(k8);
        t7=new JTextField();
        t7.setBounds(510,470,100,30);
        Font h14=new Font("Arial",Font.PLAIN,20);
        t7.setFont(h14);
        add(t7);   
        
        l1=new JButton("Save");
        l1.setBounds(150,540, 120,30);
        Font h22=new Font("Arial",Font.BOLD,20);
        l1.setFont(h22);
        l1.setBackground(Color.blue);
        l1.setForeground(Color.white);
        add(l1);
        
        l2=new JButton("Reset");
        l2.setBounds(310,540, 120,30);
        Font h23=new Font("Arial",Font.BOLD,20);
        l2.setFont(h23);
        l2.setBackground(Color.blue);
        l2.setForeground(Color.white);
        add(l2);
        
        l3=new JButton("Exit");
        l3.setBounds(480,540, 120,30);
        Font h17=new Font("Arial",Font.BOLD,20);
        l3.setFont(h17);
        l3.setBackground(Color.blue);
        l3.setForeground(Color.white);
        add(l3);
        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
       setSize(800,700);
       setLocation(210,50);
       setLayout(null);
       setVisible(true);
       
    }
    void patientreg(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from patientreg");
            while(rs.next())
            {
                
              String name=rs.getString("patient_name")+"-"+rs.getString("patient_id");
              
              l14.addElement(name);
            
            }
            list1.setModel(l14);
              con.close();
              
        }
        catch(Exception e2)
        {
            System.out.println(e2);
        }
        
    }
    void doctor()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from doctorreg");
            while(rs.next())
            {
                
             String s= rs.getString("doctor_name")+"-"+rs.getString("doctor_id");
        l15.addElement(s);
             
            }
            list2.setModel(l15);
              con.close();
              
        }
        catch(Exception e2)
        {
            System.out.println(e2);
        }
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
       
        
        if(e.getSource()==l1)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
            PreparedStatement Pstatement=con.prepareStatement("insert into apointment values(?,?,?,?,?,?)");
            Pstatement.setString(1,t1.getText());
            Pstatement.setString(2,t2.getText());
            Pstatement.setString(3,t4.getText());
            Pstatement.setString(4,t5.getText());
            Pstatement.setString(5,t6.getText());
            Pstatement.setString(6,t7.getText());
            Pstatement.executeUpdate();
      JOptionPane.showMessageDialog(null,"Data  Successfully saved");
            }
            catch(Exception e4){
                System.out.println(e4);
                
            }
        }
        if(e.getSource()==l4)
        {
            patientreg();
            doctor();
        }
        if(e.getSource()==l2)
        {
            t1.setText(" ");
            t2.setText(" ");
            
        }
        if(e.getSource()==l3)
        {
            home l=new home();
        }
    }
    public static void main(String[] args) {
        new appoinment();
    }
}
