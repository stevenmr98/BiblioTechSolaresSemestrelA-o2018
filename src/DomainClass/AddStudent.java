package domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AddStudent {

    private String path;

    public AddStudent(String path_) {
        super();

        //ruta del archivo
        this.path = path_;
    }

    /**
     * Guarda en archivo un objeto de tipo Student
     */
    public void serialize(Student myStudent) throws IOException, ClassNotFoundException {

        //instancia de file
        File myFile = new File(path);

        //lista que se obtiene y se guarda en archivo
        List<Student> StudentList = new ArrayList<Student>();

        //si el archivo existe, recupero la lista
        if (myFile.exists()) {
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting a lista
            StudentList = (List<Student>) aux;
            objectInput.close();
        }

        //agrego la persona a la lista
        StudentList.add(myStudent);

        //escribo el objeto lista (que contiene objetos de tipo Person) en archivo
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(myFile));
        output.writeUnshared(StudentList);

        //cierro el archivo
        output.close();
    }

    /**
     * Busca en el archivo la persona y la retorna como Objeto Person
     *
     * @param name_ nombre de la persona que se busca en el archivo
     * @return objeto de tipo Person, con los datos de la persona que se busca
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Student getStudent(String name_) throws IOException, ClassNotFoundException {

        //instancia de file
        File myFile = new File(path);

        //lista que voy a recorrer para buscar a una persona
        List<Student> studentList = new ArrayList<Student>();

        //si el archivo existe entonces recupero a la persona
        if (myFile.exists()) {
            //llevo a cabo una lectura de la lista
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = objectInput.readObject();

            //casting del objeto
            studentList = (List<Student>) aux;
            objectInput.close();
        }

        //mi instancia a retornar
        Student myStudent = new Student();

        //recorro la lista en busca de la persona que me interesa
        for (int i = 0; i < studentList.size(); i++) {

            //pregunta si es la persona
            if (studentList.get(i).getName().equalsIgnoreCase(name_)) {
                //
                myStudent = studentList.get(i);

                //esta linea me hace salir del ciclo
                break;
            }
        }

        //retorna la persona ya sea con datos nulos o con la persona buscada
        return myStudent;
    }

}
