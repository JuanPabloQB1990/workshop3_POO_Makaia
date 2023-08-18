public class Parqueadero {
    private Carro[][] carros;
    private double tarifaPorHora;

    public Parqueadero(double tarifaPorHora) {
        this.carros = new Carro[3][3];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna){
        if(fila < 4 && columna < 4){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i == fila-1 && j == columna-1){
                        if(carros[fila-1][columna-1] == null){
                            carros[fila-1][columna-1] = carro;
                            return true;
                        }else{
                            return false;
                        }

                    }
                }
            }
        }

        return false;

    }

public double cobrarPorTiempo(Carro carro, int horas){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(carros[i][j] == carro){
                return horas * tarifaPorHora;
            }
        }
    }

    return 0;
}

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(carros[i][j] == null){
                    System.out.print("   X      ");
                }else{
                    System.out.print(carros[i][j].getPlaca() + "    ");
                }

            }
            System.out.println("");
        }
    }
}
