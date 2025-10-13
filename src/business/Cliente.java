package business;

public class Cliente {

    /*Atributos*/
    private String nombreCompleto;
    private String cedula;
    private Lista servicios = new Lista();
    private boolean prioridad;

    /*Métodos*/
    /*Constructor*/
    public Cliente(String nombreObjeto, String cedulaObjeto, boolean prioridad) {
        nombreCompleto = nombreObjeto;
        cedula = cedulaObjeto;
        servicios = new Lista();
        this.prioridad = prioridad;
    }

    /*Getters*/
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    /*Setters*/
    public void setNombreCompleto(String nuevoNombreCompleto) {
        nombreCompleto = nuevoNombreCompleto;
    }
    public Lista getServicios() {
        return servicios;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
}
