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
public interface GrafoInterface<V,E> {

    /**
     * agregarNodo: Método que agrega nodo al grafo
     * 
     */
    public void agregarNodo(V nodo);

    /**
     * agregarConexion: Método que agrega conexion entre nodos
     *
     */
    public void agregarConexion(V v1, V v2, E contenido);
    
    /**
     * mostrarMatrizAdy: Método que despliega el grafo
     * 
     */
    public String mostrarMatrizAdy();
    
    /**
     * obtenerPosicion: Método que obtiene la posicion de un nodo
     * 
     */
    public int obtenerPosicion(V contenido);
    
    /**
     * obtenerNodo: Método que obtiene el nodo en la posicion label
     * 
     */
    public V obtenerNodo(int etiqueta);
    
    /**
     * obtenerConexion: Método que obtiene el peso de la conexion entre dos nodos
     * 
     */
    public int obtenerConexion(V contenido1, V contenido2);
    
    /**
     * verificar: Método que verifica si el nodo indicado existe en el grafo
     * 
     */
    public boolean verificar(V contenido);
    
    /**
     * tamanoGrafo: Método que indica la cantidad de nodos en el grafo
     * 
     */
    public int tamanoGrafo();
    
}