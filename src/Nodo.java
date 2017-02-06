/**
 * 
 * @author Luis Diego Fernandez
 * @version 2.5.17
 *
 */
public class Nodo {
    protected String Valor; 
    protected Nodo Siguiente; 
    
    /**
     * Constructor
     * @param valor dato generico.
     */
    public <T> Nodo(T valor)
    {
        this.Valor = valor.toString();
    }
    
    /**
     * Metodo para poner un valor al nodo.
     * @param valor dato generico.
     */
    public <T> void setValor(T valor)
    {
    	this.Valor = valor.toString();
    }
    
    /**
     * Metodo para devolver el valor del nodo, ya no en un dato generico pero en un String.
     * @return String con el valor.
     */
    public String getValor()
    {
        return this.Valor.toString();
    } 
    
    /**
     * Metodo para poner el siguiente nodo.
     * @param siguiente
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    /**
     * Metodo para devolver el nodo siguiente.
     * @return nodo siguiente
     */
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    /**
     * Metodo para devolver el valor.
     * @return valor del nodo en un String.
     */
    public String toString()
    {
        return (Valor);
    }
            
}
