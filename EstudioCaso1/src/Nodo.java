public class Nodo {

    /*Atributos*/

    char dato;       /*El token*/
    Nodo siguiente;  /*Enlace al siguiente nodo*/

    /*Constructor*/
    public Nodo(char dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
