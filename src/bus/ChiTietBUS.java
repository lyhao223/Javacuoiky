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
import Model.ChiTietDTO;
import dao.ChiTietDAO;
public class ChiTietBUS {
    public static ArrayList<ChiTietDTO> ct;
    public static ArrayList<ChiTietDTO> getCT(){
        return ct;
    }
     public static void setCT(ArrayList<ChiTietDTO> ct){
        ChiTietBUS.ct=ct;
    }

   
    public ChiTietBUS(){
        ct=null;
    }
    public ArrayList docchitiet() throws Exception{
        ChiTietDAO data=new ChiTietDAO();
        if(ct==null) ct=new ArrayList<ChiTietDTO>();
        ct=data.docchitiet();
        Vector header=new Vector();
        header.add("MÃ HD");
        header.add("MÃ SP");
        header.add("SL");
        header.add("ĐƠN GIÁ");
        header.add("THÀNH TIỀN");
        return ct;
    }

    public void them(ChiTietDTO chitiet) throws Exception{
        ChiTietDAO data=new ChiTietDAO();
        data.them(chitiet);
        ct.add(chitiet);

    }
}