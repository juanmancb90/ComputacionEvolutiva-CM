/*
Esta clase se encargar de controlar la ejecucion del software desde el momento que se
ejecuta el ActionListener del boton Aplicar GA
 */

package Logica;

import java.util.Scanner;

/**
 *
 * @author Denilson Basante 
 * @author Juan Manuel Chaguendo
 */
public class controlador {
    
    public int tam;//tamaño del cuadro magico a resolver
    public double porcen; //porcentaje de cruce
    public Seleccion sel; //objeto de la clase seleccion
    public int limite; //limite de generaciones, ayuda para detener el ciclo de busqueda en caso tal de aburrimiento
    
       
    //constructor que recibe el valor ingresado por el usuario
    public controlador(int lon, double porcruce, int limitegeneracion)
    {
        tam = lon;
        porcen = porcruce;
        limite = limitegeneracion;
    }
    
    //comenzar la ejecucion y aplicacion de logica del software
    public void aplicarGA()
    {
        //instancia de los objetos se realiza la creacion de la poblacion
        poblacion pob = new poblacion(tam);
        
        for (int i = 0; i < pob.poblacion_crom; i++)
        {
          
          //Se Crea la Variable Cromosoma 
          
            cromosoma cr = new cromosoma(tam);
          
          //Calculando la Funcion de Aptitud

            cr.FuncionFitness(pob.cons_magica);
          
          //Se añade el Cromosoma a la Poblacion
            pob.genotipos[i] = cr;
            pob.genotipos[i].mostrarGen();
        }
        
        sel = new Seleccion(tam, pob, porcen);
        
        Reproduccion rep = new Reproduccion(tam, sel);
 
        //Ciclo para Mostrar la Solución al Problema se itera utilizando el clon de la poblacion para evitar problemas con el paso por valor y referencia de java
        do
        {
            sel.MatingPool(); //se crea el mating pool
            sel.mejorCromosoma();  //se evalua su funcion de aptitud y se selececiona el mejor de la poblacion
            rep.ordenReproduccion(); //se realiza la reproduccion usando cruce y mutacion
            rep.FuncionReemplazo(); //se reemplazan los valores utilizando el metodo de inserción
            pob.num_generacion++; //numero de generaciones
        }
        while((sel.calificacion < 1) && (pob.num_generacion < limite)); 
        /*el ciclo termina si la calificacion es 1 osea que encontro la solucion o en caso contrario hasta 
        llegar al limete de generaciones definida por el usuario
         */
    }       
}
