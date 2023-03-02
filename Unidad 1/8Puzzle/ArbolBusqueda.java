
package Puzzle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ArbolBusqueda {
    
    Nodo raiz;
    String objetivo;
    
    public ArbolBusqueda(Nodo raiz, String objetivo)
    {
        this.raiz = raiz;
        this.objetivo = objetivo;
    }
    
    //Busqueda por Anchura
    public void busquedaPorAnchura()
    {
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList();
        Queue<Nodo> estadosPorVisitar = new LinkedList();
        while(!nodoActual.getEstado().equals(objetivo))
        {
            estadosVisitados.add(nodoActual.getEstado());
            //Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos();	//<-- Cada Equipo tiene que ingeniarselas para crear este metodo!
            for (String hijo : hijos) {
                if(!estadosVisitados.contains(hijo))
                {
                    //System.out.println("---Metiendo nuevo Nodo");
                    //Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.poll();
        }
        System.out.println(nodoActual.imprimirSolucion());
    }
    
    public Comparator<Nodo> Heuristica_1ra() {
        Comparator<Nodo> c = new Comparator<Nodo>() {
            @Override
            public int compare(Nodo nodo, Nodo nodo2) {
            	return Heuristica_1ra(raiz.getEstado());
            }
        };
        return c;
    }
    
    public int Heuristica_1ra(String estado) {
		
		int valorHeuristico = 0;
		
		for(int i = 0; i < estado.length(); i++) {
			if(estado.charAt(i) != objetivo.charAt(i)) {
				valorHeuristico++;
			}
		}
		return valorHeuristico;
	}
    
    public Comparator<Nodo> Heuristica_2da() {
        Comparator<Nodo> c = new Comparator<Nodo>() {
            @Override
            public int compare(Nodo nodo, Nodo nodo2) {
            	return Heuristica_2da(raiz.getEstado());
            }
        };
        return c;
    }
    
	private int Heuristica_2da(String estado) {
		
		int valorheuristico = 0, caracter1 = 0, caracter2 = 0, valorheuricaracter = 0;
		
		for(int i = 0; i < estado.length(); i++) {
			valorheuricaracter = 0;
			caracter1 = (int) estado.charAt(i);
			caracter2 = (int) objetivo.charAt(i);
			valorheuricaracter = caracter1 - caracter2;
			valorheuricaracter = Math.abs(valorheuricaracter);
			valorheuristico = valorheuricaracter + valorheuristico;
		}
		return valorheuristico;
	}

    
    public Comparator<Nodo> Heuristica_3era() {
        Comparator<Nodo> c = new Comparator<Nodo>() {
            @Override
            public int compare(Nodo nodo, Nodo nodo2) {
            	return Heuristica_3era(raiz.getEstado());
            }
        };
        return c;
    }

	public int Heuristica_3era(String estado) {
		// insertar codigo
		return 0;
	}
    
    public void busquedaPorHeuristica(int Heuristica)
    {
    	Comparator<Nodo> heuristica = null;
    	switch (Heuristica) {
	    	case 1:
	    		heuristica = Heuristica_1ra();
	    		break;
	    	case 2:
	    		heuristica = Heuristica_2da();
	    		break;
	    	case 3:
	    		heuristica = Heuristica_3era();
	    		break;
    	}
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList();
        PriorityQueue<Nodo> estadosPorVisitar = new PriorityQueue(heuristica);
        while(!nodoActual.getEstado().equals(objetivo))
        {
            estadosVisitados.add(nodoActual.getEstado());
            //Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos();	
            for (String hijo : hijos) {
                if(!estadosVisitados.contains(hijo))
                {
                    
                    //Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.poll();
        }
        
        System.out.println(nodoActual.imprimirSolucion());
    }
    
    //Busqueda por Profunfidad
    public void busquedaPorProfundidad()
    {
        Nodo nodoActual = raiz;
        Collection<String> estadosVisitados = new ArrayList();
        Stack<Nodo> estadosPorVisitar = new Stack();
        while(!nodoActual.getEstado().equals(objetivo))
        {
            estadosVisitados.add(nodoActual.getEstado());
            //Generar a los Nodos Hijos
            Collection<String> hijos = nodoActual.generaHijos();	//<-- Cada Equipo tiene que ingeniarselas para crear este metodo!
            for (String hijo : hijos) {
                if(!estadosVisitados.contains(hijo))
                {
                    //System.out.println("---Metiendo nuevo Nodo");
                    //Crear nuevo Nodo.
                    Nodo nHijo = new Nodo(hijo);
                    nHijo.setPadre(nodoActual);
                    estadosPorVisitar.add(nHijo);
                }
            }
            nodoActual = estadosPorVisitar.pop();
        }
        System.out.println(nodoActual.imprimirSolucion());
    }
    
}
