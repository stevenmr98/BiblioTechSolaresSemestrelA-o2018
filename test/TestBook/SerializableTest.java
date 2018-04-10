
package TestBook;

import domain.AddBook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import domain.Book;
import java.io.IOException;

/**
 *
 * @author ste98mora@gmail.com
 */
public class SerializableTest {
    
    public SerializableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//    @Test
//    public void write() throws IOException, ClassNotFoundException{
//                 instancias a guardar en el archivo
//         Book Sociales = new Book("Luna de pluton", "mundo", "mexivergas", 2013, "basura", "comedia");
//        Book sexualidad = new Book("Lo tenía todo", "planeta", "Hector el Father", 2013, "gemialidad", "dios");
//     Book fe = new Book("la  hija del mariachi", "asteroide", "Rosario", 2009, "fantasía", "terrpr");
//         crea la instancia para la manipulacion de archivos serializables
//         AddBook personData = new AddBook("addBooks.dat");
//         
//         guardar el objeto en archivo
//         personData.serialize(Sociales);
//         personData.serialize(sexualidad);
//         personData.serialize(fe);
//            
//            }
    
      @Test
     public void readObject() throws IOException, ClassNotFoundException {
         
         //crea la instancia para la manipulacion de archivos serializables
         AddBook bookData = new AddBook("addBooks.dat");

         //lectura de la persona que se buscar
         Book bookTemp = bookData.getBook("la  hija del mariachi");
         
         //impresion en consola
         System.out.println(bookTemp.toString());
     
     }
}
