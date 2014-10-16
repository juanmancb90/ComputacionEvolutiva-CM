/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Logica.cromosoma.*;

/**
 *
 * @author Denilson Basante 
 * @author Juan Manuel Chaguendo
 */
import java.util.Random;
public class poblacion {

    public int poblacion_crom; //seran 100 cromosomas en total el tamaño de la ploblacion utilizada
    public cromosoma genotipos[]; //cada uno de los cromosomas que hacen parte de la poblacion
    public int num_generacion; //realiza el conteo del numero de generaciones 
    public int cons_magica; //El numero magico que da como resultado de la suma diagonal horizontal y vertical del cuadro magico
    
    //funcion constructor
    public poblacion(int vlrtamc)
    {
        poblacion_crom = 100;
        genotipos = new cromosoma[poblacion_crom];
        num_generacion = 1;
        
        //Se obtiene el valor de la suma que debe tener cada horizontal, vertical y diagonal
        cons_magica = (int)((vlrtamc*(Math.pow(vlrtamc,2)+1))/2);
  
    }

    //funcion que permite ordenar el vector de cromosomas o genotipo usando el metodo de quicksort
    public void OrdenarPoblacion()
    {
        int izq = 0;
        int der = poblacion_crom-1;
        quicksort(genotipos, izq, der);   
    } 
    
    //metodo de ordenamiento de los cromosomas de la poblacion (Metodo Quicksort)
    public void quicksort(cromosoma crom[], int izq, int der) 
    {
        cromosoma pivote = crom[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        cromosoma aux = new cromosoma();
        
        while(i<j)
        {            // mientras no se crucen las búsquedas
            while((crom[i].funcionAptitud() <= pivote.funcionAptitud()) && (i < j)) 
                i++; // busca elemento mayor que pivote
            while(crom[j].funcionAptitud() > pivote.funcionAptitud()) 
                j--;         // busca elemento menor que pivote
            
            if (i<j) 
            {  // si no se han cruzado                      
                aux = crom[i];   // los intercambia
                crom[i] = crom[j];
                crom[j] = aux;
            }
        }
        
        crom[izq] = crom[j]; // se coloca el pivote en su lugar de forma que tendremos
        crom[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if(izq < j-1)
        {
            quicksort(crom, izq, j-1); // ordenamos subarray izquierdo
        }
            
        if(j+1 < der)
        {
            quicksort(crom, (j+1), der); // ordenamos subarray derecho
        }
            
    }
}
