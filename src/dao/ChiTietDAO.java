/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.ChiTietDTO;
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
public class ChiTietDAO {
    String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    
    ConnectionSQL conn;
    
    public ChiTietDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public ArrayList docchitiet() throws Exception{
        ArrayList chitiet=new ArrayList<ChiTietDTO>();
        try {
            String qry="SELECT * FROM chitietHD WHERE 1";
             ResultSet rs=conn.excuteQuery(qry); 
           while(rs.next()){
               ChiTietDTO ct=new ChiTietDTO();
               ct.setMaHD(rs.getString(1));
               ct.setMaSP(rs.getString(2));
               ct.setSL(rs.getInt(3));
               ct.setDonGia(rs.getFloat(4));
               ct.setTT(rs.getFloat(5));
               chitiet.add(ct);
           }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Loi ko doc dc chi tiet Hoa Don");
        }
        return chitiet;
        
    }
    public void them(ChiTietDTO ct) throws Exception {
        
            String qry="INSERT INTO chitiethd VALUES ('";
           
                qry += ct.getMaHD()+ "','";
                qry += ct.getMaSP()+"','";
                qry += ct.getSL()+ "','";
                qry += ct.getDonGia()+ "','";
                qry += ct.getTT()+ "')";
        
        conn.excuteUpdate(qry);
    }
}
