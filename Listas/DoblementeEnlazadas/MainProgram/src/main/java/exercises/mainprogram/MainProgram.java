
package exercises.mainprogram;
public class MainProgram {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.AgregarNodosAlInicio(1);
        lista.AgregarNodosAlFinal(2);
        lista.AgregarNodosAlFinal(3);
        lista.MostrarListaInicioAfin();
        lista.EliminarNodoInicio();
        lista.MostrarListaInicioAfin();
        lista.EliminarNodoFinal();
        lista.MostrarListaInicioAfin();
    }
}
