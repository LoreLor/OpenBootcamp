public class Main {
    public static void main(String[] args) {
        var estacion = "primavera";

        switch (estacion) {
            case "verano" -> System.out.println("verano");
            case "invierno" -> System.out.println("invierno");
            case "primavera" -> System.out.println("primavera");
            case "otoño" -> System.out.println("otoño");
            default -> System.out.println(estacion);
        }
    }



}