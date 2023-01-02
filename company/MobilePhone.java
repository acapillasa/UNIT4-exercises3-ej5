package company;

public class MobilePhone {
    private String number;
    private int battery;

    MobilePhone(String numeroTelefono, int bateria) {
        number = numeroTelefono;
        battery = bateria;
    }

    public int getBattery() {
        return battery;
    }

    void use() {
        battery--;
    }
}