/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
  *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Sorting.java
 * Clase encargada de generar los números, guardarlos en un archivo de texto, y luego llamar a los 4 tipos de ordenamiento
*/

//package sorting;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
       
        //Cantidad de datos que se desean generar y ordenar
        int cant_numeros = 10;
        File archivo = new File("src/archivo.txt");
        Random rnd = new Random(); 
        Comparable[] cordenadas = new Comparable[cant_numeros];
        //Agrega los numeros random generados al archivo de Texto
        try {
            FileWriter escribirArchivo = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            PrintWriter wr = new PrintWriter(buffer);
            
            int x; //Random utilizado para 
                for (int i = 0; i < cant_numeros; i++) {
        	x = (int)(rnd.nextDouble() * 2000.0);
        	System.out.println(x); 
                //escritura en el archivo
                buffer.write(Integer.toString(x));
                buffer.newLine();
            }
            //cerrando procesos de escritura del archivo
            wr.close();
            buffer.close();
            
        }catch (Exception ex) {
        } 
        
        //Lee el archivo de texto y almacena lo leido en un ArrayList 
        BufferedReader entrada;
        try {
       
            entrada = new BufferedReader( new FileReader( archivo ) );
            String linea;
            
            while(entrada.ready()){
                //Detecta lo que se encuentra en la linea leída del archivo.txt
                int contador=0;
                while((linea=entrada.readLine())!=null){
                    linea = linea.substring(0);
                    //Agrega los datos leidos al arrayList
                    cordenadas[contador] = (Integer.parseInt(linea));
                    contador = contador + 1; //Incrementa el contador lineas leidas
                }
            }
            }catch (IOException e) {
            e.printStackTrace();
            }
            
        //Metodos de ordenamiento
        Merge merge_metod = new Merge();
        merge_metod.mergeSort(cordenadas);
        
       Bubble bubble_metod = new Bubble();
       bubble_metod.bubbleSort(cordenadas);
        
       Quick quick_metod = new Quick();
       quick_metod.quickSort(cordenadas);
        
       Insertion insertion_metod = new Insertion();
       insertion_metod.insertionSort(cordenadas);
    }
}    
