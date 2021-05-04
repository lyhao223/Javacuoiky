/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author huynh
 */
public class HoaDonDTO {
    private String MaKH,MaHD,MaNV,NgayNhan,NgayGiao,Ngaynhap;

    public HoaDonDTO(String MaKH, String MaHD, String MaNV, String NgayNhan, String NgayGiao, String Ngaynhap) {
        this.MaKH = MaKH;
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.NgayNhan = NgayNhan;
        this.NgayGiao = NgayGiao;
        this.Ngaynhap = Ngaynhap;
    }

    public HoaDonDTO() {
        this.MaKH=null;
        this.MaHD=null;
        this.MaNV=null;
        this.NgayNhan=null;
        this.NgayNhan=null;
        this.Ngaynhap = null;
    }
    

    public String getMaKH() {
        return MaKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getNgayNhan() {
        return NgayNhan;
    }

    public String getNgayGiao() {
        return NgayGiao;
    }
    public String getNgaynhap(){
        return Ngaynhap;
    }
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setNgayNhan(String NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public void setNgayGiao(String NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    public void setNgaynhap(String setNgaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    
    
}
