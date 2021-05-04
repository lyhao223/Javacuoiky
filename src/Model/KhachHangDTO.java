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
public class KhachHangDTO {
    private String Ho,Ten,Ma,Phone,Address,Mail;

    public KhachHangDTO() {
        this.Ho=null;
        this.Ten=null;
        this.Ma=null;
        this.Phone=null;
        this.Address=null;
        this.Mail=null;
    }

    public KhachHangDTO(String Ho, String Ten, String Ma, String Phone, String Address, String Mail) {
        this.Ho = Ho;
        this.Ten = Ten;
        this.Ma = Ma;
        this.Phone = Phone;
        this.Address = Address;
        this.Mail = Mail;
    }

    public String getHo() {
        return Ho;
    }

    public String getTen() {
        return Ten;
    }

    public String getMa() {
        return Ma;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public String getMail() {
        return Mail;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void display() {
        System.out.println(Ho + " " + Ten + " " + Ma + " " + Phone + " " + Address + " " +Mail);
    }

    
    
}
