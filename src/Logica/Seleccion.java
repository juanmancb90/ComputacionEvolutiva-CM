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
public class Seleccion {
    
    public int k; //tamaño del mating pool, dependera de porcentaje de seleccion. k = p*porcentaje_cruce
    public double arreglo_puntuaciones[];//Arreglo de Puntuaciones (Suma de puntaciones acumuladas) para el Mating Pool
    public double Pool[][];//Matriz de Elementos del Mating Pool (por Restos) se guardaran ahi los cromosomas seleccionados y posteriormente mutados
    public double calificacion = 0.0;//calificacion, sera util para definir cual es el cromosoma con un mayor valor de aptitud en cada generación
    public int n;//tamaño del cuadro
    public poblacion pb;
    public cromosoma genotipoclone[]; //el vector de cromosomas que corresponde al clon del vector de genotipo de la poblacion, evita problemas con el paso por valor y referencia.
    public cromosoma solucion = new cromosoma(); //solucion final o parcial segun sea el caso que sera mostrada en interfaz grafica.
    
    //es necesaria la poblacion, el tamaño de cuadro y el porcentaje de cruce.
    public Seleccion(int tam, poblacion pob, double porcentaje)
    {
        n = tam;
        pb = pob;
        k = (int)((double)pb.poblacion_crom * porcentaje); //se realiza cast de la poblacion ya que se definio como entero y aqui es operacion con double por el porcentaje
        arreglo_puntuaciones = new double[pb.poblacion_crom];
        genotipoclone = clonacion(); //se realiza la clonación de la poblacion 
    }
    
   //clonar el vector de genes
    private cromosoma[] clonacion()
    {
        cromosoma[] genoclon= pb.genotipos.clone();
        
        return genoclon;       
    }
    
    //Seleccionar los cromosomas de la poblacion para construir el mating pool
    public void MatingPool()
    {
        //Creando la Dimension del Vector (Cromosomas Seleccionados)
        Pool = new double [k][(n*n)]; //una matriz de tamaño k x n^2 k cromosomas seleccionados por n^2 genes por cada uno
        calificacion=0.0;
        double sumatotal = 0;
        int pos = 0;
            
        //Frecuencia Absoluta (Suma de Todas las aptitudes Calculadas), sera importante para determinar el mejor cromosoma en cada generación
        for (int i = 0; i < pb.poblacion_crom; i++)
        {
            sumatotal += genotipoclone[i].funcionAptitud();
               
               //Registra el valor de evaluacion del Mejor Cromosoma
                if(calificacion < genotipoclone[i].funcionAptitud())
                {
                    calificacion = genotipoclone[i].funcionAptitud();
                }
        }
            
        //Normalizando las Probabilidades de Cada Cromosoma con la Ayuda de la Frecuencia Absoluta (sumatotal)
        //Pi = Uí / sumatoria(i hasta poblacion_crom Ui )
        for (int i = 0; i < pb.poblacion_crom; i++)
        {
            genotipoclone[i].probabilidad = (genotipoclone[i].funcionAptitud()/sumatotal);
         
        }

        //calcular Puntuaciones Acumuladas (Suma de Todas las Probabilidades Calculadas)
        for (int i = 0; i < pb.poblacion_crom; i++)
        {
            sumatotal = 0;
                
            for (int j = 0; j <= i; j++)
            {
                sumatotal +=genotipoclone[j].probabilidad;
            }
            
            arreglo_puntuaciones[i] = sumatotal;
        }
         
        //Llena la ultima posicion del vector con 1.0 (100%) 
        arreglo_puntuaciones[(int)pb.poblacion_crom-1] = 1.0;
                
        /* Seleccion de Cromosomas por muestreo universal por  Restos:
        * cada cromosima i se selecciona directamente floor(k * pi) veces 
        * si es menor de 0 se redondea a 0 si es mayor a que 1 menor a 2 se redondea a 1 si es mayor que 2 menor a 3 redondea a 2 etc.
        */
        for (int i = 0; i < pb.poblacion_crom; i++)
        {
            sumatotal = Math.floor(k * genotipoclone[i].probabilidad);
                
            for(int j = pos; j < ((int)sumatotal+pos); j++)
            {
                for (int z = 0; z < n*n; z++)
                {
                    Pool[j][z] = genotipoclone[i].genes[z];
                    
                }
            }
            pos += ((int)sumatotal);
        }   
            
        //Si existen vacantes disponibles, el programa seleccionara por Sorteo los Cromosomas faltantes
        metodoSorteo(pos);
    }
    
    //Función que Retornara el Mejor Cromosoma de Cada Generación
    public void mejorCromosoma()
    {   
        System.out.println("Mejor(es) cromosoma(s) de la generacion "+pb.num_generacion);
        for (int i = 0; i < pb.poblacion_crom; i++)
        {   
            if(genotipoclone[i].funcionAptitud() == calificacion)
            {
               genotipoclone[i].mostrarGen();
               solucion= genotipoclone[i];
            }
        }
        
   
    }    
        
    //Función que Completa las Vacantes Disponibles usando el metodo de Sorteo en el Mating Pool 
    public void metodoSorteo(int pos)
    {     
        double random;            
        for(int i = pos; i < k; i++)
        { 
            //se generan k numero aleatorios
            random = Math.random();
           
            for (int j = 0; j < pb.poblacion_crom; j++)
            {                      
              if(j == 0)
              {
                  //Caso especial: Cuando la Posicion = 0
                  //0 < Rj < Qi
                  if((random > 0) && (random <= arreglo_puntuaciones[j]))
                  {
                      for(int z = 0; z < n*n; z++)
                      {
                          Pool[i][z] = genotipoclone[j].genes[z];
                          
                      }
                  }
              }
              else
                  //Qi-1 < R < Qi
                   if((random > arreglo_puntuaciones[j-1])&&(random <= arreglo_puntuaciones[j]))
                   {
                       for(int z = 0; z < n*n; z++)
                       {
                           Pool[i][z] = genotipoclone[j].genes[z];
                          
                       }
                   }
            }
        }

    }
    
   //funcion que permite ordenar el vector de cromosomas o genotipo CLON usando el metodo de quicksort
    public void OrdenarPoblacionClone()
    {            
       // System.out.println("orden de la poblacion Quicksort");
        int izq = 0;
        int der = genotipoclone.length-1;
        quicksort(genotipoclone, izq, der);          
    }
    
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
            quicksort(crom, izq, j-1); // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(crom, (j+1), der); // ordenamos subarray derecho
    }
    

    //se obtiene el vector solucion en forma de matriz para ser mostrado en la interfaz grafica de usuario
    public int[][] matrizSolucion()
    {
        int sol[][] = new int[n][n];
        int cont = 0, col;
        
        for(int j = 0; j < n; j++)
        {
            col = 0;
        
            for(int i = cont; i < n+cont; i++)
            {
                sol[j][col]= (int)solucion.genes[i];
                col++;
            }
            cont+=n;
        }
        
        return sol;
    }
}
