

import javax.swing.JOptionPane;

public class Arbol_Binario_de_Busqueda {

	public static void main(String[] args) {
		
		int opcion = 0, elemento;
		String nombre;
		Arbol arbolito = new Arbol();
		do{
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Arbol vacio\n"
						+ "2. Buscar un Nodo en el Arbol\n"
						+ "3. Insertar Nodo en el Arbol\n"
						+ "4. Imprimir Arbol\n"
						+ "5. Salir\n"
						+ "Elige Una Opcion...", "Arboles Binarios"
							, JOptionPane.QUESTION_MESSAGE));
				switch(opcion) {
				case 1:
					if(!arbolito.estaVacio()) {
						JOptionPane.showMessageDialog(null, "El Arbol no esta Vacio",
								"¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "El Arbol esta Vacio",
								"¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 2:
					if(!arbolito.estaVacio()) {
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Ingresa el Numero del Nodo Buscado...","Buscando Nodo",JOptionPane.QUESTION_MESSAGE));
						
						if(arbolito.buscarNodo(elemento) == null) {
							JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Arbol",
									"¡Nodo No Encontrado!", JOptionPane.INFORMATION_MESSAGE);
						}else {
							System.out.println("Nodo Encontrado, sus datos son:" + arbolito.buscarNodo(elemento) );
						}
					}else {
					JOptionPane.showMessageDialog(null, "El Arbol esta Vacio",
					"¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
				}
					break;
				case 3:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa el Numero del Nodo...","Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
					nombre = JOptionPane.showInputDialog(null,
							"Ingresa el Nombre del Nodo...","Agregando Nodo"
							,JOptionPane.QUESTION_MESSAGE);
					arbolito.Insertar(elemento, nombre);
					break;
				case 4:
					if(arbolito.estaVacio()) {
						JOptionPane.showMessageDialog(null, "El Arbol esta Vacio",
								"¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
					}else {
						System.out.println("\nArbol:");
						arbolito.ImprimirArbol();
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Aplicacion finalizada ",
							"Fin", JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Opcion incorrecta",
								"¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
				}
			}catch(NumberFormatException n) {
				if (n.getMessage().equals("Cannot parse null string")){
					opcion=5;
					JOptionPane.showMessageDialog(null, "Aplicacion finalizada ",
							"Fin", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
				}
			}
		}while(opcion!=5);
	}

}
