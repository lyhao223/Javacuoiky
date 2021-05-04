/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import DAO.ConnectionSQL;
import Model.Chitietsanpham;
import Model.Sanpham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**;
 *
 * @author ADMIN
 */
public class chitietsanphamDAO {
  String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    
    ConnectionSQL conn;
    
    public chitietsanphamDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public  ArrayList docDSSP() throws Exception{
        ArrayList dssp = new ArrayList<>();
        String qry = "Select * From chitietsp";
        ResultSet rs=conn.excuteQuery(qry);
        while(rs.next()){
            Chitietsanpham ct = new Chitietsanpham();
            
            ct.setMaSP(rs.getString(1));
            ct.setCongdungSP(rs.getString(2));
            ct.setChieudaiSP(rs.getInt(3));
            ct.setChieurongSP(rs.getInt(4));
            ct.setChieucaoSP(rs.getInt(5));
            ct.setTrongluongSP(rs.getInt(6));
            dssp.add(ct);
        }
        return dssp;
    }
    
    public void them (Chitietsanpham ct) throws Exception{
        String qry = "Insert Into chitietsp Values('";
    qry += ct.getMaSP()+ "','";
    qry += ct.getCongdungSP()+"','";
    qry += ct.getChieudaiSP()+ "','";
    qry += ct.getChieurongSP()+ "','";
    qry += ct.getChieucaoSP()+ "','";
    qry += ct.getTrongluongSP()+ "')";
        
        conn.excuteUpdate(qry);
    }
    public void xoadongdau(Chitietsanpham ct) throws Exception{
        String qry="Delete maSP from chitietsp where maSP=''";
        conn.excuteQuery(qry);
    }
    public void xoa(String ct) throws Exception{
        String qry="Delete from chitietsp where maSP='"+ct+"'";
        conn.excuteUpdate(qry);
    }
    
    public void sua (Chitietsanpham ct) throws Exception{
    String qry = "Update chitietsp SET ";   
   
    qry += "congdungSP = '" + ct.getCongdungSP()+"',";
    qry += "chieudaiSP = " + ct.getChieudaiSP()+ ",";
    qry += "chieurongSP = " + ct.getChieurongSP()+ ",";
    qry += "chieucaoSP = " + ct.getChieucaoSP()+ ",";
    qry += "trongluongSP = " + ct.getTrongluongSP() + " where maSP ='" + ct.getMaSP()+ "'";
    conn.excuteUpdate(qry) ;  
    
    }
   
   
    
    
    
       

   
}
