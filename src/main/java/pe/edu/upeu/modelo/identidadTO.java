package pe.edu.upeu.modelo;

import pe.edu.upeu.util.*;

public class identidadTO 
{
    static LeerTeclado lt = new LeerTeclado();

    public void matriz_identidad() 
    {
        int matriz1[][] = new int [20][20];
        int limite;

        do
        {
            limite = lt.leer(0, "Ingrese el numero de elementos: ");
        }while (limite < 3 || limite >= 11);

        System.out.println("Matriz Identidad");
        for (int i = 0; i < limite; i++ )
        {
            for (int j = 0; j < limite; j++ )
            {
            if (i==j)
            {
            matriz1 [i][i]=1;
            }   
            else
            {
            matriz1 [i][i]=0;
            }    
            System.out.print(" " + "[" + matriz1[i][i] + "]" + "  ");
            }
            System.out.print("\n");
        }
     System.out.println();
    }  
}
