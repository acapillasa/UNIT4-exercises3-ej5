package company;

public class Employee extends Person {
    private int money;
    private MobilePhone telefonoMovil;

    Employee(String nombre, String dni, int altura, int anchura,
             int dinero, MobilePhone telefonoMovil) {
        super(nombre, dni, altura, anchura);
        money = dinero;
        this.telefonoMovil = telefonoMovil;
    }

    void earnMoney(int dineroGanado) {
        money = money + dineroGanado;
    }
    void spendMoney(int dineroGastado) {
        money = money - dineroGastado;
    }
    void work() {
        System.out.println("Empleado trabajando...");
        telefonoMovil.use();
        earnMoney(10);
    }

    @Override
    public String toString() {
        return super.toString()+" Employee{" +
                "money=" + money +
                ", battery=" + telefonoMovil.getBattery() +
                '}';
    }
}