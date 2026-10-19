package Ej3;

public class SensorLuzLaser extends Sensor {
    protected String tipo = "Luz Laser";
    protected int alcance;

    public SensorLuzLaser(String id, int alcance) {
        super(id);
        this.alcance = alcance;
    }
}