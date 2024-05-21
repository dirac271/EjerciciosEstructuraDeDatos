
package exercises.pila;
public class Pila {
    
    int VectorPila[];
    int cima;
    public Pila(int size){
        VectorPila = new int[size];
        cima = -1;
    }
    public void empujar(int dato){
       cima++;
       VectorPila[cima] = dato;
    }
    public int sacar(){
        int fuera = VectorPila[cima];
        cima--;
        return fuera;
    }
    public boolean PilaVacia(){
        if(cima== -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean Llena(){
        return cima == VectorPila.length - 1;
    }
    public int PilaCima(){
        return VectorPila[cima];
    }
    public int tamanioPila(){
        return VectorPila.length;
    }
}
