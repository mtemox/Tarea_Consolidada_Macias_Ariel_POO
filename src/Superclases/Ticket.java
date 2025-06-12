package Superclases;

public class Ticket {

    // Atributos de la clase
    protected int ticketID;
    protected Pasajero pasajero;
    protected Ruta ruta;

    // Constructor vacio
    public Ticket() {}

    // Constructor con parámetros
    public Ticket(int ticketID, Pasajero pasajero, Ruta ruta) {
        this.ticketID = ticketID;
        this.pasajero = pasajero;
        this.ruta = ruta;
    }

    // Metodos get y set
    // Metodos get y set para ticketID
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    public int getTicketID() {
        return ticketID;
    }

    // Metodos get y set para ticketID
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }

    // Metodos get y set para ticketID
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    public Ruta getRuta() {
        return ruta;
    }

    // Metodos propios de la clase
    // Metodo para imprimir datos del ticket
    public void imprimirDatos() {
        System.out.println("ID Ticket: " + ticketID);
        System.out.println("Pasajero: " + pasajero.getNombre());
        System.out.println("Ruta: " + ruta.getOrigen() + " a " + ruta.getDestino());
        System.out.println("Precio Base: $" + ruta.getPrecioBase());
    }

    // Metodo que sera sobre escrito por las subclases
    public double calcularCosto() {
        return ruta.getPrecioBase();
    }
}
