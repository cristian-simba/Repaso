public class Main {
    public static void main(String[] args) {
        Pelicula spiderman = new Pelicula("Spiderman",1999);
        Pelicula up = new Pelicula("Up",2002);
        Pelicula fastf = new Pelicula("Rapidos y Furiosos X", 2023);
        spiderman.imprimir();
        up.imprimir();
        fastf.imprimir();
        System.out.println(spiderman.getNombre());
        System.out.println(spiderman.getFechaEstreno());
        System.out.println("XD");
    }
}