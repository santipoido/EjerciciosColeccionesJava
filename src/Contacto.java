public class Contacto {
    private String numeroTelefono;
    private String nombre;
    private String apellido;

    public Contacto(String numeroTelefono, String nombre, String apellido) {
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Contacto() {}

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
