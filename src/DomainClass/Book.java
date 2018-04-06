
package DomainClass;

import java.io.Serializable;


public class Book implements Serializable {
    private String name;
    private String editorial;
    private String autor;
    private int year;
    private String category;
    private String type;

    public Book() {
    }

    
    public Book(String name, String editorial, String autor,String type,  String category, int year )  {
        this.name = name;
        this.editorial = editorial;
        this.autor = autor;
        this.year = year;
        this.category = category;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", editorial=" + editorial + ", autor=" + autor + ", year=" + year + ", category=" + category + ", type=" + type + '}';
    }
     
    
}
