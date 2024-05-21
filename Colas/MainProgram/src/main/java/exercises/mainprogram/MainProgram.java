package exercises.mainprogram;
public class MainProgram {
    public static void main(String[] args) {
        Cola colita = new Cola();
        colita.Encolar(1);
        colita.Encolar(2);
        colita.Encolar(3);
        System.out.println(colita.size);
        System.out.println(colita.fin);
    }
    
}
