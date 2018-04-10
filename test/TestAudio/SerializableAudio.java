
package TestAudio;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import domain.AddAudiovisual;
import domain.AddBook;
import domain.Audiovisual;

public class SerializableAudio {
    
    public SerializableAudio() {
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

      //@Test
    public void write() throws IOException, ClassNotFoundException{
        
                 //instancias a guardar en el archivo
                 Audiovisual c= new Audiovisual("2500", "Sankey", "DVD", "Excelent", 1990);
                 Audiovisual c1= new Audiovisual("c45", "Hitachi", "televisor", "GOOD", 1990);
                
       
         //crea la instancia para la manipulacion de archivos serializables
         AddAudiovisual audioData = new AddAudiovisual("addAudio.dat");
         
         //guardar el objeto en archivo
         
            audioData.serialize(c);
            audioData.serialize(c1);
            
            }
    
      @Test
     public void readObject() throws IOException, ClassNotFoundException {
         
         //crea la instancia para la manipulacion de archivos serializables
         AddAudiovisual audioData = new AddAudiovisual("addAudio.dat");

         //lectura de la persona que se buscar
       //  Audiovisual audioTemp = audioData.getAudio("televisor");
         
         //impresion en consola
         System.out.println(audioTemp.toString());
     
     }
}
