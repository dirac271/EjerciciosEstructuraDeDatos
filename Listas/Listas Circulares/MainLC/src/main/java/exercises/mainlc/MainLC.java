
package exercises.mainlc;
public class MainLC {
    public static void main(String[] args) {
         ListaLC lista = new ListaLC();
        lista.AgregarNodos(10);
        lista.AgregarNodos(20);
        lista.AgregarNodos(30);
        lista.mostrarLista(); // Debería imprimir los nodos con datos 10, 20, y 30|
    }
}
