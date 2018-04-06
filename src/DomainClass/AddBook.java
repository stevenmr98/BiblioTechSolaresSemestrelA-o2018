
package DomainClass;
   

import DomainClass.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AddBook {
    


/**
 *
 * @author Administrator
 */

    
    private String path;

   
    public AddBook(String path_) {
        super();
        
        //ruta del archivo
        this.path = path_;
    }

    
    /**
     * Guarda en archivo un objeto de tipo Person
     * @param book_
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void serialize(Book book_) throws IOException, ClassNotFoundException{
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que se obtiene y se guarda en archivo
        List<Book> bookList = new ArrayList<Book>();
        
        //si el archivo existe, recupero la lista
        if(myFile.exists()){
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting a lista
            bookList = (List<Book>)aux;
            objectInput.close();  
        }
        
        //agrego la persona a la lista
        bookList.add(book_);
        
        //escribo el objeto lista (que contiene objetos de tipo Person) en archivo
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        output.writeUnshared(bookList);
        
        //cierro el archivo
        output.close();
    }
    
    /**
     * Busca en el archivo la persona y la retorna como Objeto Person
     * @param name_ nombre de la persona que se busca en el archivo
     * @return objeto de tipo Person, con los datos de la persona que se busca
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Book getBook(String name_) throws IOException, ClassNotFoundException {
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que voy a recorrer para buscar a una persona
        List<Book> bookList = new ArrayList<Book>();
        
        //si el archivo existe entonces recupero a la persona
        if(myFile.exists()){
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting del objeto
            bookList = (List< Book>)aux;
            objectInput.close();  
        }
        
        //mi instancia a retornar
        Book myBook = new Book();
      
        //recorro la lista en busca de la persona que me interesa
        for(int i = 0; i < bookList.size(); i++){
            
            //pregunta si es la persona
            if(bookList.get(i).getName().equalsIgnoreCase(name_)){
                //
                myBook = bookList.get(i);
                
                //esta linea me hace salir del ciclo
                break;
            }
        }
        
        //retorna la persona ya sea con datos nulos o con la persona buscada
        return myBook;
    }
    
    
}

    

