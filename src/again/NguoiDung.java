/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again;

/**
 *
 * @author NGUYEN DUC CUONG
 */
public class NguoiDung {
    private String username ;
    private String password;
    private String fullname;
    private String phonenumber;
    private String address; 
    public NguoiDung() {
    }

    public NguoiDung(String username, String password, String fullname, String phonenumber, String address) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public String getAccount() {
        return username;
    }

    public void setAccount(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
