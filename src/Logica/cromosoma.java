/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Denilson Basante 
 * @author Juan Manuel Chaguendo
 */

import java.util.*;

public class cromosoma {

    private int tam; //Tamaño del cromosoma
    private int n; //valor capturado  del textFiel, numero de filas o columnas del cuadrado ejm 3,4,5,6...n
    public double genes[]; //Arreglo que contiene los Genes del cromosoma
    public double faptitud; //Funcion de aptitud del cromosoma
    public double fevaluacion; //Funcion de evaluacion del cromosoma
    public double probabilidad; //probabilidad que tiene un cromosoma de ser seleccionado. Variable necesaria para la selección.
    public double maxaptitud; //es el valor maximo esperado en la funcion de evaluacion

    //constructores de la clase para variables auxiliares
    public cromosoma()
    {}
    
    //constructor principal de la clase
    public cromosoma(int tamcuadrado)
    {
        //asignacion del tamaño del cuadro magico
        n = tamcuadrado;
        tam = n * n; // tamaño n^2
        genes = new double[tam]; //el vector que contiene los genes es de tamaño n^2
        
        for(int i = 0; i < tam; i++)
        {
            int vlr = (int)(Math.ceil(Math.random()*tam));//los valores para el vector genes se seleccionan aleatoriamente
            
            //verifica si hay genes repetidos en el arreglo
            if(genduplicado(i,vlr) == 0)
            {
                genes[i] = vlr;
            }
            else
            {
                i--;

            }
        }    
    }
    
    //Verifica si hay un gen duplicado en el arreglo
    private int genduplicado(int i,int vlr)
    {
        int dup = 0;
        for (int j = 0; j < i ; j++)
        {
            if (genes[j] == vlr)
            {
                dup++;
            }
        }
        return dup;        
    }
   
    public double funcionAptitud()
    {
        //Verifica la Aptitud Maxima segun el Tamaño del Cuadro Magico
        //se sumara 2 si la suma horizional es igual a la constante magica
        //se sumara 2 si la suma vertical  es igual a la constante magica
        //se sumara 4 si la suma diagonal es igual a la constante magica

        //2*n son las filas y columnas existentes, 2 es el valor que se le da a las verticales y a las horizonatalel, 4 son las dos diagonales
        maxaptitud = (2*(2*n))+(4+4); 
        //funcion de aptitud Ui --- Ui = Fi/Fmax
        faptitud = this.fevaluacion / maxaptitud;
     
        return faptitud;
    }
    
    //Verificar la funcion de aptitud de un cromosoma
    public void FuncionFitness(int sumafaptitud)
    {
        fevaluacion = 0;
        int contadorcolumnas = 0;
        int contadorfilas = 0;
        int th = 0; 
        int tv = 0; 
        
        //Verifica la suma de la Horizontales y Verticales
        for (int i = 0 ; i < n ; i++)
        {
            contadorfilas = i;

            for (int j = 0 ; j < n ; j++)
            {

                th += genes[contadorcolumnas+j];
                tv += genes[contadorfilas];
                contadorfilas += n;
            }
            if(th == sumafaptitud)
            {
                fevaluacion+=2;
            }
            if(tv == sumafaptitud)
            {
                fevaluacion+=2;
            }
            th = 0;
            tv = 0;
            contadorcolumnas += n;
        }
        
        //Verifica la suma de la Diagonal
        diagonalesCuadro(0,(n+1),sumafaptitud);
               
        //Verifica la suma de la Diagonal Inversa
        diagonalesCuadro((n-1),(n-1),sumafaptitud);      
    }
    
    //Funcion para mostrar cada Cromosoma de la poblacion (por consola)
    public void mostrarGen()
    {
        int cont = 0;
        for(int i = 0; i < tam; i++)
        {
            cont++;
            if(cont != n)
            {
                System.out.print(genes[i]+" ");
            }
            else
            {
                System.out.println(genes[i]+" ");
                cont = 0;            
            }
        }
        System.out.println("Funcion de Aptitud = "+faptitud+"\n");
    }
    
    
    //Verifica la suma de las diagonales del cuadro
    public void diagonalesCuadro(int cont, int Op,int Sum)
    {
        int test = 0;
        for(int i = 0;i < n; i++)
        {
            test += genes[cont];
            cont += Op;
        }
        if(test == Sum)
        {
            fevaluacion += 4;
        }    
    }
}


