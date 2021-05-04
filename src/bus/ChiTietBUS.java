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
    public ChiTietBUS(){
    }
    public ArrayList docchitiet() throws Exception{
        ChiTietDAO data=new ChiTietDAO();
        if(ct==null) ct=new ArrayList<ChiTietDTO>();
        ct=data.docchitiet();
        Vector header=new Vector();
        header.add("MÃHD");
        header.add("MÃSP");
        header.add("SL");
        header.add("ĐƠNGIÁ");
        header.add("THÀNHTIỀN");
        return ct;
    }

    public void them(ChiTietDTO chitiet) throws Exception{
        ChiTietDAO data=new ChiTietDAO();
        data.them(chitiet);
        ct.add(chitiet);
    }
}