public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);

    }
}
class Coche {
    public int puertas = 0;
    public void sumarPuertas() {
        this.puertas++;
    }
}
