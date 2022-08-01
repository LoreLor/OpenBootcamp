public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Pablo");
        System.out.println(persona.getNombre());

        persona.setEdad("85");
        System.out.println(persona.getEdad());

        persona.setTelefono("543705");
        System.out.println(persona.getTelefono());


    }
}

class Persona{
    private String edad;
    private String nombre;
    private String telefono;



    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
