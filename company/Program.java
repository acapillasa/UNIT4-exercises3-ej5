package company;

public class Program {
    public static void main(String[] args) {
        MobilePhone Iphone13 = new MobilePhone("688123456",44);
        Employee emp1 = new Employee("Álvaro","73037813W",170,80,1500,Iphone13);

        System.out.println(emp1.toString());
        emp1.work();
        emp1.work();
        System.out.println(emp1.toString());
    }
}