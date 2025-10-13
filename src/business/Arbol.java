package business;
import business.NodoArbol;


public class Arbol {

    /*Atributos*/
    private NodoArbol raiz;

    /*Metodos*/
    /*Constructor*/
    public Arbol() {
        raiz = null;
    }

    /*Getters*/
    public NodoArbol getRaiz() {
        return raiz;
    }

    /*Setters*/
    public void setRaiz(NodoArbol nuevaRaiz) {
        raiz = nuevaRaiz;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public NodoArbol buscar(int llaveBuscar) {
        if (estaVacio()) {
            System.out.println("El arbol está vacío");
            return null;
        }

        NodoArbol nodoTemp = raiz;
        while(nodoTemp.getLlave() != llaveBuscar) {
            if(llaveBuscar < nodoTemp.getLlave()) {
                nodoTemp = nodoTemp.getHijoIzquierdo();
            } else {
                nodoTemp = nodoTemp.getHijoDerecho();
            }
            if(nodoTemp == null) {
                System.out.println("El nodo buscado no está en el árbol");
                return null;
            }
        }
        return nodoTemp;
    }

    public void insertar(int llaveInsertar, Object valorInsertar) {
        NodoArbol nuevoNodo = new NodoArbol(llaveInsertar, valorInsertar);
        if(estaVacio()) {
            raiz = nuevoNodo;
            return;
        }

        NodoArbol nodoActual = raiz;
        NodoArbol padreActual;
        while(true) {
            padreActual = nodoActual;
            if(llaveInsertar < padreActual.getLlave()) {
                nodoActual = nodoActual.getHijoIzquierdo();
                if(nodoActual == null) {
                    padreActual.setHijoIzquierdo(nuevoNodo);
                    return;
                }
            }else if(llaveInsertar > nodoActual.getLlave()) {
                nodoActual = nodoActual.getHijoDerecho();
                if(nodoActual == null) {
                    padreActual.setHijoDerecho(nuevoNodo);
                    return;
                }
            } else {
                System.out.println("La llave ya se encuentra presente; el nodo no se puede insertar");
                return;
            }
        }
    }

    public void enOrden(NodoArbol raizTemp) {
        if(raizTemp != null) {
            enOrden(raizTemp.getHijoIzquierdo());
            System.out.println(raizTemp.getLlave());
            enOrden(raizTemp.getHijoDerecho());
        }
    }

    public void preOrden(NodoArbol raizTemp) {
        if(raizTemp != null) {
            System.out.println(raizTemp.getLlave() + " ");
            preOrden(raizTemp.getHijoIzquierdo());
            preOrden(raizTemp.getHijoDerecho());
        }
    }

    public void postOrden(NodoArbol raizTemp) {
        if(raizTemp != null) {
            postOrden(raizTemp.getHijoIzquierdo());
            postOrden(raizTemp.getHijoDerecho());
            System.out.println(raizTemp.getLlave());
        }
    }

    private NodoArbol getSucesor(NodoArbol nodoBorrar){
        NodoArbol padreSucesor = nodoBorrar;
        NodoArbol sucesor = nodoBorrar;
        NodoArbol nodoActual = nodoBorrar.getHijoDerecho();
        while (nodoActual != null){
            padreSucesor = sucesor;
            sucesor = nodoActual;
            nodoActual = nodoActual.getHijoIzquierdo();
        }
        if(sucesor != nodoBorrar.getHijoIzquierdo()) {
            padreSucesor.setHijoIzquierdo(sucesor.getHijoDerecho());
            sucesor.setHijoDerecho(nodoBorrar.getHijoDerecho());
        }
        return sucesor;
    }
}

