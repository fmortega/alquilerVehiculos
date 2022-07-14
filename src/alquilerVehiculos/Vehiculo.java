package alquilerVehiculos;

public class Vehiculo {

    private String matricula;
    private String tipoVehiculo;
    private double precioBase;
    private int dias;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Vehiculo() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calculaPrecio(int dias,String matricula) {
        if (tipoVehiculo.equals("Coche")) {
            double pre;
            pre = precioBase * (double) dias + 1.5;
            return pre;
        }

        return 0;
    }

}
