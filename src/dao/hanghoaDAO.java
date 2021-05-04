/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import DAO.ConnectionSQL;
import Model.Sanpham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**;
 *
 * @author ADMIN
 */
public class hanghoaDAO {
  String host = "localhost";
  String user = "root";
  String password = "admin";

  String db = "managerjava";
    
    ConnectionSQL conn;
    
    public hanghoaDAO() throws Exception{
            conn = new ConnectionSQL(host, user, password, db);
    }
    public  ArrayList docDSSP() throws Exception{
        ArrayList dssp = new ArrayList<>();
        String qry = "Select * From sanpham";
        ResultSet rs=conn.excuteQuery(qry);
        while(rs.next()){
            Sanpham sp = new Sanpham();
            sp.setMaSanpham(rs.getString(1));
            sp.setTenSanpham(rs.getString(2));
            sp.setSoluongSanpham(rs.getInt(3));
            sp.setDongiaSanpham(rs.getLong(4));
            sp.setBaohanhSanpham(rs.getInt(5));
            dssp.add(sp);
        }
        return dssp;
    }
    
    public void them (Sanpham sp) throws Exception{
        String qry = "Insert Into sanpham Values('";
    qry += sp.getMaSanpham()+ "','";
    qry += sp.getTenSanpham()+"','";
    qry += sp.getSoluongSanpham()+ "','";
    qry += sp.getDongiaSanpham()+ "','";
    qry += sp.getBaohanhSanpham()+ "')";
        
        conn.excuteUpdate(qry);
    }
    public void xoadongdau(Sanpham sp) throws Exception{
        String qry="Delete maSP from sanpham where maSP=''";
        conn.excuteQuery(qry);
    }
    public void xoa(String masp) throws Exception{
        String qry="Delete from sanpham where maSP='"+masp+"'";
        conn.excuteUpdate(qry);
    }
    
    public void sua (Sanpham sp) throws Exception{
    String qry = "Update sanpham SET ";   
    qry += "tenSP = '" + sp.getTenSanpham()+"',";
    qry += "soluongSP = " + sp.getSoluongSanpham()+ ",";
    qry += "dongiaSP = " + sp.getDongiaSanpham()+ ",";
    qry += "baohanhSP = " + sp.getBaohanhSanpham()+ " where maSP ='" + sp.getMaSanpham()+ "'";
    conn.excuteUpdate(qry) ;  
    
    }
   
    public Sanpham getSanphamByMaSP(String masp) throws Exception{
        
        String qry = "Select * From sanpham where maSP='"+masp+"'";
        ResultSet rs=conn.excuteQuery(qry);
        try{
            
        while(rs.next()){
            Sanpham sp=new Sanpham();
            sp.setMaSanpham(rs.getString("maSP"));
            sp.setTenSanpham(rs.getString("tenSP"));
            sp.setSoluongSanpham(rs.getInt("soluongSP"));
            sp.setDongiaSanpham(rs.getLong("dongiaSP"));
            sp.setBaohanhSanpham(rs.getInt("baohanhSP"));
            return sp;
        }
    }catch (SQLException e){
}
        return null;
    }
    
    /**
     *
     * @return
     * @throws java.lang.Exception
     */
       public List<Sanpham> getAllSanpham() throws Exception {
        List<Sanpham> sp = new ArrayList<>();
        
        String sql = "SELECT * FROM sanpham";
        ResultSet rs=conn.excuteQuery(sql);
        
        try {
            
            while(rs.next()){
                Sanpham sanpham = new Sanpham();
                
                sanpham.setMaSanpham(rs.getString("maSP"));
                sanpham.setTenSanpham(rs.getString("tenSP"));
                sanpham.setSoluongSanpham(rs.getInt("soluongSP"));
                sanpham.setDongiaSanpham(rs.getLong("dongiaSP"));              
                sanpham.setBaohanhSanpham(rs.getInt("baohanhSP"));
               
                
                sanpham.add(sp);
            }
        } catch (SQLException e) {
        }
        
        return sp;
    }

   
}
