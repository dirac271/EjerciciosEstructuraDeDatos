package exercises.mainprogram;
public class MainProgram {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.AgregarAlFinal(3);
        lista.AgregarAlFinal(2);
        lista.AgregarAlFinal(1);
        lista.MostrarLista();
        lista.ElimarElemento(2);
        lista.MostrarLista();
        lista.BuscarElemento(3);
        lista.BuscarElemento(34);
        lista.BuscarElemento(4);
    }
}
