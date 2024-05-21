
package exercises.nodopila;
public class Pila {
    private NodoPila cima;
    int size;
    public Pila(){
        cima = null;
        size = 0;
    }
    public boolean Vacia(){
        return cima == null;
    }
    public void empujar(int dato){
        NodoPila nuevo = new NodoPila(dato);
        nuevo.next = cima;
        size++;
    }
    public int sacar(){
        int auxiliar = cima.dato;    
        cima = cima.next;
        size--;
        return auxiliar;
    }     
}
