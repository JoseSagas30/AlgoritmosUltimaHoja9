/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

/**
 *
 * @author Isa
 */ 

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File archivo = new File("src/archivo.txt");
        Random rnd = new Random(); 
        ArrayList cordenadas = new ArrayList();
        int longitud;
        //Agrega los numeros random generados al archivo de Texto
        try {
            FileWriter escribirArchivo = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            PrintWriter wr = new PrintWriter(buffer);
            //Random 
            int x;
                for (int i = 0; i < 5; i++) {
        	x = (int)(rnd.nextDouble() * 2000.0);
        	System.out.println(x); 
                buffer.write(Integer.toString(x));
                buffer.newLine();
            }
            
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
                    System.out.println("El contenido de la linea es:");
                    System.out.println(linea);
                    //Agrega los datos leidos al arrayList
                    cordenadas.add(contador,linea);
                    System.out.println("El contador es:");
                    System.out.println(contador);
                    contador = contador + 1; //Incrementa el contador lineas leidas
                    longitud = cordenadas.size();
                    System.out.println("La longitud del array es:");
                    System.out.println(contador);
                }
            }
            }catch (IOException e) {
            e.printStackTrace();
            }
            
    }
}    
