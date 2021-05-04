
package Model;
public class ChiTietDTO {
    private String MaHD,MaSP;
    private int SL;
    private float DonGia,TT;

    public ChiTietDTO() {
        this.MaHD=null;
        this.MaSP=null;
        this.SL=0;
        this.DonGia=0;
        this.TT=0;
    }

    public ChiTietDTO(String MaHD, String MaSP, int SL, float DonGia, float TT) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SL = SL;
        this.DonGia = DonGia;
        this.TT = TT;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public void setTT(float TT) {
        this.TT = TT;
    }

    public String getMaHD() {
        return MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public int getSL() {
        return SL;
    }

    public float getDonGia() {
        return DonGia;
    }

    public float getTT() {
        return TT;
    }



    public float thanhtien(){
        return SL*DonGia;
    }
    
    
}
