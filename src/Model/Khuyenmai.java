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
public class Khuyenmai {
    private String maKhuyenmai;
    private String tenKhuyenmai;
    private Date ngaybdKhuyenmai;
    private Date ngayktKhuyenmai;

    public Khuyenmai(String maKhuyenmai, String tenKhuyenmai, Date ngaybdKhuyenmai, Date ngayktKhuyenmai) {
        this.maKhuyenmai = maKhuyenmai;
        this.tenKhuyenmai = tenKhuyenmai;
        this.ngaybdKhuyenmai = ngaybdKhuyenmai;
        this.ngayktKhuyenmai = ngayktKhuyenmai;
    }

    public String getMaKhuyenmai() {
        return maKhuyenmai;
    }

    public void setMaKhuyenmai(String maKhuyenmai) {
        this.maKhuyenmai = maKhuyenmai;
    }

    public String getTenKhuyenmai() {
        return tenKhuyenmai;
    }

    public void setTenKhuyenmai(String tenKhuyenmai) {
        this.tenKhuyenmai = tenKhuyenmai;
    }

    public Date getNgaybdKhuyenmai() {
        return ngaybdKhuyenmai;
    }

    public void setNgaybdKhuyenmai(Date ngaybdKhuyenmai) {
        this.ngaybdKhuyenmai = ngaybdKhuyenmai;
    }

    public Date getNgayktKhuyenmai() {
        return ngayktKhuyenmai;
    }

    public void setNgayktKhuyenmai(Date ngayktKhuyenmai) {
        this.ngayktKhuyenmai = ngayktKhuyenmai;
    }
    
}
