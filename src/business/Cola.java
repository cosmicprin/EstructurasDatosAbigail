package business;

public class Cola {
    Nodo primero;
    Nodo ultimo;

    public Cola() {
        primero = new Nodo();
        ultimo = new Nodo();
    }

    public void insertar(Object valor){
        if(primero.getValor() == null){
            primero.setValor(valor);
            primero.setSiguiente(ultimo);
        }else{
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

        System.out.println("Insertado en cola");
    }

    public Nodo getPrimero() {
        return primero;
    }
    public Nodo getUltimo() {
        return ultimo;
    }
}
