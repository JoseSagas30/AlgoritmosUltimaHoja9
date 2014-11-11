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

public class Archivo{
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    MatrizGrafo grafo = new MatrizGrafo();

    
    /**
     * obtenerArchivo: Método que obtiene el archivo
     */
    public void obtenerArchivo() throws FileNotFoundException{
       String direccion = new File("src/datos.txt").getAbsolutePath(); 
       archivo=new File(direccion); 
    }  
    
    /**
     * arregloNombres: Método que obtiene los nombres de los nodos para el grafo
     */
    public MatrizGrafo arregloNombres() throws IOException{
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
    
    /**
     * write: Método que escribe en el archivo
     */
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }
    
    /**
     * matrizCostos: Método que obtiene los pesos de los arcos entre nodos del grafo
     */
    public MatrizGrafo matrizCostos() throws IOException{
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
    

}