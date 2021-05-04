/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Sanpham {
    String maSanpham;
    String tenSanpham;
    int soluongSanpham;
    long dongiaSanpham;
    int baohanhSanpham;
    String congdung;
    String chieudai;
    String chieurong;
    String chieucao;
    String trongluong;

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getChieudai() {
        return chieudai;
    }

    public void setChieudai(String chieudai) {
        this.chieudai = chieudai;
    }

    public String getChieurong() {
        return chieurong;
    }

    public void setChieurong(String chieurong) {
        this.chieurong = chieurong;
    }

    public String getChieucao() {
        return chieucao;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public String getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(String trongluong) {
        this.trongluong = trongluong;
    }
 
    public String getMaSanpham() {
        return maSanpham;
    }

    public void setMaSanpham(String maSanpham) {
        this.maSanpham = maSanpham;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public int getSoluongSanpham() {
        return soluongSanpham;
    }

    public void setSoluongSanpham(int soluongSanpham) {
        this.soluongSanpham = soluongSanpham;
    }

    public long getDongiaSanpham() {
        return dongiaSanpham;
    }

    public void setDongiaSanpham(long dongiaSanpham) {
        this.dongiaSanpham = dongiaSanpham;
    }

    public int getBaohanhSanpham() {
        return baohanhSanpham;
    }

    public void setBaohanhSanpham(int baohanhSanpham) {
        this.baohanhSanpham = baohanhSanpham;
    }

    public void add(List<Sanpham> sp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
