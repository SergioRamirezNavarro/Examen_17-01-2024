public class Motocicleta extends VehiculoMotorizado {
    String tipoMotocicleta;

    public Motocicleta(String marca, String modelo, String annofabricacion, String tipoCombustible, String tipoMotocicleta) {
        super(marca, modelo, annofabricacion, tipoCombustible);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de motocicleta: " + tipoMotocicleta);
    }
}