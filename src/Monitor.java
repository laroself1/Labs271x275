public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public String getManufacturer() {return  super.getManufacturer();  }
    public float getPrice() {return super.getPrice();}
    public String getSerialNumber() { return super.getSerialNumber();}
    public int getResolutionX() { return resolutionX;  }
    public int getResolutionY() {  return resolutionY; }

    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX;}
    public void setResolutionY(int resolutionY) {this.resolutionY = resolutionY;  }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
}
    @Override
    public String toString() {
        return
                "Device:" +
                        "manufacturer=" + getManufacturer() +
                        ", price=" + getPrice() +
                        ", serialNumber=" + getSerialNumber()+
                        ", X=" + resolutionX +
                        ", Y=" + resolutionY ;
    }

    @Override
    public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            Monitor monitor = (Monitor) o;

            if (resolutionX != monitor.resolutionX) return false;
            return resolutionY == monitor.resolutionY; }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getResolutionX();
        result = 31 * result + getResolutionY();
        return result;
    }
}

  /*  public Monitor(String serialnumber, String manufacturer, float price, int resolutionX, int resolutionY) {
        super(serialnumber, manufacturer, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }*/