
package DomainClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class AddAudiovisual {
      
    private String path;

   
    public AddAudiovisual(String path_) {
        super();
        
        //ruta del archivo
        this.path = path_;
    }

    
    /**
     * Guarda en archivo un objeto de tipo Person
     * @param audiovisual_
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void serialize(Audiovisual audiovisual_) throws IOException, ClassNotFoundException{
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que se obtiene y se guarda en archivo
        List<Audiovisual> audioList = new ArrayList<Audiovisual>();
        
        //si el archivo existe, recupero la lista
        if(myFile.exists()){
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting a lista
            audioList = (List<Audiovisual>)aux;
            objectInput.close();  
        }
        
        //agrego la persona a la lista
        audioList.add(audiovisual_);
        
        //escribo el objeto lista (que contiene objetos de tipo Person) en archivo
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        output.writeUnshared(audioList);
        
        //cierro el archivo
        output.close();
    }
    
    /**
     * Busca en el archivo la persona y la retorna como Objeto Person
     * @param name_ _ nombre de la persona que se busca en el archivo
     * @return objeto de tipo Person, con los datos de la persona que se busca
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Audiovisual getAudio(String name_) throws IOException, ClassNotFoundException {
        
        //instancia de file
        File myFile = new File(path);
        
        //lista que voy a recorrer para buscar a una persona
        List<Audiovisual> audioList = new ArrayList<Audiovisual>();
        
        //si el archivo existe entonces recupero a la persona
        if(myFile.exists()){
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();
            
            //casting del objeto
            audioList = (List<Audiovisual>)aux;
            objectInput.close();  
        }
        
        //mi instancia a retornar
        Audiovisual myAudio = new Audiovisual();
        
        //recorro la lista en busca de la persona que me interesa
        for(int i = 0; i < audioList.size(); i++){
            
            //pregunta si es la persona
            if(audioList.get(i).getType().equalsIgnoreCase(name_)){
                //
                myAudio = audioList.get(i);
                
                //esta linea me hace salir del ciclo
                break;
            }
        }
        
        //retorna la persona ya sea con datos nulos o con la persona buscada
        return myAudio;
    }
    
    
}

    

 
    
   