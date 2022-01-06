/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class Price {
    
    String studentP,classicP,premiumP;

    public Price(String studentP, String classicP, String premiumP) {
        this.studentP = studentP;
        this.classicP = classicP;
        this.premiumP = premiumP;
    }

    public String getStudentP() {
        return studentP;
    }

    public void setStudentP(String studentP) {
        this.studentP = studentP;
    }

    public String getClassicP() {
        return classicP;
    }

    public void setClassicP(String classicP) {
        this.classicP = classicP;
    }

    public String getPremiumP() {
        return premiumP;
    }

    public void setPremiumP(String premiumP) {
        this.premiumP = premiumP;
    }
    
    
    
}
