import java.time.LocalDate;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precio_base;
    private static double valor_adicional;
    private int anoFabricacion;
    private double long_metros;

    public Embarcacion(Capitan capitan, double precio_base, int anoFabricacion, double long_metros) {
        this.capitan = capitan;
        this.precio_base = precio_base;
        this.valor_adicional = 20000;
        this.anoFabricacion = anoFabricacion;
        this.long_metros = long_metros;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public double getLong_metros() {
        return long_metros;
    }

    public double calcularMontoAlquiler(){
        if(anoFabricacion > 2020){
            return precio_base + valor_adicional;
        }
        return precio_base;
    }

    public abstract String mostrarInfo();
}
