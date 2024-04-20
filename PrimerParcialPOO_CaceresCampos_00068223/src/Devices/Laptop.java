package Devices;
import ElectronicDevice.ElectronicDevice;

public class Laptop extends Devices implements Prices_Description{

    private String IOS;
    private int RAM;
    private float newPrice;

    public Laptop(ElectronicDevice electronicDevice, String IOS, int RAM){
        super(electronicDevice);
        this.IOS = IOS;
        this.RAM = RAM;
    }

    @Override
    public float ObtenerPrecio() {
        return newPrice;
    }

    @Override
    public void ModificarDescripcion() {

    }
}
