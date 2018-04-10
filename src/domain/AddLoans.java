package domain;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class AddLoans {
    
    //atributos
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros en el archivo
    private int regSize;//tamanno del registro
    private String myFilePath;//ruta
    
    //constructor
    public AddLoans(File file) throws IOException{
        //almaceno la ruta
        myFilePath = file.getPath();
        
        //indico el tamanno máximo
        this.regSize = 140;
        
        //una validaci'on sencilla
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() + " is an invalid file");
        }else{
            //crear la nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");
            
            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = 
                    (int)Math.ceil((double)randomAccessFile.length() / (double)regSize);
        }
    }//end method
    
    public void close() throws IOException{
        randomAccessFile.close();
        }
    
    //indicar la cantidad de registros de nuestro archivo
    public int fileSize(){
        return this.regsQuantity;
    }
    
    //insertar un nuevo registro en una posición espec'ifica
    public boolean putValue(int position, Loans loan) throws IOException{
        //primero: verificar que sea v'alida la inserci'on
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1001 - Record position is out of bounds");
            return false;
        }else{
            if(loan.sizeInBytes()> this.regSize){
                System.err.println("1002 - Record size is out of bounds");
                return false;
            }else{
                //BINGO
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(loan.getID());
                randomAccessFile.writeUTF(loan.getDate());
                return true;
            }
        }
    }//end method
    
    //insertar al final del archivo
    public boolean addEndRecord(Loans loan) throws IOException{
        boolean success = putValue(this.regsQuantity, loan);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
    
    //obtener un estudiante
    public Loans getLoan(int position) throws IOException{
        //validar la posici'on
        if(position >= 0 && position <= this.regsQuantity){
            //colocamos el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);
            
            //llevamos a cabo la lectura
            Loans loansTemp = new Loans();
            loansTemp.setID(randomAccessFile.readUTF());
            loansTemp.setDate(randomAccessFile.readUTF());
            
            return loansTemp;
    }//end method
    
        return null;
        
}
}
