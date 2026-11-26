public class Automovil {
    private String marca, modelo;
    private int anio;

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;

    public Automovil(String marca, String modelo, int anio) {
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("La marca no puede ser nula ni vacía");
        }
        this.marca = marca;
    }

    public String getModelo() {
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("El modelo no puede ser nulo ni vacío");
        }
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < ANIO_PRIMER_AUTOMOVIL){
            throw new IllegalArgumentException("En ese año no había coches");
        }
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
