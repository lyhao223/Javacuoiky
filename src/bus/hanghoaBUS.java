/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import Model.HoaDonDTO;
import Model.Sanpham;
import static bus.HoaDonBUS.hd;
import dao.hanghoaDAO;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author ADMIN
 */
public class hanghoaBUS {

    /**
     *
     */
   
    private static ArrayList<Sanpham> DSSP;
    public static ArrayList<Sanpham> getDSSP(){
        return DSSP;
    }
    public static void setDSSP(ArrayList<Sanpham> DSSP){
        hanghoaBUS.DSSP=DSSP;
    }

   
    public hanghoaBUS(){
        DSSP=null;
    }
    
    public boolean validName(String name) throws Exception{
        hanghoaDAO Data = new hanghoaDAO();
        DSSP = Data.docDSSP();
        
        name = name.trim();
        
        for(Sanpham sp : DSSP){
            if(sp.getMaSanpham().equals(name)){
                return false;
            }
        }
        
        return true;
    }
    public boolean vaildID(String id) throws Exception{
        hanghoaDAO Data= new hanghoaDAO();
        DSSP = Data.docDSSP();
        id=id.trim();
        for(Sanpham sp:DSSP){
            if(sp.getMaSanpham().equals(id)){
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
    public ArrayList doc() throws Exception{
        hanghoaDAO data=new hanghoaDAO();
        if(DSSP==null) DSSP=new ArrayList<Sanpham>();
        DSSP=data.docDSSP();
        Vector header=new Vector();
        header.add("MÃ SP");
        header.add("TÊN SP");
        header.add("SỐ LƯỢNG");
        header.add("ĐƠN GIÁ");
        header.add("BẢO HÀNH");

        return DSSP;
        
    }
    public void docDSSP() throws Exception {
        hanghoaDAO data = new hanghoaDAO();
        if(DSSP !=null){
            DSSP=new ArrayList<>();
        }
        DSSP=data.docDSSP();
    }
    public void them(Sanpham sp) throws Exception{
        hanghoaDAO data = new hanghoaDAO();
        data.them(sp);
        DSSP=data.docDSSP();
    }
    public void xoa(int vitri) throws Exception{
        hanghoaDAO data = new hanghoaDAO();
        DSSP = data.docDSSP();
        Sanpham sp = DSSP.get(vitri);
        data.xoa(sp.getMaSanpham());
        DSSP = data.docDSSP();
    }
    public void sua (Sanpham sp) throws Exception{
        hanghoaDAO data = new hanghoaDAO();
        
        data.sua(sp);
        DSSP = data.docDSSP();
    }
      public Sanpham timkiemSPTheoMaSP(String maSP) throws Exception{
        Sanpham KetQua = new Sanpham();
        hanghoaDAO Data = new hanghoaDAO();
        
        DSSP = Data.docDSSP();
        
        for(Sanpham sp : DSSP){
            if(maSP.equals(sp.getMaSanpham()))
                KetQua = sp;                
        }
        return KetQua;
    }
      public ArrayList<Sanpham> timKiemTheoMaTenSP(String key) throws Exception{
        hanghoaDAO Data = new hanghoaDAO();
        ArrayList<Sanpham> Result = new ArrayList<>();

        DSSP = Data.docDSSP();
        
        key = key.trim();
        key = key.replaceAll("\\s+"," ");
        key = key.toLowerCase();
        
        for(Sanpham sp : DSSP){
            if(sp.getMaSanpham().toLowerCase().contains(key) || sp.getTenSanpham().toLowerCase().contains(key))
                Result.add(sp);                
        }
        return Result;
    }
}
