package Superclases;

public class Ruta {

    // Atributos propios de la clase
    private String origen;
    private String destino;
    private double precioBase;

    // Constructor Vacio
    public Ruta() {

    }

    // Constructor con parámetros
    public Ruta(String origen, String destino, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    // Metodos get y set
    // Metodos get y set para origen
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getOrigen() {
        return origen;
    }

    // Metodos get y set para destino
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getDestino() {
        return destino;
    }

    // Metodos get y set para precioBase
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    // Metodos de la clase
    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Ruta:");
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Precio Base: " + precioBase);
    }
}
