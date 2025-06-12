// Estudiante: Ariel Macias
package Main;

import Subclases.TicketNormal;
import Subclases.TicketVIP;
import Superclases.Pasajero;
import Superclases.Ruta;

public class Main {
    public static void main(String[] args) {

        // Instanciar al menos 5 objetos con valores nulos y posteriormente
        // setear algunos de  sus atributos. Utilizar setters con valores quemados

        // Creo las rutas disponibles
        Ruta quitoGuayaquil = new Ruta("Quito", "Guayaquil", 20.00);
        Ruta quitoTulcan = new Ruta("Quito", "Tulcan", 17.50);
        Ruta quitoPuyo = new Ruta("Quito", "Puyo", 15.00);

        System.out.println("\nObjetos creados con setters:\n");

        // Objeto 1 - Ticket Normal
        TicketNormal t1 = new TicketNormal();
        t1.setTicketID(123);
        t1.setPasajero(new Pasajero("Juan", "1756266148"));
        t1.setRuta(quitoGuayaquil);
        t1.setEspacioMaleta(1);
        t1.setUbicacionAsiento("Ventana");
        t1.setMaletaAdicional(true);
        t1.imprimirDatos();
        System.out.println("Precio final: $" + t1.calcularCosto());

        // Objeto 2 - Ticket VIP
        TicketVIP t1vip = new TicketVIP();
        t1vip.setTicketID(124);
        t1vip.setPasajero(new Pasajero("Pedro", "1756266145"));
        t1vip.setRuta(quitoPuyo);
        t1vip.setEspacioMaleta(2);
        t1vip.setUbicacionAsiento("Ventana");
        t1vip.setMaletaAdicional(true);
        t1vip.imprimirDatos();
        System.out.println("Precio final: $" + t1vip.calcularCosto());

        // Objeto 3 - Ticket Normal
        TicketNormal t2 = new TicketNormal();
        t2.setTicketID(125);
        t2.setPasajero(new Pasajero("Maria", "1756266143"));
        t2.setRuta(quitoTulcan);
        t2.setEspacioMaleta(1);
        t2.setUbicacionAsiento("Pasillo");
        t2.setMaletaAdicional(true);
        t2.imprimirDatos();
        System.out.println("Precio final: $" + t2.calcularCosto());

        // Objeto 4 - Ticket VIP
        TicketVIP t2vip = new TicketVIP();
        t2vip.setTicketID(126);
        t2vip.setPasajero(new Pasajero("Ariel", "1756266142"));
        t2vip.setRuta(quitoPuyo);
        t2vip.setEspacioMaleta(2);
        t2vip.setUbicacionAsiento("Ventana");
        t2vip.setMaletaAdicional(true);
        t2vip.imprimirDatos();
        System.out.println("Precio final: $" + t2vip.calcularCosto());
        // Objeto 5 - Ticket VIP
        TicketVIP t3vip = new TicketVIP();
        t3vip.setTicketID(127);
        t3vip.setPasajero(new Pasajero("Susana", "1756266147"));
        t3vip.setRuta(quitoPuyo);
        t3vip.setEspacioMaleta(2);
        t3vip.setUbicacionAsiento("Ventana");
        t3vip.setMaletaAdicional(true);
        System.out.println("Precio final: $" + t3vip.calcularCosto());

        // PARTE 2: Instanciar 5 objetos con valores iniciales
        System.out.println("\nObjetos creados con constructores:\n");

        // Objeto 1 - Ticket Normal
        Pasajero p1 = new Pasajero("Andrea", "1756266152");
        TicketNormal t3 = new TicketNormal(128, p1, quitoGuayaquil, 1, "Ventana", true);
        t3.imprimirDatos();
        System.out.println("Precio final: $" + t3.calcularCosto());

        // Objeto 2 - Ticket VIP
        Pasajero p2 = new Pasajero("Mario", "1756266155");
        TicketVIP t4vip = new TicketVIP(129, p2, quitoPuyo, 2, "Pasillo", true, true, 2);
        t4vip.imprimirDatos();
        System.out.println("Precio final: $" + t4vip.calcularCosto());

        // Objeto 3 - Ticket Normal
        Pasajero p3 = new Pasajero("Paola", "1756266156");
        TicketNormal t4 = new TicketNormal(130, p3, quitoTulcan, 1, "Pasillo", true);
        t4.imprimirDatos();
        System.out.println("Precio final: $" + t4.calcularCosto());

        // Objeto 4 - Ticket VIP
        Pasajero p4 = new Pasajero("Fernando", "1756266157");
        TicketVIP t5vip = new TicketVIP(131, p4, quitoPuyo, 2, "Al frente", true, true, 2);
        t5vip.imprimirDatos();
        System.out.println("Precio final: $" + t5vip.calcularCosto());

        // Objeto 5 - Ticket VIP
        Pasajero p5 = new Pasajero("Mateo", "1756266159");
        TicketVIP t6vip = new TicketVIP(132, p5, quitoGuayaquil, 2, "Ventana", true, true, 2);
        t6vip.imprimirDatos();
        System.out.println("Precio final: $" + t6vip.calcularCosto());
    }
}
