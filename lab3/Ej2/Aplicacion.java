package Ej2;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        System.out.println("JUEGO 1: NORMAL ");
        juegoNormal.juega();

        System.out.println("\n JUEGO 2: SOLO PARES ");
        juegoPar.juega();

        System.out.println("\nJUEGO 3: SOLO IMPARES");
        juegoImpar.juega();
    }
}