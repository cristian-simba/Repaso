public class Pelicula {
    String nombre;
    int fechaEstreno;

    public Pelicula(String nombre, int fechaEstreno) {
        this.nombre = nombre;
        this.fechaEstreno = fechaEstreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    public void imprimir(){
        System.out.println("La película es: "+getNombre()+" y se estreno en "+getFechaEstreno());
    }
}
