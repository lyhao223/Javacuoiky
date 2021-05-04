/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.KhachHangDAO;
import Model.KhachHangDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.sql.ResultSet;

/**
 *
 * @author huynh
 */
public class KhachHangBUS {
    public static ArrayList<KhachHangDTO> kh;
    public static ArrayList<KhachHangDTO> getKH(){
        return kh;
    }
     public static void setKH(ArrayList<KhachHangDTO> kh){
        KhachHangBUS.kh=kh;
    }

   
    public KhachHangBUS(){
        kh=null;
    }
    
   
    public ArrayList dockhachhang() throws Exception{
        KhachHangDAO data=new KhachHangDAO();
        if(kh==null) kh=new ArrayList<KhachHangDTO>();
        kh=data.dockhachang();
        Vector header=new Vector();
        header.add("HỌ");
        header.add("TÊN");
        header.add("MÃ");
        header.add("PHONE");
        header.add("Address");
        header.add("MAIL");
        return kh;
        
    }
    public void them(KhachHangDTO khach) throws Exception{
        KhachHangDAO data=new KhachHangDAO();
        data.them(khach);
        kh.add(khach);
    }
    public void xoa(int vitri) throws Exception{
        KhachHangDAO data = new KhachHangDAO();
        kh = data.dockhachang();
        KhachHangDTO khh = kh.get(vitri);
        data.xoa(khh.getMa());
        kh = data.dockhachang();
    }
    public void sua (KhachHangDTO khh) throws Exception{
        KhachHangDAO data = new KhachHangDAO();
        
        data.sua(khh);
        kh = data.dockhachang();
    }
     public ArrayList<KhachHangDTO> timKiemTheoMaTenSP(String key) throws Exception{
        KhachHangDAO Data = new KhachHangDAO();
        ArrayList<KhachHangDTO> Result = new ArrayList<>();

        kh = Data.dockhachang();
        
        key = key.trim();
        key = key.replaceAll("\\s+"," ");
        key = key.toLowerCase();
        
        for(KhachHangDTO khh : kh){
            if(khh.getMa().toLowerCase().contains(key) || khh.getTen().toLowerCase().contains(key))
                Result.add(khh);                
        }
        return Result;
    }
}
