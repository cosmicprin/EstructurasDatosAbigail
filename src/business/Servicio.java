package business;

public class Servicio {

    /*Atributos*/
    public int id;
    public String nombre;
    public double precio;

    /*Métodos*/
    /*Constructor*/
    public Servicio(String nombreObjeto, double precioObjeto) {
        id = (int)(Math.random()*101);

        System.out.println(id);
        nombre = nombreObjeto;
        precio = precioObjeto;
    }

    /*Getters*/
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /*Setters*/
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

}
