import java.time.LocalDate;

public class Yate extends Embarcacion {
    private int cantidad_camarotes;
    private String descripcion_yate;

    public Yate(Capitan capitan, double precio_base, int anoFabricacion, double long_metros, int cantidad_camarotes) {
        super(capitan, precio_base, anoFabricacion, long_metros);
        this.cantidad_camarotes = cantidad_camarotes;
        this.descripcion_yate = evaluarYate();
    }

    public String evaluarYate(){
        if(cantidad_camarotes > 7 ){
            return"posible comprar";
        }else{
            return "no se recomienda";
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
                " - cantidad mastiles: " + cantidad_camarotes +
                " - descripcion: " + evaluarYate()
        );
    }
}
