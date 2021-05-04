/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Chitietsanpham {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    String maSP;
    String congdungSP;
    int chieudaiSP;
    int chieurongSP;
    int chieucaoSP;
    int trongluongSP;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getCongdungSP() {
        return congdungSP;
    }

    public void setCongdungSP(String congdungSP) {
        this.congdungSP = congdungSP;
    }

    public int getChieudaiSP() {
        return chieudaiSP;
    }

    public void setChieudaiSP(int chieudaiSP) {
        this.chieudaiSP = chieudaiSP;
    }

    public int getChieurongSP() {
        return chieurongSP;
    }

    public void setChieurongSP(int chieurongSP) {
        this.chieurongSP = chieurongSP;
    }

    public int getChieucaoSP() {
        return chieucaoSP;
    }

    public void setChieucaoSP(int chieucaoSP) {
        this.chieucaoSP = chieucaoSP;
    }

    public int getTrongluongSP() {
        return trongluongSP;
    }

    public void setTrongluongSP(int trongluongSP) {
        this.trongluongSP = trongluongSP;
    }
}
