package alquilerVehiculos;

public class Coche extends Vehiculo {

     double precioCoche;

    public Coche( String matricula, String tipoVehiculo, int dias,double precioCoche) {
        super(matricula, tipoVehiculo,  dias);
        this.precioCoche = precioCoche;//1.5

    }

    public double getPrecioCoche() {
        return precioCoche;
    }

    public void setPrecioCoche(double precioCoche) {
        this.precioCoche = precioCoche;
    }

    @Override
    public double calculaPrecio(double precio,int dias) {

        return precioBase + (precio*dias);

    }
}
