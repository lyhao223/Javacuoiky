/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import Model.Nhanvien;
import Model.Sanpham;
import dao.hanghoaDAO;
import dao.nhanvienDAO;
import gui.nhanvien;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author ADMIN
 */
public class NhanvienBUS {

    /**
     *
     */
   
    private static ArrayList<Nhanvien> DSNV;
    public static ArrayList<Nhanvien> getDSNV(){
        return DSNV;
    }
    public static void setDSNV(ArrayList<Nhanvien> DSNV){
        NhanvienBUS.DSNV=DSNV;
    }

   
    public NhanvienBUS(){
        DSNV=null;
    }
    
    public boolean validName(String name) throws Exception{
        nhanvienDAO Data = new nhanvienDAO();
        DSNV = Data.docDSSP();
        
        name = name.trim();
        
        for(Nhanvien sp : DSNV){
            if(sp.getMaNhanvien().equals(name)){
                return false;
            }
        }
        
        return true;
    }
    public boolean vaildID(String id) throws Exception{
        nhanvienDAO Data= new nhanvienDAO();
        DSNV = Data.docDSSP();
        id=id.trim();
        for(Nhanvien nv:DSNV){
            if(nv.getMaNhanvien().equals(id)){
                return false;
            }
        }
        return true;
    }
    public boolean validNumber(String Num){
        for(int i = 0; i < Num.length(); i++){
            if(Num.charAt(i) < '0' || Num.charAt(i) > '9'){
                return false;
            }
        }
        
        return parseInt(Num) > 0;        
    }
    
    public void docDSNV() throws Exception {
        nhanvienDAO data = new nhanvienDAO();
        if(DSNV !=null){
            DSNV=new ArrayList<>();
        }
        DSNV=data.docDSSP();
    }
    public void them(Nhanvien sp) throws Exception{
        nhanvienDAO data = new nhanvienDAO();
        data.them(sp);
        DSNV=data.docDSSP();
    }
     public ArrayList doc() throws Exception{
        nhanvienDAO data=new nhanvienDAO();
        if(DSNV==null) DSNV=new ArrayList<Nhanvien>();
        DSNV=data.docDSSP();
        Vector header=new Vector();
        header.add("HỌ");
        header.add("TÊN");
        header.add("MÃ");
        header.add("PHONE");
        header.add("Address");
        header.add("MAIL");
        return DSNV;
        
    }
    public void xoa(int vitri) throws Exception{
        nhanvienDAO data = new nhanvienDAO();
        DSNV = data.docDSSP();
        Nhanvien sp = DSNV.get(vitri);
        data.xoa(sp.getMaNhanvien());
        DSNV = data.docDSSP();
    }
    public void sua (Nhanvien sp) throws Exception{
        nhanvienDAO data = new nhanvienDAO();
        
        data.sua(sp);
        DSNV = data.docDSSP();
    }
      public Nhanvien timkiemSPTheoMaSP(String maSP) throws Exception{
        Nhanvien KetQua = new Nhanvien();
        nhanvienDAO Data = new nhanvienDAO();
        
        DSNV = Data.docDSSP();
        
        for(Nhanvien sp : DSNV){
            if(maSP.equals(sp.getMaNhanvien()))
                KetQua = sp;                
        }
        return KetQua;
    }
      public ArrayList<Nhanvien> timKiemTheoMaTenSP(String key) throws Exception{
        nhanvienDAO Data = new nhanvienDAO();
        ArrayList<Nhanvien> Result = new ArrayList<>();

        DSNV = Data.docDSSP();
        
        key = key.trim();
        key = key.replaceAll("\\s+"," ");
        key = key.toLowerCase();
        
        for(Nhanvien sp : DSNV){
            if(sp.getMaNhanvien().toLowerCase().contains(key) || sp.getTenNhanvien().toLowerCase().contains(key) || sp.getHoNhanvien().toLowerCase().contains(key))
                Result.add(sp);                
        }
        return Result;
    }
    public ArrayList docnhanvien() throws Exception{
        nhanvienDAO data=new nhanvienDAO();
        if(DSNV==null) DSNV=new ArrayList<Nhanvien>();
        DSNV=data.docnhanvien();
        Vector header=new Vector();
        header.add("HỌ");
        header.add("TÊN");
        header.add("MÃ");
        header.add("PHONE");
        header.add("Address");
        header.add("MAIL");
        return DSNV;
        
    }
}
