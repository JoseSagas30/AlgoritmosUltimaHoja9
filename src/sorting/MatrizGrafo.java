/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*MatrizGrafo.java
*Archivo utilizado para poder realizar cambios en la matriz y texto
*Se utilizo como referencia http://cs.williams.edu/~andrea/cs136/Lectures/Lec29/Lec29.html
*/

//package Sorting;
import java.util.Vector;

/**
 *
 * @author Isa
 */
public class MatrizGrafo<V,E> implements Grafos<V,E>{

    private Vector vertices = new Vector();
    private int[][] nodos= new int [25][25];
    private String matrizRetorno="";
    private String matrizTemporal="";
    
    //Implementa los mismos metodos que la clase Grafos
    public MatrizGrafo(){
        
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                if(i==j){
                    nodos[i][j]=0;
                }
                else{
                    nodos[i][j]=10000;
                }
                }
        }
    }
   //Agrega nuevo nodo
    public void agregarNodo(V contenido) {
        
        if(!vertices.contains(contenido)){
            vertices.add(contenido);
        }
    }
   //Agrega nueva conexion entre 2 ciudades
    public void agregarConexion(V v1, V v2, E contenido) {
        int i = vertices.indexOf(v1);
        int j = vertices.indexOf(v2);        
        String tmp = ""+contenido;
        int peso = Integer.parseInt(tmp);
        nodos[i][j]=peso;
    }

   //Muestra matriz de adyacencia
    public String mostrarMatrizAdy(){
        
        for(int a=0;a<vertices.size();a++){
            for(int b=0;b<vertices.size();b++){
                matrizTemporal+=""+nodos[a][b]+" ";
            }
            matrizTemporal+="\n";
        }
        matrizRetorno=matrizTemporal;
        matrizTemporal="";
        return matrizRetorno;
    }
 //OBtiene tamaño grafo
    public int tamanoGrafo(){
        return vertices.size();
    }
//Metodo que obtiene conexion entre dos ciudades
      public int obtenerConexion(V contenido1, V contenido2){
        return nodos[vertices.indexOf(contenido1)][vertices.indexOf(contenido2)];
    }
      //Metodo que obtiene posicion
    public int obtenerPosicion(V contenido){
        return vertices.indexOf(contenido);
    }
 
 
    
    public boolean verificar(V contenido){
        return vertices.contains(contenido);
    }
    
    
    public V obtenerNodo(int contenido){
        
        return (V)vertices.get(contenido);
        
    }

    
    }