package Ej3;

public class VehiculoAutonomo extends Camara {
    protected String tipo = "Vehículo Autónomo";
    private SensorLuzLaser sensorLaser;

    public VehiculoAutonomo(String id, String resolucion, int alcance) {
        super(id, resolucion);
        this.sensorLaser = new SensorLuzLaser(id + "_laser", alcance);
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Alcance: " + sensorLaser.alcance);
    }
}