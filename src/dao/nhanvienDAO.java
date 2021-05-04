/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import DAO.ConnectionSQL;
import Model.Chitietsanpham;
import Model.Nhanvien;
import Model.Sanpham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**;
 *
 * @author ADMIN
 */
public class nhanvienDAO {
  String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    
    ConnectionSQL conn;
    
    public nhanvienDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public  ArrayList docDSSP() throws Exception{
        ArrayList dssp = new ArrayList<>();
        String qry = "Select * From nhanvien";
        ResultSet rs=conn.excuteQuery(qry);
        while(rs.next()){
            Nhanvien ct = new Nhanvien();
            ct.setMaNhanvien(rs.getString(1));
            ct.setHoNhanvien(rs.getString(2));
            ct.setTenNhanvien(rs.getString(3));
            ct.setChucvuNhanvien(rs.getString(4));
            ct.setLuongNhanvien(rs.getLong(5));
            ct.setSdtNhanvien(rs.getLong(6));
            dssp.add(ct);
        }
        return dssp;
    }
    public ArrayList docnhanvien() throws Exception{
        ArrayList nhanvien=new ArrayList<Nhanvien>();
        try {
            String qry="SELECT * FROM nhanvien WHERE 1";
             ResultSet rs=conn.excuteQuery(qry); 
           while(rs.next()){
               Nhanvien nv=new Nhanvien();
             
               nv.setMaNhanvien(rs.getString(1));
                 nv.setHoNhanvien(rs.getString(2));
               nv.setTenNhanvien(rs.getString(3));
               nv.setChucvuNhanvien(rs.getString(4));
               nv.setLuongNhanvien(rs.getLong(5));
               nv.setSdtNhanvien(rs.getLong(6));
               nhanvien.add(nv);
           }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Loi ko doc dc nhan vien");
        }
        return nhanvien;
    }
    
    public void them (Nhanvien ct) throws Exception{
        String qry = "Insert Into nhanvien Values('";
    qry += ct.getMaNhanvien()+ "','";
    qry += ct.getHoNhanvien()+"','";
    qry += ct.getTenNhanvien()+ "','";
    qry += ct.getChucvuNhanvien()+ "','";
    qry += ct.getLuongNhanvien()+ "','";
    qry += ct.getSdtNhanvien()+ "')";
        
        conn.excuteUpdate(qry);
    }
    public void xoadongdau(Chitietsanpham ct) throws Exception{
        String qry="Delete maSP from chitietsp where maSP=''";
        conn.excuteQuery(qry);
    }
    public void xoa(String ct) throws Exception{
        String qry="Delete from nhanvien where maNV='"+ct+"'";
        conn.excuteUpdate(qry);
    }
    
    public void sua (Nhanvien ct) throws Exception{
    String qry = "Update nhanvien SET ";   
    qry += "hoNV = '" + ct.getHoNhanvien()+"',";
    qry += "tenNV = '" + ct.getTenNhanvien()+ "',";
    qry += "chucvuNV = '" + ct.getChucvuNhanvien()+ "',";
    qry += "luongNV = " + ct.getLuongNhanvien()+ ",";
    qry += "sdtNV = " + ct.getSdtNhanvien()+ " where maNV ='" + ct.getMaNhanvien()+ "'";
    conn.excuteUpdate(qry) ;  
    
    }
   
   
    
    
    
       

   
}
