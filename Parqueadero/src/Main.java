// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // creamos parquadero
        Parqueadero parqueadero = new Parqueadero(10000);

        Carro carro1 = new Carro("PID54E", "Renult", "2021");
        Carro carro2 = new Carro("OOUD34", "Chevrolet", "2020");
        Carro carro3 = new Carro("www788", "Toyota", "2021");
        Carro carro4 = new Carro("DFD56E", "VolksWagen", "2021");
        parqueadero.mostrarEstadoParqueadero();

        // ingreso de carros al parqueadero
        boolean ingreso1 = parqueadero.parquearCarro(carro1, 3, 1);
        boolean ingreso2 = parqueadero.parquearCarro(carro2, 2, 2);
        boolean ingreso3 = parqueadero.parquearCarro(carro3, 1, 1);
        boolean ingreso4 = parqueadero.parquearCarro(carro4, 2, 1);

        mostrarMensajeIngreso(ingreso1);
        mostrarMensajeIngreso(ingreso2);
        mostrarMensajeIngreso(ingreso3);
        mostrarMensajeIngreso(ingreso4);

        System.out.println("");
        parqueadero.mostrarEstadoParqueadero();


        double cobro1 = parqueadero.cobrarPorTiempo(carro1, 5);
        mostrarCobro(cobro1);
    }

    public static void mostrarMensajeIngreso(boolean ingreso){

        if(ingreso){
            System.out.println("el carro ingresó al parqueadero exitosamente");
        }else{
            System.out.println("el parqueadero esta totalmente lleno o el puesto esta ocupado");
        }
    }

    public static void mostrarCobro(double cobro){

        if(cobro > 0){
            System.out.println("se debe cobrar " + cobro + " mil pesos");
        }else{
            System.out.println("el auto no se ha ingresado");
        }
    }

}