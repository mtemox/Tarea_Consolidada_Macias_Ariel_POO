package Superclases;

public class Pasajero {

    // Atributos propios de la clase
    private String nombre;
    private String cedula;

    // Constructor vacio
    public Pasajero() {

    }

    // Metodo constructor
    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Metodos get y set
    // Metodos get y set para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    // Metodos get y set para cedula
    public void setCedula(String cedula) {
        this.cedula = nombre;
    }
    public String getCedula() {
        return cedula;
    }

    // Metodo para mostrar infomracion
    public void mostrarInformacion() {
        System.out.println("Información del pasajero:");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Cédula: " + cedula);
    }
}
