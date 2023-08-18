import java.time.LocalDate;

public class Velero extends Embarcacion {
    private int cantidad_mastiles;

    public Velero (Capitan capitan, double precio_base, int anoFabricacion, double long_metros, int cantidad_mastiles) {
        super(capitan, precio_base, anoFabricacion, long_metros);
        this.cantidad_mastiles = cantidad_mastiles;
    }

    public String evaluarVelero(){
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
                " - logitud en metros: " + getLong_metros() +
                " - cantidad mastiles: " + cantidad_mastiles +
                " - descripcion: " + evaluarVelero()
        );
    }
}
