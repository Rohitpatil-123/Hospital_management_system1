
package javaapplication30;


import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class appoindet 
{
  appoindet(){
    try 
  {
      Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
    
      String query = "SELECT * FROM apointment";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "appoinmentid ", "date", "patient id","doctorid","patientname","fees" };
      String data[][] = new String[10][6];
    
      int i = 0;
      while (res.next()) {
        String appid = res.getString("appoinment_id");
        String date = res.getString("date");
        String pid = res.getString("Patient_id");
        String pname = res.getString("Patient_name");
        String did = res.getString("doctor_id");
        String fee = res.getString("fees");
        data[i][0] = appid;
        data[i][1] = date;
        data[i][2] = pid;
        data[i][3] = pname;
        data[i][4] = did;
        data[i][5] = fee;
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("appoinment details");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setSize(700, 450);
      f.setLocation(250,200);
     
      
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException ex) {
          Logger.getLogger(appoindet.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    public static void main(String[] args) {
       new appoindet();
    }
}