public class Carro {
    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void mostrarCarro(){
        System.out.println("placa: " + placa + " marca: " + marca + " modelo: " + modelo);
    }



}
