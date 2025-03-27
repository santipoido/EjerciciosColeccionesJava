import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*AgendaContactos agendaContactos = new AgendaContactos();
        agendaContactos.agregarContacto("Santiago", "Poidomani", "2236933159");
        agendaContactos.agregarContacto("Contacto", "Duplicado", "2236933159");
        agendaContactos.agregarContacto("Joaquin", "Tapia", "2234537684");
        agendaContactos.agregarContacto("Tomas", "Trapani", "2234988765");
        agendaContactos.listarContactos();
        agendaContactos.modificarNumero("2236933159", "2234384833");
        agendaContactos.listarContactos();*/

        ListaTareas listaTareas = new ListaTareas();
        listaTareas.agregarTarea(1, "Limpieza", "Limpiar la casa antes de las 21:00 horas");
        listaTareas.agregarTarea(2, "Parcial", "Parcial de programacion");
        listaTareas.agregarTarea(3, "Trabajo", "Trabajar de 16 a 21");
        System.out.println(listaTareas.listarTareas());
        System.out.println(listaTareas.terminarTarea(2));
        System.out.println(listaTareas.listarTareas());
    }
}