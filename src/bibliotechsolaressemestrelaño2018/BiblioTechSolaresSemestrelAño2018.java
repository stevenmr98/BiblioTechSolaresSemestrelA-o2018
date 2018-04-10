package bibliotechsolaressemestrelaño2018;

import Interface.PrincipalBiblioTech;
import domain.AddBook;
import domain.Book;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BiblioTechSolaresSemestrelAño2018 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        PrincipalBiblioTech pB = new PrincipalBiblioTech();
        pB.setVisible(true);

//       Calendar fecha = new GregorianCalendar();
//       int ano = fecha.get(Calendar.YEAR);
//       int mes = fecha.get(Calendar.MONTH)+1;
//       int dia = fecha.get(Calendar.DAY_OF_MONTH);

//          AddBook aB = new AddBook("./Books.dat");
//          Book myBook = new Book("Kamasutra", "Hindus", "El Hindu", "Sexo", "Más sexo", 2017);
//          aB.serialize(myBook);
//          System.out.println(aB.getPerson("Kamasutra"));
        
    }
    
}
