
package exercises.mainprogram;
public class Lista {
    private Nodo inicio,fin;
    public Lista(){
        inicio = null;
        fin = null;
    }
    public void AgregarAlInicio(int elemento){
        inicio = new Nodo(elemento,inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    //mostrar datos
    public void MostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
            System.out.println(recorrer.dato);
            recorrer = recorrer.siguiente;
        }
        System.out.println("");
    }
    public boolean ListaVacia(){
        if(inicio == null && fin == null){
            return true;
        }
        else{
            return false;
        }
    }
    //metodo para insertar al final de la lista
    public void AgregarAlFinal(int elemento){
        if(ListaVacia()){
            fin = inicio = new Nodo(elemento);     
        }
        else{
            fin = fin.siguiente = new Nodo(elemento);
        }
    }
    public void EliminarNodoAlInicio(){
        if(ListaVacia()){
            inicio = null;
            fin = null;
        }
        else{
            inicio = inicio.siguiente;
        }
    }
    public void EliminarNodoAlFinal(){
        
        if(ListaVacia()){
            inicio = null;
            fin = null;
        }
        else{
            Nodo recorerr = inicio;
            while(recorerr.siguiente != fin){
                recorerr = recorerr.siguiente;
            }
            fin = recorerr;
            fin.siguiente = null;
        }
    }
    public void BuscarElemento(int elemento){
        Nodo Buscador = inicio;
        while(Buscador.dato != elemento && Buscador.siguiente != null){
            Buscador = Buscador.siguiente;
        }
        if(Buscador.dato == elemento){
            System.out.println("El elemento " + elemento + " esta en la lista");
        }
        else{
            System.out.println("El elemento " + elemento + " no esta en la lista");
        }
        
    }
    public void ElimarElemento(int elemento){
          if(!ListaVacia()){
              if(inicio == fin && inicio.dato == elemento){
                  inicio = fin = null;
              }
              else if(elemento == inicio.dato){
                  inicio = inicio.siguiente;
              }
              else{
                  Nodo Anterior,Visitador;
                  Anterior = inicio;
                  Visitador = inicio.siguiente;
                    while(Visitador.dato != elemento){
                        Anterior = Anterior.siguiente;
                        Visitador = Visitador.siguiente;
                    }
                    if(Visitador != null){
                        Anterior.siguiente = Visitador.siguiente;
                        if(Visitador == fin){
                            fin = Anterior;
                        }
                    }
                    
              }
          }
        }
    
}
