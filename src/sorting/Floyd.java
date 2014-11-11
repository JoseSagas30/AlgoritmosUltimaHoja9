/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*Floyd.java
*Utiliza matriz de adyacencia para realizar las operaciones con algoritmo de Floyd
*Se utilizo ejemplo y aportes del codigo que presenta el libro
*/


//package Sorting;
/**
 *
 * @author Isa
 */
import java.io.File;
import java.io.IOException;

public class Floyd {
    //Inicializacion de variables
    Texto archivo= new Texto();
    MatrizGrafo matrizAdyacencia;
    int[][] matrizNodosIntermedios;
    int[] maximo;
    int centro;
    int minimo=10000;
    String centroReturn="";
    
    public Floyd(){
        
        try {
            
            //Utiliza los datos que ya se obtuvieron con clase Archivo  
            archivo.datos();
            archivo.ciudades(); 
            matrizAdyacencia = archivo.pesos(); 
            matrizNodosIntermedios = new int[25][25]; // MatrizGrafo de nodos intermedios
            maximo = new int[25];
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for(int n=0;n<archivo.grafo.tamanoGrafo();n++){
            for(int m=0;m<archivo.grafo.tamanoGrafo();m++){
                matrizNodosIntermedios[n][m]=10000;
            }
        }
    }
    
    //Muestra las ciudades que se tuvieron que recorrer para la ruta mostrada
     public void predecesores(int num1, int num2){
        if(matrizNodosIntermedios[num1][num2]!=10000){
            predecesores(num1,matrizNodosIntermedios[num1][num2]);
            System.out.print(", "+matrizAdyacencia.obtenerNodo(matrizNodosIntermedios[num1][num2]));
            predecesores(matrizNodosIntermedios[num1][num2],num2);
            return;
        }
        else return;
           
    }
     
    //Muestra distancia mas corta entre dos ciudades
    public void rutaC(){
        for(int k=0;k<matrizAdyacencia.tamanoGrafo();k++){
            for(int i=0;i<matrizAdyacencia.tamanoGrafo();i++){
                for(int j=0;j<matrizAdyacencia.tamanoGrafo();j++){
                    if(matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(i),matrizAdyacencia.obtenerNodo(j))>(matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(i), matrizAdyacencia.obtenerNodo(k))+matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(k), matrizAdyacencia.obtenerNodo(j)))){
                        matrizAdyacencia.agregarConexion(matrizAdyacencia.obtenerNodo(i), matrizAdyacencia.obtenerNodo(j), (matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(i), matrizAdyacencia.obtenerNodo(k))+matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(k), matrizAdyacencia.obtenerNodo(j))));
                        matrizNodosIntermedios[i][j]=k;
                    }
                             }
            }
       }
        
    }
    
    //Metodo que encuentra el centro del grafo usando matriz de adyacencia
    public String centroGrafo(){
        rutaC();
        int n=0;       
        // Encontrar los maximos de cada columna de la matrizAdyacencia
        for(int i=0;i<matrizAdyacencia.tamanoGrafo();i++){
            for(int j=0;j<matrizAdyacencia.tamanoGrafo()-1;j++){
                int num1=matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(j), matrizAdyacencia.obtenerNodo(i));
                n=j;
                n++;
                int num2=matrizAdyacencia.obtenerConexion(matrizAdyacencia.obtenerNodo(n), matrizAdyacencia.obtenerNodo(i));
                if(num1>num2){
                    maximo[i]=num1;
                }
                else{
                    maximo[i]=num2;
                }
            }
            n++;
        }
       
        for(int i=0;i<matrizAdyacencia.tamanoGrafo();i++){
            int num1=maximo[i];
            if(num1<minimo){
                centro=i;
                minimo=num1;
            }
        }
        centroReturn=""+matrizAdyacencia.obtenerNodo(centro);
        return centroReturn;
       
    }
}