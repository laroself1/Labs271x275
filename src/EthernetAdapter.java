public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
   public int getSpeed() {   return speed; }
    public String getMac() { return mac; }
    public void setMac(String mac) { this.mac = mac;}
    public void setSpeed(int speed) { this.speed = speed;}

    @Override
    public String toString() {
        return "EthernetAdapter:" +
                "manufacturer=" + getManufacturer() +
                ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() +
                ", speed=" + speed +
                ", mac=" + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) {return false; }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;}

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + (getMac() != null ? getMac().hashCode() : 0);
        return result;
    }
}
