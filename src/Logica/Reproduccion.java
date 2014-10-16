/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Random;

/**
 *
 * @author Denilson Basante 
 * @author Juan Manuel Chaguendo
 */

public class Reproduccion {
    
    private int n; //tamaño para construir el cuadro magico
    public Seleccion sl; //objeto de la clase seleccion, ya que despues de realizar la seleccion se realiza la reproducción

    //metodo constructor
    public Reproduccion(int tam, Seleccion selec)
    {
        n = tam;
        sl = selec;
    }
    
    //Funcion de Reproducción: Primero se Cruzan, Luego se Mutan  
    public void ordenReproduccion()
    {
       //se realiza el cruce por pares padres, el primer y el el ultimo cromosomas padres de genotipo, segundo con penultimo sucesivamente.
        int a = sl.k-1;
        for (int i = 0; i < sl.k/2; i++)
        {
            Cruce(i,a-i);
            //la mutacion tambien se realiza por pares pero no porque se crucen se realiza asi por comodidad para el codigo
            //se cruza y se muta exactamente todo el matign pool con la misma proporcion que se establece en le porcentaje de cruce.
            Mutacion(i,a-i);                              
        }  
    }
  
    //Funcion de Cruce
    public void Cruce(int p1, int p2)
    {
         //Se Toma un Punto aleatorio para Cruzar, Segun el Tamaño del Cromosoma
         int puntodecruce = (int)Math.floor(Math.random()*n*n);
         
         double Hijo1[] = new double[n*n];
         double Hijo2[] = new double[n*n];
         
         //Con ayuda del punto de cruce, Se Llena la Cola del Cromosoma
         for (int i = puntodecruce; i < n*n; i++)
         {
             Hijo2[i] = sl.Pool[p1][i];
             
             Hijo1[i] = sl.Pool[p2][i];   
         }
  
         //Se debe Verificar la Existencia de un Gen repetido 
         VerificaCromosoma(p2,Hijo2,puntodecruce);
         
         VerificaCromosoma(p1,Hijo1,puntodecruce);
     }
        
    //Función que Llena la Cabeza del Cromosoma Hijo Certificando que No Existirán Genes Repetidos
    public void VerificaCromosoma(int p, double[] Hijo,int puntodecruce)
    {
        boolean repetido;
        int cont = 0;
        for(int i = 0; i < n*n ; i++)
        {
            repetido = true;
            //En Caso de la Existencia de Un Gen Repetido,
            for(int j = puntodecruce; j < n*n ; j++)
            {
                if(sl.Pool[p][i] == Hijo[j])
                {
                    repetido = false;
                }
            }
            if(repetido == true)
            {
                Hijo[cont] = sl.Pool[p][i];
                cont++;
            }
        }
        //El Hijo es envialo a los seleccionados
        for(int i=0;i<n*n;i++)
        {
            sl.Pool[p][i]= Hijo[i];
        }
    }

    //Se Intercambia un Gen al Azar por otro Gen que se Encuentren en un Mismo Cromosoma    
    public void Mutacion (int p1, int p2)
    {
         int puntomutacion1 = 0;
         int puntomutacion2 = 0;
         
         double temp = 0;

         //Mutacion para Hijo # 1
         do
         {
             puntomutacion1 = (int)Math.floor(Math.random()*n*n);
             puntomutacion2 = (int)Math.floor(Math.random()*n*n);
         }
         while(puntomutacion1 == puntomutacion2);
         
         
         temp = sl.Pool[p1][puntomutacion1];
         
         sl.Pool[p1][puntomutacion1] = sl.Pool[p1][puntomutacion2];
         sl.Pool[p1][puntomutacion2] = temp;       

         //Mutacion para Hijo # 2
         do
         {
             puntomutacion1 = (int)Math.floor(Math.random()*n*n);
             puntomutacion2 = (int)Math.floor(Math.random()*n*n);
         }
         while(puntomutacion1 == puntomutacion2);           
         
         
         temp =sl.Pool[p2][puntomutacion1];
         
         sl.Pool[p2][puntomutacion1] = sl.Pool[p2][puntomutacion2];
         sl.Pool[p2][puntomutacion2] = temp;    
     }

     //Se Envian los Cromosomas Cruzados y Mutados a la Poblacion
     public void FuncionReemplazo()
     {       
         
         sl.OrdenarPoblacionClone(); // se ordena la poblacion segun su funcion de aptitud para reemplazar los peores cromosomas de mating pool por los obtenidos despues de la seleccion cruce y mutacion
        //el orden se realiza del de menor valor hasta el de mayor valor
         for (int i = 0; i < sl.k ; i++)
         {
             for (int j = 0; j < n*n ; j++)
             {
                 //se reemplaza los cromosomas padres del clon por los cromosomas seleccionas que se han cruzado y mutado
                 sl.genotipoclone[i].genes[j] = sl.Pool[i][j];                     
             }
             sl.genotipoclone[i].faptitud = 0;
             sl.genotipoclone[i].FuncionFitness(sl.pb.cons_magica);
             
         }
     }
}
