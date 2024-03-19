public class Fruta implements Alimento {
    String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void ComerAlimento() {
        System.out.println("Como fruta mmmm");
    }
}
