/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Model.HoaDonDTO;
import DAO.ConnectionSQL;
import Model.KhachHangDTO;
import gui.HoaDon;
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
public class HoaDonDAO {
  String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    
    ConnectionSQL conn;
    
    public HoaDonDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public ArrayList dochoadon() throws Exception{
        ArrayList hoadon=new ArrayList<HoaDonDTO>();
        try{
            String qry="SELECT * FROM hoadon WHERE 1";
            ResultSet rs=conn.excuteQuery(qry);
           while(rs.next()){
               HoaDonDTO hd=new HoaDonDTO();
               hd.setMaHD(rs.getString(1));
               hd.setMaKH(rs.getString(2));
               hd.setMaNV(rs.getString(3));
               hd.setNgayNhan(rs.getString(4));
               hd.setNgayGiao(rs.getString(5));
 
               hoadon.add(hd);
           }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Loi ko doc dc hoa don");
        }
       return hoadon;
        
    }
    public void xoa (String Ma) throws Exception{
       
            String qry="DELETE FROM hoadon WHERE maHD='"+Ma+"'";
            conn.excuteUpdate(qry);
    }
    public void them(HoaDonDTO hd) throws Exception {
        
            String qry="INSERT INTO hoadon VALUES ('";
            qry += hd.getMaHD()+ "','";
            qry += hd.getMaKH()+"','";
            qry += hd.getMaNV()+ "','";
            qry += hd.getNgayNhan()+ "','";
            qry += hd.getNgayGiao()+ "')";
            conn.excuteUpdate(qry);
    }
    public void sua (HoaDonDTO hd) throws Exception {
       
            String qry="UPDATE hoadon SET ";
            qry += "maKH = '" + hd.getMaKH()+ "',";
            qry += "maNV = '" + hd.getMaNV()+ "',";
            qry += "ngaynhanHD = '" + hd.getNgayNhan()+ "',";
            qry += "ngaygiaoHD = '" + hd.getNgayGiao()+ "' where maHD ='" + hd.getMaHD()+ "'";
            conn.excuteUpdate(qry);
    }
}
