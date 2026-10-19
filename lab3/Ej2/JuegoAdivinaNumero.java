package Ej2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }


    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        } else {
            System.out.println("Error: El número debe estar entre 0 y 10.");
            return false;
        }
    }

    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(11); 

        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("\n¡COMIENZA EL JUEGO DE ADIVINAR EL NÚMERO!");

        while (!juegoTerminado) {
            System.out.print("\nIntroduce un número entre 0 y 10" + this.numeroDeVidas + "): ");
            int intento = scanner.nextInt();

         
            if (!validaNumero(intento)) {
                continue; 
            }

            if (intento == this.numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                juegoTerminado = true; 
            } else {
                boolean quedanVidas = quitaVida();

                if (quedanVidas) {
                    if (intento < this.numeroAAdivinar) {
                        System.out.println("El número a adivinar es MAYOR");
                    } else {
                        System.out.println("El número a adivinar es MENOR");
                    }
                } else {
                    System.out.println("¡Sin vidas. El número era: " + this.numeroAAdivinar);
                    juegoTerminado = true; 
                }
            }
        }
    }
}