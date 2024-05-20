package exercises.mainprogram;
public class ListaDoble {
    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio = fin = null;
    }
    public Boolean ListaVacia(){
        return inicio == null;
    }
    //agregar nodos al final
    public void AgregarNodosAlFinal(int dato){
        if(!ListaVacia()){
            fin = new NodoDoble(dato,null,fin);
            fin.anterior.siguiente = fin;
        }
        else{
            inicio = fin = new NodoDoble(dato,null,null);
        }
    }
    public void AgregarNodosAlInicio(int dato){
        if(!ListaVacia()){
            inicio = new NodoDoble(dato,inicio,null);
            inicio.siguiente.anterior = inicio;
        }
        else{
            inicio = fin = new NodoDoble(dato,null,null);
        }
    }
    //mostrar la lista de inicio a fin
    public void MostrarListaInicioAfin(){
        if(!ListaVacia()){
            NodoDoble lechero = inicio;
            while(lechero != null){
                System.out.println(lechero.dato);
                lechero = lechero.siguiente;
            }
            System.out.println("----------");
        }
    }
    public void MostrarListaFinAinicio(){
        if(!ListaVacia()){
            NodoDoble lechero = fin;
            while(lechero != null){
                System.out.println(lechero.dato);
                lechero = lechero.anterior;
            }
        }
    }
    public void EliminarNodoInicio(){
        if(inicio == fin){
            inicio = fin = null;
        }
        else{            
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
    }
    public void EliminarNodoFinal(){
        if(inicio == fin){
            inicio = fin = null;
        }
        else{            
            fin = fin.anterior;
            fin.siguiente = null;
        }
    }
}
