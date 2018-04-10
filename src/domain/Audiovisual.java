
package domain;

import java.io.Serializable;
import java.util.Random;


public class Audiovisual implements Serializable{
    
    private String model, brand, category, condition;
    private int year, ID;
    boolean available;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    Random random = new Random();

    public Audiovisual() {
    }
    
    public int getAleatorios (int cota){
        return random.nextInt(cota)+1;
    }

    public Audiovisual(String model, String brand, String category, String condition, int year) {
        this.model = model;
        this.brand = brand;
        this.category = category;
        this.condition = condition;
        this.year = year;
        this.ID = getAleatorios(9999);
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    

    public String getModel() {
        return model;
    }

    public void setName(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Audiovisual{" + "Category=" + category + ", brand=" + brand + ", model=" + model + ", condition=" + condition + ", year=" + year + '}';
    }
    
    
    
    
}
