package Devices;

import ElectronicDevice.ElectronicDevice;

public abstract class Devices extends ElectronicDevice{
    public Devices(ElectronicDevice electronicdevice) {
        super(electronicdevice);
    }

    public float ObtenerPrecio(float price){
        return price;
    }
    public void MostrarDescripcion(){}
}
