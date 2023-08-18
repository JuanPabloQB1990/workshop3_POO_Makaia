import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // se crea la empresa makaia
        Makaia empresaMakaia = new Makaia();

        // se crean los capitanes
        Capitan juan = new Capitan("Juan", "Quintero", "M0123");
        Capitan pedro = new Capitan("Pedro", "Mileto", "M0456");

        // se crean los veleros y yates
        Velero velero = new Velero(juan,50000, 2021, 100.5,5);
        Yate yate = new Yate(pedro, 30000, 2019, 50.5, 2);

        // se agregan embarcaciones a la empresa makaia
        empresaMakaia.agregarEmbarcacion(velero);
        empresaMakaia.agregarEmbarcacion(yate);

        empresaMakaia.mostrarEmbarcaciones();

    }


}