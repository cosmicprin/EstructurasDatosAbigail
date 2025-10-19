public class Pila {

    private char[] elementos; /*Hice la clase Nodo por motivo de cumplimiento de rúbrica, pero se me hizo más fácil hacer la pila de esta manera*/
    private int top;

    /*Constructor*/
    public Pila(int tamano) {
        elementos = new char[tamano];
        top = -1;
    }

    /*Metodos*/
    public void push(char c) {
        if (estaLlena()) {
            System.out.println("No se puede apilar, la pila está llena");
            return;
        }
        elementos[++top] = c;
    }

    public char pop() {
        if (estaVacia()) {
            return '\0';
        }
        return elementos[top--];
    }

    public char peek() {
        if (estaVacia()) {
            return '\0'; /*el caracter, no el 0 como número null*/
        }
        return elementos[top];
    }

    public boolean estaVacia() {
        return top == -1;
    }

    public boolean estaLlena() {
        return top == elementos.length - 1;
    }

    public int getTamano() {
        return elementos.length;
    }
}