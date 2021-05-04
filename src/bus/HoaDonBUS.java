/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.sql.ResultSet;
import Model.HoaDonDTO;
import Model.KhachHangDTO;
import static bus.KhachHangBUS.kh;
import dao.HoaDonDAO;
import gui.HoaDon;
public class HoaDonBUS {
    public static ArrayList<HoaDonDTO> hd;
    public static ArrayList<HoaDonDTO> getHD(){
        return hd;
    }
     public static void setHD(ArrayList<HoaDonDTO> hd){
        HoaDonBUS.hd=hd;
    }

   
    public HoaDonBUS(){
        hd=null;
    }
    public ArrayList dochoadon() throws Exception{
        HoaDonDAO data=new HoaDonDAO();
        if(hd==null) hd=new ArrayList<HoaDonDTO>();
        hd=data.dochoadon();
        Vector header=new Vector();
        header.add("MÃ KH");
        header.add("MÃ HD");
        header.add("MÃ NV");
        header.add("LẬP");
        header.add("GIAO");

        return hd;
        
    }
    public void them(HoaDonDTO hoaddon) throws Exception{
        HoaDonDAO data=new HoaDonDAO();
        data.them(hoaddon);
        hd.add(hoaddon);
    }
    public void xoa(int vitri) throws Exception{
        HoaDonDAO data = new HoaDonDAO();
        hd = data.dochoadon();
        HoaDonDTO sp = hd.get(vitri);
        data.xoa(sp.getMaHD());
        hd = data.dochoadon();
    }
    public void sua(HoaDonDTO hdd) throws Exception{
        HoaDonDAO data=new HoaDonDAO();
        data.sua(hdd);
        hd = data.dochoadon();
    }
    public ArrayList<HoaDonDTO> timKiemTheoMaTenSP(String key) throws Exception{
        HoaDonDAO Data = new HoaDonDAO();
        ArrayList<HoaDonDTO> Result = new ArrayList<>();

        hd = Data.dochoadon();
        
        key = key.trim();
        key = key.replaceAll("\\s+"," ");
        key = key.toLowerCase();
        
        for(HoaDonDTO hdd:hd){
         if(hdd.getMaHD().toLowerCase().contains(key) || hdd.getMaKH().toLowerCase().contains(key)|| hdd.getMaNV().toLowerCase().contains(key))
                Result.add(hdd);                
        }
        return Result;
       
    }
}
