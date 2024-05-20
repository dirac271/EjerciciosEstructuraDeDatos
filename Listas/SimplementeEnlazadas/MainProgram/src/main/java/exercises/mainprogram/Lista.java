
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
    }
}
