package business;

public class Lista {

    public Nodo nodoInicio;
    public Nodo nodoFinal;
    public int longitud;


    /*Métodos*/
    /*Constructor*/

    public Lista (){
        this.nodoInicio = new Nodo();
        this.nodoFinal = new Nodo();
    }


    public void insertar (Object valor){
        if (nodoInicio.getValor() == null){
            nodoInicio.setValor(valor);
            nodoInicio.setSiguiente(nodoFinal);
            nodoInicio.setAnterior(nodoFinal);
            nodoFinal.setAnterior(nodoInicio);

        }else{
            Nodo nodo =  new Nodo();
            nodo.setValor(valor);
            nodo.setAnterior(nodoFinal);
            nodoFinal.setSiguiente(nodo);
            nodoFinal = nodo;
        }

        nodoFinal.setSiguiente(nodoInicio);
        nodoInicio.setAnterior(nodoFinal);
        longitud++;
        System.out.println("Insertado en lista"+longitud);

    }

    public int getLongitud() {
        return longitud;
    }

}
