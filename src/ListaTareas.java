import java.util.ArrayList;

public class ListaTareas {
    ArrayList<Tarea> listaTareas;

    public ListaTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public boolean agregarTarea(int id, String nombreTarea, String descripcionTarea) {
        if (buscarTarea(id) == -1){
            Tarea tarea = new Tarea(id, nombreTarea, descripcionTarea);
            listaTareas.add(tarea);
            return true;
        }
        return false;
    }

    public String listarTareas(){
        StringBuilder rta = new StringBuilder();
        for (Tarea tarea : listaTareas) {
            rta.append(tarea.toString());
            rta.append("\n");
        }
        return rta.toString();
    }

    public boolean terminarTarea(int id) {
        if (buscarTarea(id) == -1){
            return false;
        }

        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                listaTareas.remove(tarea);
            }
        }
        return true;
    }

    public int buscarTarea(int id){
        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                return 1;
            }
        }
        return -1;
    }
}
