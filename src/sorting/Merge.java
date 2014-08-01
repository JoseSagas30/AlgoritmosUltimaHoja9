/*
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 *Merge.java
 * Ordenamiento de números que utiliza datos del archivo de texto generado*/

//package sorting;

public class Merge {
  
    
	public  void mergeSort(Comparable [ ] inputArr)
	{
                //se crea un array temporal del tamaño del ingresado
		Comparable[] array_temporal = new Comparable[inputArr.length];
                //se llama al constructor para iniciar la comparacion
		mergeSort(inputArr, array_temporal,  0,  inputArr.length - 1);
                //Impresión de la lista ordenada
                System.out.println("El resultado ordenado (Merge) es");
                for (int x = 0; x < inputArr.length-1; x++){
                    System.out.println(inputArr[x]);
                    
                }
               
           
	}
        
        
	private static void mergeSort(Comparable [ ] a, Comparable [ ] array_temporal, int izquierda, int derecha)
	{
                //si todavia existen datos para comparar 
		if( izquierda < derecha )
		{
                        //se obtienen el varlo central
			int central = (izquierda + derecha) / 2;
                        
                        //se divide el array en primera mitad
			mergeSort(a, array_temporal, izquierda, central);
                        
                        //se divide el array en segudna mitad
			mergeSort(a, array_temporal, central + 1, derecha);
                        
                        //
			merge(a, array_temporal, izquierda, central + 1, derecha);
		}
	}


    private static void merge(Comparable[ ] a, Comparable[ ] array_temporal, int izquierda, int derecha, int derechaFinal )
    {
        //variable para obtener la ultima izquierda a comparar
        int izquierdaFinal = derecha - 1;
        //izquierda actual
        int k = izquierda;
        //valor del tamaño del vector
        int num = derechaFinal - izquierda + 1;

        //mientras no se haya llegado a los tipes
        while(izquierda <= izquierdaFinal && derecha <= derechaFinal)
            //Si izquierda es menor
            if(a[izquierda].compareTo(a[derecha]) <= 0)
                array_temporal[k++] = a[izquierda++];
            //si derecha es mayor
            else
                array_temporal[k++] = a[derecha++];

        //Se copia el resto del vector del lado iquierdo
        while(izquierda <= izquierdaFinal)    
            array_temporal[k++] = a[izquierda++];

        //se copia el resto del vector del lado derecho
        while(derecha <= derechaFinal) 
            array_temporal[k++] = a[derecha++];

        //se copia el vector temporal al vector a
        for(int i = 0; i < num; i++, derechaFinal--)
            a[derechaFinal] = array_temporal[derechaFinal];
    }
    
   
    
 }

//Bibliografia:
//Bailey, D. Java Structures, 2007. Septima Edicion. William College
//En: http://geeksquiz.com/merge-sort/ , [visitado el dia 29/07/2014]