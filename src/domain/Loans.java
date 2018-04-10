package domain;

public class Loans {
    
    String ID, Date;

    public Loans(String ID, String Date) {
        this.ID = ID;
        this.Date = Date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    
    
    public int sizeInBytes(){
        return this.getID().length() * 2 +
                this.getDate().length() * 2;
    }

    public Loans() {
    }
    
}
