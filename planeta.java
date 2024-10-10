public class planeta {
    private String nombre;
    private int satelites;
    private double peso;
    private double volumen;
    private double diametro;
    private double distancia;
    private boolean visible;

    public planeta (String nombre, int satelites, double peso, double volumen, double diametro, double distancia, boolean visible) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.peso = peso;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.visible = visible;
    }

    public double calcularDensidad() {
        return peso / volumen;
    }

    public void Caracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Satélites: " + satelites);
        System.out.println("Peso: " + peso);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia: " + distancia);
        System.out.println("Visible: " + visible);
        System.out.println("Densidad: " + calcularDensidad());
    }
}
