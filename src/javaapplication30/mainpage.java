package javaapplication30;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class mainpage {
    
    public static void main(String[] args) {
        JLabel l3;
   JFrame f=new JFrame("form");
        l3=new JLabel("Hospital Management System");
         l3.setFont(new Font("Tahoma", Font.PLAIN, 35));
         l3.setBounds(60,50,470,50);
         l3.setForeground(Color.red);
         
         
    JButton b1=new JButton ("Login");
    b1.setBounds(140,150,100,30);
    b1.setBackground(Color.green);
    b1.setFont(new Font("Tahoma", Font.BOLD, 18));
    b1.setForeground(Color.red);
    
    JButton b2=new JButton ("Registration");
    b2.setBounds(280,150,150,30);
    b2.setBackground(Color.green);
    b2.setFont(new Font("Tahoma", Font.BOLD, 18));
    b2.setForeground(Color.red);

    
    f.add(b1);f.add(b2);f.add(l3);
    
    f.setSize(600,400);
    f.setLocation(300, 100);
    f.setLayout(null);
    f.setVisible(true);
    
        b1.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) { 
            
            
          loginpage h=new loginpage();
            
  
}  
});     
        b2.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) { 
            
            JavaApplication30 j=new JavaApplication30();
  
}  
});           
        
    }
    
}
