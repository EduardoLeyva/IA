package U1;
public class Arbol {
	Nodo raiz;
	
	public Arbol() {
		raiz=null;
	}
	
//	Metodo para insetar un Nodo en el arbol
	public void Insertar(String nom) {
		Nodo nuevo = new Nodo (nom);
		if(raiz==null) {
			raiz=nuevo;
		}else {
			Nodo auxiliar = raiz;
			Nodo padre;
			while (true) {
				padre = auxiliar;
				auxiliar = auxiliar.hijoIzquierdo;
				if(auxiliar==null) {
					padre.hijoIzquierdo = nuevo;
					return;
				}
			}
		}
	}

	//Metodo para saber cuando el arbol esta vacio
	public boolean estaVacio() {
		return raiz == null;
	}
	
	//Metodo para buscar un Nodo en el Arbol
	public Nodo buscarNodo(String nombre) {
		return buscarNodo(nombre, raiz);
	}

	private Nodo buscarNodo(String nombre, Nodo r) {
		Nodo Retorno = null;
		String compara = r.nombre;
		if (nombre.equals(compara)) return r;
		if (r.getHijoIzquierdo() != null) Retorno = r.getHijoIzquierdo().AuxBuscar(nombre);
		if (r.getHijoDerecho() != null) Retorno = r.getHijoDerecho().AuxBuscar(nombre);
		if (Retorno != null) return Retorno;
		return null;
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

