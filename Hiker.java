
package menuwindow;

import java.io.Serializable;

public class Hiker implements Serializable{
    
    private String Name;
    private String AgeTxt;
    private String CityCombo;
    private String PNtxt;
    private String Emailtxt;
    private String Passwordtxt;
    private String Gender;

    public Hiker(String Name, String AgeTxt, String CityCombo, String PNtxt, String Emailtxt, String Passwordtxt, String Gender) {
        this.Name = Name;
        this.AgeTxt = AgeTxt;
        this.CityCombo = CityCombo;
        this.PNtxt = PNtxt;
        this.Emailtxt = Emailtxt;
        this.Passwordtxt = Passwordtxt;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public String getAgeTxt() {
        return AgeTxt;
    }

    public String getCityCombo() {
        return CityCombo;
    }

    public String getPNtxt() {
        return PNtxt;
    }

    public String getEmailtxt() {
        return Emailtxt;
    }

    public String getPasswordtxt() {
        return Passwordtxt;
    }

    public String getGender() {
        return Gender;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAgeTxt(String AgeTxt) {
        this.AgeTxt = AgeTxt;
    }

    public void setCityCombo(String CityCombo) {
        this.CityCombo = CityCombo;
    }

    public void setPNtxt(String PNtxt) {
        this.PNtxt = PNtxt;
    }

    public void setEmailtxt(String Emailtxt) {
        this.Emailtxt = Emailtxt;
    }

    public void setPasswordtxt(String Passwordtxt) {
        this.Passwordtxt = Passwordtxt;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
    
}
