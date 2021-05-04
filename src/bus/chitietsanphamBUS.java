/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import Model.Chitietsanpham;
import Model.Sanpham;
import dao.chitietsanphamDAO;
import dao.hanghoaDAO;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class chitietsanphamBUS {

    /**
     *
     */
   
    private static ArrayList<Chitietsanpham> DSSP;
    public static ArrayList<Chitietsanpham> getDSSP(){
        return DSSP;
    }
    public static void setDSSP(ArrayList<Chitietsanpham> DSSP){
        chitietsanphamBUS.DSSP=DSSP;
    }

   
    public chitietsanphamBUS(){
        DSSP=null;
    }
    
   
    public boolean vaildID(String id) throws Exception{
        chitietsanphamDAO Data= new chitietsanphamDAO();
        DSSP = Data.docDSSP();
        id=id.trim();
        for(Chitietsanpham sp:DSSP){
            if(sp.getMaSP().equals(id)){
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
    
    public void docDSSP() throws Exception {
        chitietsanphamDAO data = new chitietsanphamDAO();
        if(DSSP !=null){
            DSSP=new ArrayList<>();
        }
        DSSP=data.docDSSP();
    }
    public void them(Chitietsanpham sp) throws Exception{
        chitietsanphamDAO data = new chitietsanphamDAO();
        data.them(sp);
        DSSP=data.docDSSP();
    }
     public void xoa(int vitri) throws Exception{
        chitietsanphamDAO data = new chitietsanphamDAO();
        DSSP = data.docDSSP();
        Chitietsanpham sp = DSSP.get(vitri);
        data.xoa(sp.getMaSP());
        DSSP = data.docDSSP();
    }
    public void sua (Chitietsanpham sp) throws Exception{
        chitietsanphamDAO data = new chitietsanphamDAO();
        
        data.sua(sp);
        DSSP = data.docDSSP();
    }
      public Chitietsanpham timkiemSPTheoMaSP(String maSP) throws Exception{
        Chitietsanpham KetQua = new Chitietsanpham();
        chitietsanphamDAO Data = new chitietsanphamDAO();
        
        DSSP = Data.docDSSP();
        
        for(Chitietsanpham sp : DSSP){
            if(maSP.equals(sp.getMaSP()))
                KetQua = sp;                
        }
        return KetQua;
    }
       public ArrayList<Chitietsanpham> timKiemTheoMaTenSP(String key) throws Exception{
        chitietsanphamDAO Data = new chitietsanphamDAO();
        ArrayList<Chitietsanpham> Result = new ArrayList<>();

        DSSP = Data.docDSSP();
        
        key = key.trim();
        key = key.replaceAll("\\s+"," ");
        key = key.toLowerCase();
        
        for(Chitietsanpham sp : DSSP){
            if(sp.getMaSP().toLowerCase().contains(key) || sp.getCongdungSP().toLowerCase().contains(key))
                Result.add(sp);                
        }
        return Result;
    }
     
}
