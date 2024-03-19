public class Carne implements Alimento {
    String nombre;

    public Carne(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        System.out.println("Te doy el nombre de la carne...");
        return this.nombre;
    }

    public void ComerAlimento() {
        System.out.println("Como carne mmmm");
    }
}
