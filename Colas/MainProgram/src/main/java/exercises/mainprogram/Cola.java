package exercises.mainprogram;
public class Cola {
    NodoCola inicio,fin;
    int size;
    public Cola(){
        inicio = fin = null;
        size = 0;
    }
    public boolean Vacia(){
        if(inicio == null && fin == null){
            return true;
        }
        return false;
    }
    public void Encolar(int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(!Vacia()){  
          fin.siguiente = nuevo;  
        }
        else{
            nuevo = inicio;
        }
        fin = nuevo;
        size++;       
    }
    public void DesenColarDesdeInicio(){
        int lechero = inicio.dato;
        inicio = inicio.siguiente;
        size--;
    }
    public int SizeCola(){
        return size;
    }
}
