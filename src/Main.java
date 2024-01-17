import com.ceica.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("marca1", "modelo1", "año1");
        VehiculoMotorizado vehiculo2 = new VehiculoMotorizado("marca2", "modelo2", "año2", "combustible2");
        Automovil automovil = new Automovil("marca3", "modelo3", "año3", "combustible3", "puertas3");
        Motocicleta motocicleta = new Motocicleta("marca4", "modelo4", "año4", "combustible4", "tipomoto4");

        vehiculo1.mostrarDetalles();
        System.out.println();
        vehiculo2.mostrarDetalles();
        System.out.println();
        automovil.mostrarDetalles();
        System.out.println();
        motocicleta.mostrarDetalles();

    }
}