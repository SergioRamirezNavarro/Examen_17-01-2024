import com.ceica.Vehiculo;
public class VehiculoMotorizado extends Vehiculo {
    String tipoCombustible;

    public VehiculoMotorizado(String marca, String modelo,String annofabricacion, String tipoCombustible) {
        super(marca, modelo, annofabricacion);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarDetalles()
    {
        super.mostrarDetalles();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

}