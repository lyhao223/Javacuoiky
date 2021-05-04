/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Nhanvien {
     String maNhanvien;
     String hoNhanvien;
     String tenNhanvien;
     String chucvuNhanvien;
     long  luongNhanvien;
     long sdtNhanvien;

    public Nhanvien() {
        this.maNhanvien=null;
        this.hoNhanvien=null;
        this.tenNhanvien=null;
        this.chucvuNhanvien=null;
        this.luongNhanvien=0;
        this.sdtNhanvien=0;
        
    }

    public Nhanvien(String maNhanvien, String hoNhanvien, String tenNhanvien, String chucvuNhanvien, long luongNhanvien, long sdtNhanvien) {
        this.maNhanvien = maNhanvien;
        this.hoNhanvien = hoNhanvien;
        this.tenNhanvien = tenNhanvien;
        this.chucvuNhanvien = chucvuNhanvien;
        this.luongNhanvien = luongNhanvien;
        this.sdtNhanvien = sdtNhanvien;
    }
    
    
   

 

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getHoNhanvien() {
        return hoNhanvien;
    }

    public void setHoNhanvien(String hoNhanvien) {
        this.hoNhanvien = hoNhanvien;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public String getChucvuNhanvien() {
        return chucvuNhanvien;
    }

    public void setChucvuNhanvien(String chucvuNhanvien) {
        this.chucvuNhanvien = chucvuNhanvien;
    }

    public long getLuongNhanvien() {
        return luongNhanvien;
    }

    public void setLuongNhanvien(long luongNhanvien) {
        this.luongNhanvien = luongNhanvien;
    }

    public long getSdtNhanvien() {
        return sdtNhanvien;
    }

    public void setSdtNhanvien(long sdtNhanvien) {
        this.sdtNhanvien = sdtNhanvien;
    }
}
