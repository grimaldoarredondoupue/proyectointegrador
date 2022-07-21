package pe.edu.upeu.modelo;

import pe.edu.upeu.util.*;

public class transpuestaTO 
{
    static LeerTeclado lt = new LeerTeclado();

    public void transpuesta () 
    {
        int f, c;

        f = lt.leer (0, "Ingrese el numero de filas: ");
        c = lt.leer (0, "Ingrese el numero de columnas: ");

        System.out.println ("");

        int matriz [][] = new int [f][c];
        int matrizT[][] = new int [c][f];
        
        //Generando matriz original
        for (int i = 0; i < f; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matriz[i][j] = lt.leer(0, "Inserte el valor ["+i+"] ["+j+"] de la matriz: ");
            }
        }
        //Matriz origina
        System.out.println ("\nMatriz original");
        for(int i = 0; i < f; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print("["+ matriz[i][j]+ "]"+" ");
            }
            System.out.println ("");
        }

        //transponiendo la matriz
        for (int i = 0; i < f; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrizT[j][i] = matriz[i][j];
            }
        }

        //Matriz transpuesta
        System.out.println("Matriz transpuesta");
        for(int i = 0; i < c; i++)
        {
            for (int j = 0; j < f; j++)
            {
                System.out.print("["+matrizT[i][j]+"]"+" ");
            }
            System.out.println ("");
        }
    }
}
