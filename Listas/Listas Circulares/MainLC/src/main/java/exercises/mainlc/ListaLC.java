package exercises.mainlc;
public class ListaLC {
    NodoLC ultimo;
    public ListaLC(){
        ultimo = null;
    }
     public boolean estaVacia(){
        if(ultimo == null){
            return true;
        }
        else{
            return false;
        }
    }
     public ListaLC AgregarNodos(int dataso){
         NodoLC nuevo = new NodoLC(dataso);
            if(ultimo != null){
               nuevo.siguiente = ultimo.siguiente;
               ultimo.siguiente = nuevo;
        }
         /*  else{
               nuevo.siguiente = nuevo;
            } */
        ultimo = nuevo;
        return this;
     }
     public void mostrarLista(){
       NodoLC lechero = ultimo.siguiente;
            do{
                
                System.out.println(lechero.dato);
                lechero = lechero.siguiente;
            }
            while(lechero != ultimo.siguiente);      
     }
}
