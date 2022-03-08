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
public class home extends JFrame implements ActionListener{
    
     JFrame f;
     JLabel l1=new JLabel("HOSPITAL MENU");    
     JButton  b1=new JButton("Register Doctor");
     JButton  b2=new JButton("Register Patient");
     JButton b3=new JButton("Get Appointment");
     JButton b4=new JButton("view Appointments");
     JButton  b5=new JButton("manage doctor details");
     JButton b6=new JButton("manage patient details");
     JButton b7=new JButton("view doctors available");
     public void set()
     {
             
            l1.setBounds(280,20,800,50);
            l1.setForeground(Color.red);
            Font ff=new Font("Arial",Font.ITALIC,50);
            l1.setFont(ff);
                       
            b1.setBounds(80,100,250,100);
            Font f1=new Font("Arial",Font.ITALIC,20);
            b1.setFont(f1);
            b1.setBackground(Color.red);
            b1.setForeground(Color.white);
            
            b2.setBounds(340,100,250,100);
            Font f2=new Font("Arial",Font.ITALIC,20);
            b2.setFont(f1);
            b2.setBackground(Color.red);
            b2.setForeground(Color.white);
        
            b3.setBounds(600,100,250,100);
            Font f3=new Font("Arial",Font.ITALIC,20);
            b3.setFont(f1);
            b3.setBackground(Color.red);
            b3.setForeground(Color.white);
          
            b4.setBounds(80,250,250,100);
            Font f4=new Font("Arial",Font.ITALIC,20);
            b4.setFont(f1);
            b4.setBackground(Color.red);
            b4.setForeground(Color.white);
            
          
            b5.setBounds(340,250,250,100);
            Font f5=new Font("Arial",Font.ITALIC,20);
            b5.setFont(f1);
            b5.setBackground(Color.red);
            b5.setForeground(Color.white);
          
            b6.setBounds(600,250,250,100);
            Font f6=new Font("Arial",Font.ITALIC,20);
            b6.setFont(f1);
            b6.setBackground(Color.red);
            b6.setForeground(Color.white);
            
             b7.setBounds(340,400,250,100);
            Font f7=new Font("Arial",Font.ITALIC,20);
            b7.setFont(f1);
            b7.setBackground(Color.red);
            b7.setForeground(Color.white);
     }
           home()
            {
                createwindow();
                set();
                add();
             
        
            }
           public void add()
           {
          
            Cursor cur=new Cursor(Cursor.HAND_CURSOR);
             b1.setCursor(cur);
             b2.setCursor(cur);
             b3.setCursor(cur);
             b4.setCursor(cur);
            b5.setCursor(cur);
            b6.setCursor(cur);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
                    
            f.add(l1);
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(b5);
            f.add(b6);
           f.add(b7);
           
            }
          public void createwindow ()
          {
              f=new JFrame();
              f.setBounds(40, 40,1000,600);
              f.getContentPane().setLayout(null);
              f.getContentPane().setBackground(Color.orange);
              f.setVisible(true);
              f.setResizable(true);
              
          }
         public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==b1)
         {
             doctorreg h=new doctorreg();
         }
         if(e.getSource()==b2)
         {
             patientreg i=new patientreg();
         }
         if(e.getSource()==b3)
         {
             appoinment k= new appoinment();
         }
         if(e.getSource()==b4)
         {
            appoindet p=new appoindet();
         }
         if(e.getSource()==b5)
         {
             managedoctor y=new managedoctor();
         }
         if(e.getSource()==b6)
         {
             managepatient r=new managepatient();
         }
         if(e.getSource()==b7)
         {
             doctordetails q=new doctordetails();
         }
     } 

     
          
           public static void main(String[] args) {
               
           new home();   
        
    }

    
}