package Puzzle;

import java.util.Collection;


public class Puzzle8 {
	public static String estadoInicial = "1 2453786" ;
    public static String estadoendal = "12345678 ";
    
    public static void main(String[] args) {
        //Instanciar el arbol
    	ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicial), estadoendal);
     // Medicion anchura

        long start = System.nanoTime();

        a.busquedaPorAnchura();

        long end = System.nanoTime();

        double TimeAnchura = (double) (end - start) / 1000000000;
        System.out.println(" Busqueda Terminada por anchura ---> \n");

        // Medicion profundidad

        start = System.nanoTime();

        a.busquedaPorProfundidad();

        end = System.nanoTime();

        double TimeProfundidad = (double) (end - start) / 1000000000;
        System.out.println(" Busqueda Terminada por profundidad ---> \n");

        // Medicion heuristica 1

        start = System.nanoTime();

        a.busquedaPorHeuristica(1);

        end = System.nanoTime();

        double TimeHeuristica_1era = (double) (end - start) / 1000000000;
        System.out.println(" Heurística Terminada ---> " + 1 +"\n");

        // Medicion heuristica 2

        start = System.nanoTime();

        a.busquedaPorHeuristica(2);

        end = System.nanoTime();

        double TimeHeuristica_2da = (double) (end - start) / 1000000000;
        System.out.println(" Heurística Terminada ---> " + 2 +"\n");

        // Medicion heuristica 3

        start = System.nanoTime();

        a.busquedaPorHeuristica(3);

        end = System.nanoTime();

        double TimeHeuristica_3era = (double) (end - start) / 1000000000;
        System.out.println(" Heurística Terminada ---> " + 3 +"\n");

        // Imprime

        System.out.println("Anchura = " + TimeAnchura);
        System.out.println("Profundidad = " + TimeProfundidad);
        System.out.println("Heuristica 1 = " + TimeHeuristica_1era);
        System.out.println("Heuristica 2 = " + TimeHeuristica_2da);
        System.out.println("Heuristica 3 = " + TimeHeuristica_3era);

//    Estado medio
     estadoInicial = "41275386 ";
     
    //Instanciar el arbol
	a = new ArbolBusqueda(new Nodo(estadoInicial), estadoendal);
 // Medicion anchura

     start = System.nanoTime();

    a.busquedaPorAnchura();

     end = System.nanoTime();

    TimeAnchura = (double) (end - start) / 1000000000;
    System.out.println(" Busqueda Terminada por anchura ---> \n");

    // Medicion profundidad

    start = System.nanoTime();

    a.busquedaPorProfundidad();

    end = System.nanoTime();

    TimeProfundidad = (double) (end - start) / 1000000000;
    System.out.println(" Busqueda Terminada por profundidad ---> \n");

    // Medicion heuristica 1

    start = System.nanoTime();

    a.busquedaPorHeuristica(1);

    end = System.nanoTime();

    TimeHeuristica_1era = (double) (end - start) / 1000000000;
    System.out.println(" Heurística Terminada ---> " + 1 +"\n");

    // Medicion heuristica 2

    start = System.nanoTime();

    a.busquedaPorHeuristica(2);

    end = System.nanoTime();

     TimeHeuristica_2da = (double) (end - start) / 1000000000;
    System.out.println(" Heurística Terminada ---> " + 2 +"\n");

    // Medicion heuristica 3

    start = System.nanoTime();

    a.busquedaPorHeuristica(3);

    end = System.nanoTime();

    TimeHeuristica_3era = (double) (end - start) / 1000000000;
    System.out.println(" Heurística Terminada ---> " + 3 +"\n");

    // Imprime

    System.out.println("Anchura: " + TimeAnchura);
    System.out.println("Profundidad: " + TimeProfundidad);
    System.out.println("Heuristica 1: " + TimeHeuristica_1era);
    System.out.println("Heuristica 2: " + TimeHeuristica_2da);
    System.out.println("Heuristica 3: " + TimeHeuristica_3era);

//  Estado lento
   estadoInicial = "8721 4356";
   
  //Instanciar el arbol
	a = new ArbolBusqueda(new Nodo(estadoInicial), estadoendal);
// Medicion anchura

   start = System.nanoTime();

  a.busquedaPorAnchura();

   end = System.nanoTime();

  TimeAnchura = (double) (end - start) / 1000000000;
  System.out.println(" Busqueda Terminada por anchura ---> \n");

  // Medicion profundidad

  start = System.nanoTime();

  a.busquedaPorProfundidad();

  end = System.nanoTime();

  TimeProfundidad = (double) (end - start) / 1000000000;
  System.out.println(" Busqueda Terminada por profundidad ---> \n");

  // Medicion heuristica 1

  start = System.nanoTime();

  a.busquedaPorHeuristica(1);

  end = System.nanoTime();

  TimeHeuristica_1era = (double) (end - start) / 1000000000;
  System.out.println(" Heurística Terminada ---> " + 1 +"\n");

  // Medicion heuristica 2

  start = System.nanoTime();

  a.busquedaPorHeuristica(2);

  end = System.nanoTime();

   TimeHeuristica_2da = (double) (end - start) / 1000000000;
  System.out.println(" Heurística Terminada ---> " + 2 +"\n");

  // Medicion heuristica 3

  start = System.nanoTime();

  a.busquedaPorHeuristica(3);

  end = System.nanoTime();

  TimeHeuristica_3era = (double) (end - start) / 1000000000;
  System.out.println(" Heurística Terminada ---> " + 3 +"\n");

  // Imprime

  System.out.println("Anchura: " + TimeAnchura);
  System.out.println("Profundidad: " + TimeProfundidad);
  System.out.println("Heuristica 1: " + TimeHeuristica_1era);
  System.out.println("Heuristica 2: " + TimeHeuristica_2da);
  System.out.println("Heuristica 3: " + TimeHeuristica_3era);

}
   }

