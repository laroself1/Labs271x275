public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;



    public String getManufacturer() {return manufacturer;  }
    public float getPrice() {return price;}
    public String getSerialNumber() { return serialNumber;}

    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(float price) {this.price = price;    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacturer=" + this.manufacturer +
                ", price=" + this.price +" $"+
                ", serialNumber=" + this.serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o==null){return  false;};
        if ((o == null) || (this.getClass() != o.getClass())) {return false;}
        if (this.getManufacturer()!= ((Device) o).getManufacturer())return false;
        if (this.getPrice()!=((Device) o).getPrice())return false;
        return (this.getSerialNumber()==((Device) o).getSerialNumber()); }

    @Override
    public int hashCode() {
        int result = getManufacturer() != null ? getManufacturer().hashCode() : 0;
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + (getSerialNumber() != null ? getSerialNumber().hashCode() : 0);
        return result;
    }}
