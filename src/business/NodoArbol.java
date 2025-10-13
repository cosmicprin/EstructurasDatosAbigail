package business;
public class NodoArbol {

    /*Atributos*/
    private final int llave;
    private Object valor;
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;

    /*Metodos*/
    /*Constructor*/

    public NodoArbol(int llaveObjeto, Object valorObjeto) {
        llave = llaveObjeto;
        valor = valorObjeto;
        hijoIzquierdo = hijoDerecho = null;
    }

    /*Getters*/
    public int getLlave() {
        return llave;
    }

    public Object getValor() {
        return valor;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    /*Setters*/
    public void setValor(Object nuevoValor) {
        valor = nuevoValor;
    }

    public void setHijoIzquierdo(NodoArbol nuevoHijoIzquierdo) {
        hijoIzquierdo = nuevoHijoIzquierdo;
    }

    public void setHijoDerecho(NodoArbol nuevoHijoDerecho) {
        hijoDerecho = nuevoHijoDerecho;
    }

    public void imprimir(){
        System.out.println("Llave: " + llave + " Valor: " + valor);
    }
}
