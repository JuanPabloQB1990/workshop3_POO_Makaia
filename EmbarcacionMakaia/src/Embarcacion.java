import java.time.LocalDate;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precio_base;
    private static double valor_adicional;
    private int anoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precio_base, int anoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precio_base = precio_base;
        this.valor_adicional = 20000;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
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

    public double getEslora() {
        return eslora;
    }

    public double calcularMontoAlquiler(){
        if(anoFabricacion > 2020){
            return precio_base + valor_adicional;
        }
        return precio_base;
    }

    public abstract String evaluarEmbarcacion();

    public abstract String mostrarInfo();
}
