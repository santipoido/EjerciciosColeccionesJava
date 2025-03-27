public class Tarea {
    private String nombreTarea;
    private String descripcionTarea;
    private int id;

    public Tarea(int id, String nombreTarea, String descripcionTarea) {
        this.id = id;
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
    }

    public Tarea(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id= " + id +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", descripcionTarea='" + descripcionTarea + '\'' +
                '}';
    }
}
