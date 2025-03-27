import java.util.HashMap;
import java.util.Map;

public class AgendaContactos {
    private HashMap<String, Contacto> agendaContactos;

    public AgendaContactos() {
        agendaContactos = new HashMap<>();
    }
    public boolean agregarContacto(String nombre, String apellido, String numeroTelefono) {
        Contacto contacto = new Contacto(numeroTelefono, nombre, apellido);
        if (buscarContacto(contacto.getNumeroTelefono())){
            System.out.println("Contacto ya existe");
            return false;
        }
        agendaContactos.put(contacto.getNumeroTelefono(), contacto);
        System.out.println("Contacto agregado");
        return true;
    }

    public boolean quitarContacto(String numeroTelefono) {
        if (buscarContacto(numeroTelefono)){
            agendaContactos.remove(numeroTelefono);
            System.out.println("Contacto quitado");
            return true;
        }
        System.out.println("Contacto no existe");
        return false;

    }

    public boolean buscarContacto(String numeroTelefono) {
        if (agendaContactos.containsKey(numeroTelefono)){
            return true;
        }else{
            return false;
        }
    }

    public void listarContactos(){
        for (Map.Entry<String, Contacto> e : agendaContactos.entrySet()){
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public boolean modificarNumero(String numeroTelefonoACambiar, String nuevoNumero){
        Contacto contactoAModificar = agendaContactos.get(numeroTelefonoACambiar);
        contactoAModificar.setNumeroTelefono(nuevoNumero);
        quitarContacto(numeroTelefonoACambiar);
        agregarContacto(contactoAModificar.getNombre(), contactoAModificar.getApellido(), nuevoNumero);
        System.out.println("El numero de contacto de " + contactoAModificar.getNombre() + " " + contactoAModificar.getApellido() + " ha sido modificado");
        return true;
    }
}
