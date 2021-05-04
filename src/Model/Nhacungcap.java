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
public class Nhacungcap {
    private String maNhacungcap;
    private String tenNhacungcap;
    private String sdtNhacungcap;
    private String dcNhacungcap;

    public Nhacungcap(String maNhacungcap, String tenNhacungcap, String sdtNhacungcap, String dcNhacungcap) {
        this.maNhacungcap = maNhacungcap;
        this.tenNhacungcap = tenNhacungcap;
        this.sdtNhacungcap = sdtNhacungcap;
        this.dcNhacungcap = dcNhacungcap;
    }

    public String getMaNhacungcap() {
        return maNhacungcap;
    }

    public void setMaNhacungcap(String maNhacungcap) {
        this.maNhacungcap = maNhacungcap;
    }

    public String getTenNhacungcap() {
        return tenNhacungcap;
    }

    public void setTenNhacungcap(String tenNhacungcap) {
        this.tenNhacungcap = tenNhacungcap;
    }

    public String getSdtNhacungcap() {
        return sdtNhacungcap;
    }

    public void setSdtNhacungcap(String sdtNhacungcap) {
        this.sdtNhacungcap = sdtNhacungcap;
    }

    public String getDcNhacungcap() {
        return dcNhacungcap;
    }

    public void setDcNhacungcap(String dcNhacungcap) {
        this.dcNhacungcap = dcNhacungcap;
    }
    
}
