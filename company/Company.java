package company;

public class Company {
    private String name;
    private int profit;
    private Employee owner;
    private Employee manager;

    Company(String nombre, int beneficios, Employee dueño) {
        name = nombre;
        profit = beneficios;
        owner = dueño;
    }
    void hireManager(Employee proximoManager) {
        manager = proximoManager;
    }
    void work() {
        System.out.println("Compañia trabajando...");
        owner.work();
        manager.work();
        profit = profit + 100;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name=" + name +
                ", profit=" + profit +
                ", owner=" + owner + owner.toString() +
                ", manager=" + manager + manager.toString() +
                '}';
    }
}
