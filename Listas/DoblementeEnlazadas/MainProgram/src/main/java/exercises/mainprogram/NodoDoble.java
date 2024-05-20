
package exercises.mainprogram;
public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;
    public NodoDoble(int data){
        this(data,null,null); 
    }
    public NodoDoble(int data,NodoDoble Siguiente, NodoDoble Anterior){
        dato = data;
        siguiente = Siguiente;
        anterior = Anterior;
    }
    
}
