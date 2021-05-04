/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Model.KhachHangDTO;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxSql;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.ConnectionSQL;
public class KhachHangDAO {
   String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    ConnectionSQL conn;

    public KhachHangDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public ArrayList dockhachang() throws Exception{
        ArrayList khachhang=new ArrayList<KhachHangDTO>();
        try {
            String qry="SELECT * FROM khachhang WHERE 1";
             ResultSet rs=conn.excuteQuery(qry); 
           while(rs.next()){
               KhachHangDTO kh=new KhachHangDTO();
             
               kh.setMa(rs.getString(1));
                 kh.setTen(rs.getString(2));
               kh.setPhone(rs.getString(3));
               kh.setAddress(rs.getString(4));
               khachhang.add(kh);
           }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Loi ko doc dc Khach Hang");
        }
        return khachhang;
        
    }
    public void them(KhachHangDTO kh) throws Exception {
        
            String qry="INSERT INTO khachhang VALUES ('";
              qry += kh.getMa()+ "','";
              qry += kh.getTen()+"','";
              qry += kh.getPhone()+ "','";
              qry += kh.getAddress()+ "')";
           
            conn.excuteUpdate(qry);  
    }
    public void xoa (String Ma) throws Exception{
       
            String qry="DELETE FROM khachhang WHERE maKH='"+Ma+"'";
            
            conn.excuteUpdate(qry);  
    } 
    public void sua (KhachHangDTO kh) throws Exception {
       
            String qry="UPDATE khachhang SET ";
             qry += "tenKH ='" + kh.getTen()+ "',";
             qry += "sdtKH = " + kh.getPhone()+ ",";
             qry += "dcKH = '" + kh.getAddress()+ "' where maKH ='" + kh.getMa()+ "'";
           
            conn.excuteUpdate(qry);  
}
}
