

public class Nodo {
	
	int dato;
	String nombre;
	Nodo hijoIzquierdo, hijoDerecho;
	
    public Nodo (int d, String nom) {
    	this.dato=d;
    	this.nombre=nom;
    	this.hijoDerecho=null;
    	this.hijoIzquierdo=null;
    }
    
    public Nodo BuscaInOrden(String nombre) {
    	
		Nodo Retorno = null;
		
		if(nombre.equals( this.nombre )) 
		{
			return this;
		}
		if(hijoIzquierdo != null) 
		{
			Retorno = hijoIzquierdo.BuscaInOrden(nombre);
		}else if (hijoDerecho != null)
		{
			Retorno = hijoDerecho.BuscaInOrden(nombre);
		}
		
		if(Retorno != null) {
			return Retorno;
		}
			return null;

	}
    
    public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Nodo getHijoIzquierdo() {
		return hijoIzquierdo;
	}

	public void setHijoIzquierdo(Nodo hijoIzquierdo) {
		this.hijoIzquierdo = hijoIzquierdo;
	}

	public Nodo getHijoDerecho() {
		return hijoDerecho;
	}

	public void setHijoDerecho(Nodo hijoDerecho) {
		this.hijoDerecho = hijoDerecho;
	}
    
    public String toString() {
    	return nombre + " Su dato es " + dato;
    }
}
