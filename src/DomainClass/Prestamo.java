
package DomainClass;


public class Prestamo {
    private int id;
    private String category ;
    private int fecha;

    public Prestamo(int id, String category, int fecha) {
        this.id = id;
        this.category = category;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
}
