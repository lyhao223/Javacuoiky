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
public class Khachhang {
    private String maKhachhang;
    private String tenKhachhang;
    private String sdtKhachhang;
    private String dcKhachhang;

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getTenKhachhang() {
        return tenKhachhang;
    }

    public void setTenKhachhang(String tenKhachhang) {
        this.tenKhachhang = tenKhachhang;
    }

    public String getSdtKhachhang() {
        return sdtKhachhang;
    }

    public void setSdtKhachhang(String sdtKhachhang) {
        this.sdtKhachhang = sdtKhachhang;
    }

    public String getDcKhachhang() {
        return dcKhachhang;
    }

    public void setDcKhachhang(String dcKhachhang) {
        this.dcKhachhang = dcKhachhang;
    }

    public Khachhang(String maKhachhang, String tenKhachhang, String sdtKhachhang, String dcKhachhang) {
        this.maKhachhang = maKhachhang;
        this.tenKhachhang = tenKhachhang;
        this.sdtKhachhang = sdtKhachhang;
        this.dcKhachhang = dcKhachhang;
    }
}
