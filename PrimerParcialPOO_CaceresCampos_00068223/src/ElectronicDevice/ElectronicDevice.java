package ElectronicDevice;

public  class ElectronicDevice {
    private String name;
    private String model;
    private String description;
    private float price;

    public ElectronicDevice() {}

    public ElectronicDevice(String name, String model, String description, float price) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.price = price;
    }
    public ElectronicDevice(ElectronicDevice electronicdevice) {
        name = electronicdevice.name;
        model = electronicdevice.model;
        description = electronicdevice.description;
        price = electronicdevice.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



}
