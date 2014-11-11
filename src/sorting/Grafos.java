/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*Grafos.java
*Se utiliza para realizar las operaciones entre los grafos
*Esta clase se baso en la clase Association de la hoja de trabajo 7 realizada por Erick de Mata, Isa Contreras y Luis Orellana
*/

package Sorting;
/**
 *
 * @author Isa
 */
public interface Grafos<V,E> {

    //Agregar una nueva ciudad
    public void agregarNodo(V nodo);

    //Con este nodo se puede agregar una nueva conexion
    public void agregarConexion(V v1, V v2, E contenido);
    
    //Despliega matriz de adyacencia
    public String mostrarMatrizAdy();
    
    //Posicion especifica en nodo
    public int obtenerPosicion(V contenido);
    
    public V obtenerNodo(int etiqueta);
    
    //Peso (distancia) en dos ciudades
    public int obtenerConexion(V contenido1, V contenido2);
    
    
    public boolean verificar(V contenido);
    
    //nodos en el grafo
    public int tamanoGrafo();
    
}