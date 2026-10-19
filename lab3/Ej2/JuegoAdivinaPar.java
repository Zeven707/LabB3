package Ej2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        
        if (numero < 0 || numero > 10) {
            System.out.println("El número debe estar entre 0 y 10.");
            return false;
        }
        
        if (numero % 2 == 0) {
            return true;
        } else {
            System.out.println("Debes ingresar un número par");
            return false;
        }
    }
}