/**
 * 
 * @author Luis Diego Fernandez
 * @version 2.5.17
 *
 */
public class Lista {
    
    protected Nodo Cabeza; 
    
    /**
     * Metodo para inicializar un nuevo nodo.
     * @param valor dato generico que se guarda en el nodo.
     */
    public <T> void AgregarNodo(T valor) {
        Nodo Cola = ObtenerUltimo();
        if ( Cola== null)
            Cabeza = new Nodo (valor);
        else                    
            Cola.setSiguiente(new Nodo(valor));                                            
    }
    
    /**
     * Metodo para agregar nodo a la cabeza.
     * @param valor dato generico que se guarda en el nodo.
     */
    public <T> void AgregarNodoCabeza(T valor) {
    	Nodo NuevoNodo = new Nodo(valor);
    	NuevoNodo.setSiguiente(Cabeza);
    	Cabeza = NuevoNodo;
    }
    
    /**
     * Metodo para obtener el nodo que esta a la cabeza.
     * @return Cabeza
     */
    public Nodo ObtenerCabeza() {
        return Cabeza;
    }
    
    /**
     * Metodo para obtener el ultimo nodo.
     * @return NodoActual
     */
    public Nodo ObtenerUltimo() {
        Nodo NodoActual = Cabeza;
        
        if (NodoActual == null)
            return null;
        while (NodoActual.getSiguiente() !=  null)
        {
            NodoActual = NodoActual.getSiguiente();
        }
        return NodoActual;
        
    }
    
    /**
     * Metodo para eliminar nodo.
     * @return Cabeza
     */
    public Nodo EliminarNodo() {
        Nodo NodoADevolver = Cabeza; 
        Cabeza = Cabeza.getSiguiente();
        return NodoADevolver;
    
    }
    
    /**
     * Metodo para devolver un string con la informacion de los nodos.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            Nodo NodoActual = Cabeza;
            while (NodoActual!= null)
            {
                sb.append(NodoActual.getValor());
                sb.append ("->");
                NodoActual = NodoActual.getSiguiente();
            }
            
        }
        sb.append("null");
        return sb.toString();

    }
    
    
}
