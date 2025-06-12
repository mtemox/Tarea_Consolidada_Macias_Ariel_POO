package Subclases;

import Superclases.*;

public class TicketNormal extends Ticket {

    // Atributos propios de la clase
    private int espacioMaleta;
    private String ubicacionAsiento;
    private boolean maletaAdicional;

    // Constructor vacio
    public TicketNormal() {}

    // Constructor con parametros
    public TicketNormal(int ticketID, Pasajero pasajero, Ruta ruta, int espacioMaleta, String ubicacionAsiento, boolean maletaAdicional) {
        super(ticketID, pasajero, ruta);
        this.espacioMaleta = 1;
        this.ubicacionAsiento = ubicacionAsiento;
        this.maletaAdicional = maletaAdicional;
    }

    // Metodos get y set
    // Metodos get y set para espacioMaleta
    public void setEspacioMaleta(int espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }
    public int getEspacioMaleta() {
        return espacioMaleta;
    }

    // Metodos get y set para ubicacionAsiento
    public void setUbicacionAsiento(String ubicacionAsiento) {
        this.ubicacionAsiento = ubicacionAsiento;
    }
    public String getUbicacionAsiento() {
        return ubicacionAsiento;
    }

    // Metodos get y set para maletaAdicional
    public void setMaletaAdicional(boolean maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }
    public boolean isMaletaAdicional() {
        return maletaAdicional;
    }

    // Sobreescribo los metodos de la clase padre
    // Sobreescribo el metodo para mostrar la informacion
    @Override
    public void imprimirDatos() {
        System.out.println("\n--- Ticket Normal ---");
        System.out.println("ID Ticket: " + ticketID);
        System.out.println("Pasajero: " + pasajero.getNombre());
        System.out.println("Ruta: " + ruta.getOrigen() + " a " + ruta.getDestino());
        System.out.println("Precio Base: $" + ruta.getPrecioBase());
        System.out.println("Espacio para maletas: " + espacioMaleta);
        System.out.println("Ubicación del asiento: " + ubicacionAsiento);
        System.out.println("¿Maleta Adicional?: " + (maletaAdicional ? "Si" : "No"));
    }

    // Sobreescribo el metodo para calcular el costo
    @Override
    public double calcularCosto() {

        double costo = super.calcularCosto();
        if (maletaAdicional) {
            // Suponiendo que una maleta extra cuesta $5
            costo += 5;
        }

        return costo;
    }
}


