/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngsua
 */
public class Price {
    
    String studentP,classicP,premiumP,date;

    public Price(String studentP, String classicP, String premiumP,String date) {
        this.studentP = studentP;
        this.classicP = classicP;
        this.premiumP = premiumP;
        this.date=date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
    
}
