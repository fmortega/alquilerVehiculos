package alquilerVehiculos;

public class Vehiculo {

    private String matricula;
    private String tipoVehiculo;
    double precioBase;
    private int dias;

    public Vehiculo(String matricula, String tipoVehiculo, int dias) {
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.precioBase = 50;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
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

    public double calculaPrecio(double precio,int dias) {

        return precio * dias;
    }

    double calculaPrecio(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
