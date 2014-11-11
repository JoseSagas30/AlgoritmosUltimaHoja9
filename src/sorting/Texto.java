/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*Archivo.java
*Lee el archivo de datos que se tiene almacenado las ciudades y sus distancias
*/


/**
 *
 * @author Isa
 */

package Sorting;
import java.io.*;

public class Texto{
    //Inicializacion
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    MatrizGrafo grafo = new MatrizGrafo();

    
    //Lee el archivo datos del proyecto
    public void datos() throws FileNotFoundException{
       String direccion = new File("src/ciudades.txt").getAbsolutePath(); 
       archivo=new File(direccion); 
    }  
    
    //Utiliza los datos que leyo anteiormente para obtener las ciudades
    public MatrizGrafo ciudades() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.agregarNodo(tmp[0]);
            grafo.agregarNodo(tmp[1]);
        }
        return grafo;
    }
    
    //Utiliza datos q leyo para sacar los pesos (distancia entre ciudades)
    public MatrizGrafo pesos() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.agregarConexion(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
    
    //Escribe en datos.txt
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }
    

}