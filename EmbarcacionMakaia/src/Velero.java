import java.time.LocalDate;

public class Velero extends Embarcacion {
    private int cantidad_mastiles;

    public Velero (Capitan capitan, double precio_base, int anoFabricacion, double eslora, int cantidad_mastiles) {
        super(capitan, precio_base, anoFabricacion, eslora);
        this.cantidad_mastiles = cantidad_mastiles;
    }

    @Override
    public String evaluarEmbarcacion(){
        if(cantidad_mastiles > 4 ){
            return"velero grande";
        }else{
            return "velero pequeño";
        }
    }

    @Override
    public String mostrarInfo(){
        return("nombre Capitan: " + getCapitan().getNombre() +
                " - apellido: " + getCapitan().getApellido() +
                " - No Matricula: " + getCapitan().getMatricula() +
                " - precio base: " + getPrecio_base() +
                " - monto alquiler: " + calcularMontoAlquiler() +
                " - año fabricacion: " + getAnoFabricacion() +
                " - logitud en metros: " + getEslora() +
                " - cantidad mastiles: " + cantidad_mastiles +
                " - descripcion: " + evaluarEmbarcacion()
        );
    }
}
