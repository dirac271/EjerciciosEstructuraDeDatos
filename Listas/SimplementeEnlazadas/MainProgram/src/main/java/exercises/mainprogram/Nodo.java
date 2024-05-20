package exercises.mainprogram;
public class Nodo {
    public int dato;
    public Nodo siguiente; //puntero
    //al final
    public Nodo(int d){
        this(d,null);
    }
    //constructor al inicio
    public Nodo(int d,Nodo nodo){
        dato = d;
        siguiente = nodo;
    }
}
