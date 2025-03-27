import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AgendaContactos agendaContactos = new AgendaContactos();
        agendaContactos.agregarContacto("Santiago", "Poidomani", "2236933159");
        agendaContactos.agregarContacto("Contacto", "Duplicado", "2236933159");
        agendaContactos.agregarContacto("Joaquin", "Tapia", "2234537684");
        agendaContactos.agregarContacto("Tomas", "Trapani", "2234988765");
        agendaContactos.listarContactos();
        agendaContactos.modificarNumero("2236933159", "2234384833");
        agendaContactos.listarContactos();
    }
}