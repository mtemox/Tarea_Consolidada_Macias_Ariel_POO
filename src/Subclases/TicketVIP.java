package Subclases;

import Superclases.*;

public class TicketVIP extends TicketNormal {

    // Atributos propios de la clase
    private boolean maletaAdicional;
    private int espacioMaleta;
    private boolean servicioInternet = true;
    private boolean servicioTelevision = true;
    private boolean servicioComida = true;
    private boolean sevicioElectrico = true;

    // Constructor vacio
    public TicketVIP() {
    }

    // Metodo constructor con parametros
    public TicketVIP(int ticketID, Pasajero pasajero, Ruta ruta, int espacioMaleta, String ubicacionAsiento, boolean maletaAdicional, boolean maletaAdicional1, int espacioMaleta1) {
        super(ticketID, pasajero, ruta, espacioMaleta, ubicacionAsiento, maletaAdicional);
        this.maletaAdicional = maletaAdicional1;
        this.espacioMaleta = espacioMaleta1;
    }

    // Metodos get y set

    // Metodos get y set para espacioMaleta
    @Override
    public void setEspacioMaleta(int espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }
    @Override
    public int getEspacioMaleta() {
        return espacioMaleta;
    }

    // Metodos get y set para servicioInternet
    public void setServicioInternet(boolean servicioInternet) {
        this.servicioInternet = servicioInternet;
    }
    public boolean isServicioInternet() {
        return servicioInternet;
    }

    // Metodos get y set para servicioTelevision
    public void setServicioTelevision(boolean servicioTelevision) {
        this.servicioTelevision = servicioTelevision;
    }
    public boolean isServicioTelevision() {
        return servicioTelevision;
    }

    // Metodos get y set para servicioComida
    public void setServicioComida(boolean servicioComida) {
        this.servicioComida = servicioComida;
    }
    public boolean isServicioComida() {
        return servicioComida;
    }

    // Metodos get y set para servicioComida
    public void setSevicioElectrico(boolean sevicioElectrico) {
        this.sevicioElectrico = sevicioElectrico;
    }
    public boolean isSevicioElectrico() {
        return sevicioElectrico;
    }


    // Sobreescribo el metodo para mostrar imprimir datos
    @Override
    public void imprimirDatos() {
        System.out.println("\n--- Ticket VIP ---");
        System.out.println("ID Ticket: " + ticketID);
        System.out.println("Pasajero: " + pasajero.getNombre());
        System.out.println("Ruta: " + ruta.getOrigen() + " a " + ruta.getDestino());
        System.out.println("Precio Base: $" + ruta.getPrecioBase());
        System.out.println("Servicios: " + (servicioInternet ? "Internet, " : null) + (servicioTelevision ? "Televsion, " : null) + (servicioComida ? "Comida, " : null) + (sevicioElectrico ? "Electricidad" : null));
    }

    // Sobreescritura para calcular el costo

    @Override
    public double calcularCosto() {
        double costo = (super.calcularCosto() * 1.30);

        if (maletaAdicional) {
            // Suponiendo que añadir una maleta adicional cuesta $5
            costo += 5;
        }

        return costo;
    }
}
