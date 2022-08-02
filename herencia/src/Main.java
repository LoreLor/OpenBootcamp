public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("sandra");
        cliente.setEdad("34");
        cliente.setTelefono("14587");
        cliente.setCredito("35.000");
        System.out.println("Soy cleinte y me llamo: "+cliente.getNombre());
        System.out.println("tengo:"+" "+cliente.getEdad()+" " +"años");
        System.out.println("Mi telefono es: "+" "+cliente.getTelefono());
        System.out.println("tengo un credito de "+ " " + cliente.getCredito());
        Trabajador trabajador = new Trabajador ();
        trabajador.setSalario(150000);
        System.out.println("Soy el trabajador:"+trabajador.getSalario());

    }
}
    class Persona {
        String edad;
        String nombre;
        String telefono;

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

    class Cliente extends Persona {
        String credito;

        public String getCredito() {
            return credito;
        }

        public void setCredito(String credito) {
            this.credito = credito;
        }
    }

    class Trabajador extends Persona {
        int salario;

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
    }
