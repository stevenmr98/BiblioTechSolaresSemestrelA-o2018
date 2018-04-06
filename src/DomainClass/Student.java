package domain;

import java.io.Serializable;

public class Student implements Serializable{
 
    private String Name, Carreer;

    public Student(String Name, String Carreer) {
        this.Name = Name;
        this.Carreer = Carreer;
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
