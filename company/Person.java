package company;

public class Person {
    private String name;
    private String dni;
    private int height; // ALTURA
    private int weight; // ANCHURA

    Person(String nombre, String dni, int altura, int anchura) {
        name = nombre;
        this.dni = dni;
        height = altura;
        weight = anchura;
    }
    Person(String dni) {
        name = "rodolfo";
        this.dni = dni;
        height = 160;
        weight = 70;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", weight=" + weight +
                '}';
    }
}
