package company;

public class Program2 {
    public static void main(String[] args) {
        MobilePhone Iphone14 = new MobilePhone("638416590",77);
        MobilePhone Samsung_Galaxy_S10 = new MobilePhone("637257363",80);

        Employee emp1 = new Employee("Brandon Beck","123456789B",170,80,10000000,Iphone14);
        Employee emp2 = new Employee("Marc Merrill","987654321M",180,70,10000000,Samsung_Galaxy_S10);

        Company comp1 = new Company("Riot Games",1000000,emp1);

        comp1.hireManager(emp2);

        System.out.println(comp1.toString());

        comp1.work();
        System.out.println();
        comp1.work();

        System.out.println(comp1.toString());
    }
}
