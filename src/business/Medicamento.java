package business;

public class Medicamento extends Servicio {

    /*Atributos*/
    public String indicacion;
    public int cantidad;

    /*Constructor*/
    public Medicamento(String nombreObjeto, double precioObjeto, String indicacionObjeto, int cantidadObjeto) {
        super(nombreObjeto, precioObjeto);

        indicacion = indicacionObjeto;
        cantidad = cantidadObjeto;
    }

    /*Getters*/
    public String getIndicacion() {
        return indicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    /*Setters*/
    public void setIndicacion(String nuevaIndicacion) {
        indicacion = nuevaIndicacion;
    }

    public void setCantidad(int nuevaCantidad) {
        cantidad = nuevaCantidad;
    }
}
