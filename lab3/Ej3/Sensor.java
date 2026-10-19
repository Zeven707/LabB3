package Ej3;

public class Sensor {
    protected String tipo = "Genérico";
    protected String id;
    protected boolean encendido;

    public Sensor(String id) {
        this.id = id;
        this.encendido = false;
    }

    public void activar() {
        this.encendido = true;
        System.out.println("Sensor activado");
    }

    public void desactivar() {
        this.encendido = false;
        System.out.println("Sensor desactivado");
    }
}