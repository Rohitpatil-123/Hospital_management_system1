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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class doctordetails 
{
  doctordetails(){
    try 
  {
      Class.forName("com.mysql.jdbc.Driver");
     
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
      String query = "SELECT * FROM doctorreg";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "doctor id ", "doctor name", "department","checkup fees","experience","local address","city/distric","contact_no","doctor qualification" };
      String data[][] = new String[10][9];
    
      int i = 0;
      while (res.next()) {
        String appid = res.getString("doctor_id");
        String date = res.getString("doctor_name");
        String pid = res.getString("department");
        String pname = res.getString("checkup_fees");
        String did = res.getString("experience");
        String fee = res.getString("local_address");
        String fes = res.getString("city_distric");
        String fas = res.getString("contact_no");
        String fue = res.getString("qualification");
        data[i][0] = appid;
        data[i][1] = date;
        data[i][2] = pid;
        data[i][3] = pname;
        data[i][4] = did;
        data[i][5] = fee;
        data[i][6] = fes;
        data[i][7] = fas;
        data[i][8] = fue;
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      table.setSize(600,400);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("doctor details");
      JPanel panel = new JPanel();
      panel.add(pane);
  
      f.add(panel);
      f.setSize(900, 450);
      f.setLocation(250,200);
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException ex) {
          Logger.getLogger(appoindet.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    public static void main(String[] args) {
       new doctordetails();
    }
}
