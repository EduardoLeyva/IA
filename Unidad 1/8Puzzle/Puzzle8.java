package Puzzle;

import java.util.Collection;

public class Puzzle8 {
	
    public static String estadoInicial = "2465 7813";
    public static String estadoFinal = "12345678 ";
    
    public static void main(String[] args) {
        //Instanciar el arbol
        ArbolBusqueda a = new ArbolBusqueda(new Nodo(estadoInicial), estadoFinal);
        //Ejecuta la busqueda
//        a.busquedaPorAnchura();
        a.busquedaPorProfundidad();
        //Imprime movimientos
        
        /*
        Nodo n = new Nodo(estadoInicial);
        Collection<String> c = n.generaHijos();
        c = c;
        */
    }
    
}

