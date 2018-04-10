package domain;

import java.io.Serializable;

public class Student implements Serializable{
 
    private String Name, Carreer, ID, consecutivo="00";
    private int Year;
    private static int consecutive=0;

    public int getYear() {
        return Year;
    }

    public Student(String Name, String Carreer, int Year) {
        this.Name = Name;
        this.Carreer = Carreer;
        this.Year = Year;
        this.consecutive = consecutive+1;
        this.ID=""+Idgeneratorchar()+Idgeneratorint()+consecutivo+consecutive;
    }
    
    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public char Idgeneratorchar(){
        char firstletter = getCarreer().charAt(0);
        return firstletter;
    }
    
    public String Idgeneratorint(){
        String year = "" + getYear();
        String firstnumber = "" + year.charAt(year.length()-1);
        return firstnumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCarreer() {
        return Carreer;
    }

    public void setCarreer(String Carreer) {
        this.Carreer = Carreer;
    }

    @Override
    public String toString() {
        return "Student{" + "Name=" + Name + ", Carreer=" + Carreer + '}';
    }
    
    
    
}
