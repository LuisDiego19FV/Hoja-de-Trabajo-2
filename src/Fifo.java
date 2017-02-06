/**
 * 
 * @author Luis Diego Fernandez
 * @version 2.5.17
 *
 */
public class Fifo {
	private Lista miLista;
	
	/**
	 * Constructor
	 */
	public Fifo(){
		miLista = new Lista();
	}
		
	/**
	 * Metodo para agregar un valor a un nuevo nodo de la lista.
	 * @param valor Parametro generico.
	 */
	public <T> void addQ(T valor){
		miLista.AgregarNodo(valor);
	}
	
	/**
	 * Metodo para quitar un nodo de la lista.
	 */
	public void quitQ(){
		miLista.EliminarNodo();
	}
	
	/**
	 * Metodo el cual devuelve el valor de un nodo en la lista o en el caso de que este sea nulo mande un 
	 * String diciendo null.
	 * @return valor del nodo cabeza o mensaje diciendo que este es nulo.
	 */
	public String getIt(){
		try{
			return miLista.ObtenerCabeza().getValor();	
			
		} catch (Exception e){
			return "null";
		}
	}
}


