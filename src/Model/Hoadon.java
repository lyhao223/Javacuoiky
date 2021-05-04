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
public class Hoadon {
    private String maHoadon;
    private String maKhachhang;
    private String maNhanvien;
    private String tongtienHD;
    private String ngaylapHD;

    public Hoadon(String maHoadon, String maKhachhang, String maNhanvien, String tongtienHD, String ngaylapHD) {
        this.maHoadon = maHoadon;
        this.maKhachhang = maKhachhang;
        this.maNhanvien = maNhanvien;
        this.tongtienHD = tongtienHD;
        this.ngaylapHD = ngaylapHD;
    }

    public String getMaHoadon() {
        return maHoadon;
    }

    public void setMaHoadon(String maHoadon) {
        this.maHoadon = maHoadon;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getTongtienHD() {
        return tongtienHD;
    }

    public void setTongtienHD(String tongtienHD) {
        this.tongtienHD = tongtienHD;
    }

    public String getNgaylapHD() {
        return ngaylapHD;
    }

    public void setNgaylapHD(String ngaylapHD) {
        this.ngaylapHD = ngaylapHD;
    }
    
}
