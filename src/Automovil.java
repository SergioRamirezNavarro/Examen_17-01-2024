public class Automovil extends VehiculoMotorizado {
    String numeroPuertas;

    public Automovil(String marca, String modelo, String annofabricacion, String tipoCombustible, String numeroPuertas) {
        super(marca, modelo, annofabricacion, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroPuertas);
    }

}
