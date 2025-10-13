package business;

public class Nodo {

    /*Atributos*/
    public Nodo siguiente;
    public Nodo anterior;
    public Object valor;

    /*Constructor*/
    public Nodo() {
        this.valor = null;
    }

    /*Métodos*/
    /*Getters*/

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public Object getValor() {
        return valor;
    }

    /*Setters*/


    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
