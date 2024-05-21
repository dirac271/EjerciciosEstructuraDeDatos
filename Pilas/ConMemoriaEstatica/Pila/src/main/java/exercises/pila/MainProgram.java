
package exercises.pila;
public class MainProgram {
    public static void main(String[] args) {
        Pila pila = new Pila(10);
        pila.empujar(1);
        pila.empujar(2);
        pila.empujar(3);
        System.out.println(pila.PilaCima());
        System.out.println(pila.tamanioPila());
        pila.sacar();
        System.out.println(pila.PilaCima());
    }
}
