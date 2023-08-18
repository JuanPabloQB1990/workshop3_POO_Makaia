import java.util.ArrayList;

public class Makaia {
    private ArrayList<Embarcacion> embarcaciones;

    public Makaia() {
        this.embarcaciones = new ArrayList<>();
    }

    public void agregarEmbarcacion(Embarcacion embarcacion){
        this.embarcaciones.add(embarcacion);
    }

    public void mostrarEmbarcaciones(){
        if (!this.embarcaciones.isEmpty()) {
            for (Embarcacion embarcacion: embarcaciones) {
                System.out.println(embarcacion.mostrarInfo());
            }
        }else{
            System.out.println("no hay embarcaciones disponibles");
        }

    }

}
