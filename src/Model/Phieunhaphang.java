/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Phieunhaphang {
    private String maPhieunhap;
    private String maNhacungcap;
    private Date ngaynhapPhieunhap;
    private String tongtienPhieunhap;

    public Phieunhaphang(String maPhieunhap, String maNhacungcap, Date ngaynhapPhieunhap, String tongtienPhieunhap) {
        this.maPhieunhap = maPhieunhap;
        this.maNhacungcap = maNhacungcap;
        this.ngaynhapPhieunhap = ngaynhapPhieunhap;
        this.tongtienPhieunhap = tongtienPhieunhap;
    }

    public String getMaPhieunhap() {
        return maPhieunhap;
    }

    public void setMaPhieunhap(String maPhieunhap) {
        this.maPhieunhap = maPhieunhap;
    }

    public String getMaNhacungcap() {
        return maNhacungcap;
    }

    public void setMaNhacungcap(String maNhacungcap) {
        this.maNhacungcap = maNhacungcap;
    }

    public Date getNgaynhapPhieunhap() {
        return ngaynhapPhieunhap;
    }

    public void setNgaynhapPhieunhap(Date ngaynhapPhieunhap) {
        this.ngaynhapPhieunhap = ngaynhapPhieunhap;
    }

    public String getTongtienPhieunhap() {
        return tongtienPhieunhap;
    }

    public void setTongtienPhieunhap(String tongtienPhieunhap) {
        this.tongtienPhieunhap = tongtienPhieunhap;
    }
    
}
