class Student {
    // Atributos del estudiante
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para presentarse
    public void introduceYourself() {
        System.out.println("Hi! My name is " + name + " and I am " + age + " years old.");
        System.out.println("I am learning Java step by step!");
    }

    // TODO: Agrega un nuevo atributo llamado goal
    // TODO: Agrega un método llamado showGoal()
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Starter Practice ===");
        System.out.println();

        // Creamos el primer objeto Student
        Student student1 = new Student("Alex", 15);
        student1.introduceYourself();

        System.out.println();

        // TODO: Crea un segundo objeto llamado student2
        // TODO: Llama al método introduceYourself() del segundo estudiante

        System.out.println();
        System.out.println("Keep practicing Java!");
    }
}