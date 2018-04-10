package domain;

import java.io.Serializable;
import java.util.Random;

public class Book implements Serializable{

private String Name, Editorial, Autor, Type, Category,ID;
private int Year;
private Random random = new Random();
private boolean available;
    


    public Book(String Name, String Editorial, String Autor, String Type, String Category, int Year) {
        this.Name = Name;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Type = Type;
        this.Category = Category;
        this.Year = Year;
        this.ID= "ISBN-"+String.valueOf(getAleatorios(9999));
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public int getAleatorios (int cota){
        return random.nextInt(cota)+1;
    }

    public Book() {
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Book{" + "Name=" + Name + ", Editorial=" + Editorial + ", Autor=" + Autor + ", Type=" + Type + ", Category=" + Category + ", Year=" + Year + '}';
    }
}
