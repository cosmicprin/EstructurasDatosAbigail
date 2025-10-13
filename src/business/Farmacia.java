package business;

public class Farmacia {


    Cola clientes;
    Arbol catalogo ;

    public Farmacia() {
        clientes= new Cola();
        catalogo= new Arbol();
    }

    public Cola getClientes() {
        return clientes;
    }

    public void setClientes(Cola clientes) {
        this.clientes = clientes;
    }

    public Arbol getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Arbol catalogo) {
        this.catalogo = catalogo;
    }
}
