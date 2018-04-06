
package DomainClass;

import java.io.Serializable;


public class Audiovisual implements Serializable{
    
    private String model, brand, type, condition;
    private int year;

    public Audiovisual() {
    }

    public Audiovisual(String model, String brand, String type, String condition, int year) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.condition = condition;
        this.year = year;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Audiovisual{" + "Category=" + type + ", brand=" + brand + ", model=" + model + ", condition=" + condition + ", year=" + year + '}';
    }
    
    
    
    
}
