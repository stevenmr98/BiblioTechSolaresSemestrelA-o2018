package domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class AddBook {
    
    private String path;
    private int regsQuantity;//number of registers on the file
    private int regSize;//size of the register

    public AddBook(String path_) {
        super();
        
        //ruta del archivo
        this.path = path_;
        
        }

    
    /**
     * Guarda en archivo un objeto de tipo Person
     */
    
    //Metodo que serializa un objeto de tipo Book
    public void serialize(Book myBook) throws IOException, ClassNotFoundException{
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que se obtiene y se guarda en archivo
        List<Book> BookList = new ArrayList<Book>();
        
        //si el archivo existe, recupero la lista
        if(myFile.exists()){
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting a lista
            BookList = (List<Book>)aux;
            objectInput.close();  
        }
        
        //agrego la persona a la lista
        BookList.add(myBook);
        
        //escribo el objeto lista (que contiene objetos de tipo Person) en archivo
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        output.writeUnshared(BookList);
        
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
    
    //Metodo que lee un objeto de tipo libro
    public Book getBook(int i) throws IOException, ClassNotFoundException {
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que voy a recorrer para buscar a una persona
        List<Book> booksList = new ArrayList<Book>();
        
        //si el archivo existe entonces recupero a la persona
        if(myFile.exists()){
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting del objeto
            booksList = (List<Book>)aux;
            objectInput.close();  
        }
        Book myBook = new Book();
        myBook = booksList.get(i);
        return myBook;
    }
    
}
