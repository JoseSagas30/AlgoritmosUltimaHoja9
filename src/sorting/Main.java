/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*Main.java
*Archivo principal del proyecto, indica las opciones que el usuario tiene y asigna las operaciones de cada una
*/

package Sorting;
/**
 *
 * @author Isa
 */
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        // inicializacion de variables
        int opcion3;
        opcion3 = 1;
        //Ciclo que permite regresar al menu principal si el usuario lo desea
        while (opcion3 == 1) {
        
        // Inicializacion de matriz y variables
        Floyd matriz = new Floyd();
        matriz.rutaC();
        int opcion, opcion2;
	String ciudadSal, ciudadDes;
        Scanner sc = new Scanner(System.in);
        // Menu principal
	System.out.println("Seleccione una opción: \n1) Ruta mas corta \n2) Centro de grafo \n3) Modificar grafo \n4) Matriz de Adyacencia\n5) Salir del programa");
	Scanner resp = new Scanner(System.in);
	opcion = resp.nextInt();
		
            //Muestra la ruta mas corta
            if(opcion==1){
                matriz.rutaC(); 
		System.out.println("Ciudad de salida: ");
                ciudadSal = sc.next();
		System.out.println("Ciudad de destino: ");
		ciudadDes = sc.next();
                
                //Revisa si se encuentra en la matriz de adyacencia
                if(matriz.matrizAdyacencia.verificar(ciudadSal)&&matriz.matrizAdyacencia.verificar(ciudadDes)){
                    System.out.println("Distancia de ruta mas corta es: "+matriz.matrizAdyacencia.obtenerConexion(ciudadSal, ciudadDes)+".");
                    if(matriz.matrizAdyacencia.obtenerConexion(ciudadSal, ciudadDes)!=10000){ //El peso en la matriz de adyacencia debe ser diferente a 1000, eso indica que si hay conexion
                        matriz.predecesores(matriz.matrizAdyacencia.obtenerPosicion(ciudadSal), matriz.matrizAdyacencia.obtenerPosicion(ciudadDes));
			System.out.println("Predecesores: "+ciudadSal+", "+ciudadDes);
					}
                }
                //Ciclo para regresar al menu princial
                System.out.println("¿Desea regresar al menú principal?\n **Presione 1 para regresar\n **Presione otro numero para salir del programa");
                Scanner resp1 = new Scanner(System.in);
                opcion3 = resp1.nextInt();
            }
            
            //Centro del grafo
            if(opcion==2){
                System.out.println(matriz.centroGrafo());
                 //Ciclo para regresar al menu princial
                System.out.println("¿Desea regresar al menú principal?\n **Presione 1 para regresar\n **Presione otro numero para salir del programa");
                Scanner resp1 = new Scanner(System.in);
                opcion3 = resp1.nextInt();
            }
            
            //Se puede realizar cambios a la matriz de conexiones
            if(opcion==3){
		System.out.println("Modificacion de grafo\n 1) Interrupcion de trafico entre ciudades\n 2) Nueva conexion");
		opcion2 = resp.nextInt(); //opcion2, correspondiente a las opciones para modificar grafo
		if(opcion2==1){ //Modifica rutas
                    System.out.println("Ciudad de salida: ");
                     ciudadSal = sc.next();
                    System.out.println("Ciudad de destino: ");
                    ciudadDes = sc.next();
                    //Verifica que se encuentra dentro del grafo
                    if(matriz.matrizAdyacencia.verificar(ciudadSal)&&matriz.matrizAdyacencia.verificar(ciudadDes)) {
                        matriz.matrizAdyacencia.agregarConexion(ciudadSal, ciudadDes, 10000);
                        //Actualiza el archivo datos
                        try {
                            matriz.archivo.write(ciudadSal+" "+ciudadDes+" 10000");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                //Agrega nuevas rutas
                else if(opcion2==2){
			System.out.println("Ciudad de salida: ");
                        ciudadSal = sc.next();
                        System.out.println("Ciudad de destino: ");
                        ciudadDes = sc.next();
			int distancia; //Inicializa variable
                        distancia = 0;
			System.out.println("Distancia entre ciudades");
			distancia = resp.nextInt();
									
                    
                        //Agrega la nueva conexion
                        matriz.matrizAdyacencia.agregarNodo(ciudadSal);
                        matriz.matrizAdyacencia.agregarNodo(ciudadDes);
                        matriz.matrizAdyacencia.agregarConexion(ciudadSal, ciudadDes, distancia);
                    
                    // Actualiza archivo con nuevas rutas
                    try {
                        matriz.archivo.write(ciudadSal+" "+ciudadDes+" "+distancia);
                    } catch (IOException ex) { 
                        ex.printStackTrace();
                    }
                }
                //Actualiza las rutas
                matriz.rutaC();
                 //Ciclo para regresar al menu princial
                System.out.println("¿Desea regresar al menú principal?\n **Presione 1 para regresar\n **Presione otro numero para salir del programa");
                Scanner resp1 = new Scanner(System.in);
                opcion3 = resp1.nextInt();
            }
            
            //Muestra matriz de adyacencia
            if(opcion==4){
                
                //Muestra matriz de adyacencia creada con Floyd                
		System.out.println("A continuación se muestra la matriz de adyacencia: ");
                System.out.println(matriz.matrizAdyacencia.mostrarMatrizAdy());
                 //Ciclo para regresar al menu princial
                System.out.println("¿Desea regresar al menú principal?\n **Presione 1 para regresar\n **Presione otro numero para salir del programa");
                Scanner resp1 = new Scanner(System.in);
                opcion3 = resp1.nextInt();
                }
            if (opcion==5){
                //Cambia el valor de opcion 3 para salir del programa
                opcion3 = 4;
            }
        }
        //Indica que el usuario quiere salir del programa
        if (opcion3 != 1) {
            System.out.println("Gracias por usar nuestra programa, esperamos que su candidato gane :) "); //Mensaje de despedida
        }
    }
        
    }
