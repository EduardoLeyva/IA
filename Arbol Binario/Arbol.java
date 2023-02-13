

public class Arbol {
	Nodo raiz;
	
	public Arbol() {
		raiz=null;
	}
//	Metodo para insetar un Nodo en el arbol
	public void Insertar(int d, String nom) {
		Nodo nuevo = new Nodo (d, nom);
		if(raiz==null) {
			raiz=nuevo;
		}else {
			Nodo auxiliar = raiz;
			Nodo padre;
			while (true) {
				padre = auxiliar;
				if(d>auxiliar.dato) {
					auxiliar = auxiliar.hijoIzquierdo;
					if(auxiliar==null) {
						padre.hijoIzquierdo = nuevo;
						return;
					}
				}else {
				auxiliar = auxiliar.hijoDerecho;
				if(auxiliar==null) {
					padre.hijoDerecho=nuevo;
					return;
					}
				}
			}
		}
	}

	//Metodo para saber cuando el arbol esta vacio
	public boolean estaVacio() {
		return raiz == null;
	}
	//Metodo para buscar un Nodo en el Arbol
	public Nodo buscarNodo(int d) {
		Nodo aux = raiz;
		while(aux.dato!=d) {
			if(d<aux.dato) {
				aux = aux.hijoIzquierdo;
			}else {
				aux = aux.hijoDerecho;
			}
			if(aux == null) {
				return null;
			}
		}
		return aux;
	}
	
	//Metodo para buscar un Nodo en el Arbol
	public Nodo BuscarNodo(String nombre) {
		return raiz.BuscaInOrden(nombre);
	}
	
	//Metodo para Imprimir el Arbol
	public void ImprimirArbol() {
		ImprimirArbol(raiz);
	}

	private void ImprimirArbol(Nodo n) {
		if (n != null) {
			ImprimirArbol(n.getHijoIzquierdo());
			System.out.println(n.getNombre());
			ImprimirArbol(n.getHijoDerecho());
		}
	}

}





