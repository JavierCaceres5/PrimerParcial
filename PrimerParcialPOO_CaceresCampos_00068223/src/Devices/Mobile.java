package Devices;
import ElectronicDevice.ElectronicDevice;

public class Mobile extends Devices implements Prices_Description{
    private String brand;
    private String size;
    private float newPrice;
    public Mobile(ElectronicDevice electronicDevice, String brand, String size) {
        super(electronicDevice);
        this.brand = brand;
        this.size = size;
        this.newPrice = newPrice;
    }

    public float ObtenerPrecio(){
        return newPrice;
    }
    public void ModificarDescripcion(){}
}
