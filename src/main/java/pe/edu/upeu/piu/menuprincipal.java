package pe.edu.upeu.piu;

import pe.edu.upeu.util.*;
import pe.edu.upeu.modelo.*;

public class menuprincipal {

    static LeerTeclado lt = new LeerTeclado();
    public static identidadTO id = new identidadTO();
    public static multiplicacionTO mt = new multiplicacionTO();
    public static restaTO rt = new restaTO();
    public static sumaTO sm = new sumaTO();
    public static transpuestaTO tp = new transpuestaTO();
    
    public void menu()
    {
        int opcionesA=0;
        System.out.println("-------------------------------");
        System.out.println("Bienvenido a la calculadora de matrices");
        String msg="\nElija la opcion que desea probar"+ 
        "\nSUMA DE MATRICES (1)"+
        "\nRESTA DE MATRICES (2)"+
        "\nIDENTIDAD DE UNA MATRIZ (3)"+
        "\nMULTIPLICACION DE UNA MATRIZ (4)"+
        "\nTRANSPUESTA DE UNA MATRIZ (5)\n";
  
        opcionesA=lt.leer(0, msg); 
        while(opcionesA!=0){
            switch(opcionesA) {
              case 1: sm.suma(); break;
              case 2: rt.resta(); break;
              case 3: id.matriz_identidad(); break;
              case 4: mt.multiplicacion(); break;
              case 5: tp.transpuesta(); break;
  
              default: System.out.println("LA OPCION QUE HA SELECIONADO NO EXISTE");
            }   
          System.out.println("------------------------------"); 
          opcionesA=lt.leer(0, msg);        
        }
    }
}
