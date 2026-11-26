public class TestAutomovil {
    public static void main(String[] args) {
        Automovil miCoche = new Automovil("Peugeot", "2008", 1989);
        miCoche.mostrarInformacion();
        System.out.println("---------");
        System.out.println(miCoche);

        try{
            miCoche.setMarca("");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            miCoche.setModelo(null);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            miCoche.setAnio(12);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(Automovil.ANIO_PRIMER_AUTOMOVIL);

        try{
            Automovil cocheMal = new Automovil("Peugot", "73", 12);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
