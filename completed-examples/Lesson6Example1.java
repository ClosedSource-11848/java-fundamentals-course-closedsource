class Student {
    // Atributos del estudiante
    private String name;
    private int age;
    private String goal;

    // Constructor
    public Student(String name, int age, String goal) {
        this.name = name;
        this.age = age;
        this.goal = goal;
    }

    // Método para presentarse
    public void introduceYourself() {
        System.out.println("Hi! My name is " + name + " and I am " + age + " years old.");
        System.out.println("I am learning Java step by step!");
    }

    // Método para mostrar una meta personal
    public void showGoal() {
        System.out.println("My goal is: " + goal);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Final Practice ===");
        System.out.println();

        // Creamos el primer objeto Student
        Student student1 = new Student("Alex", 15, "create my first app");
        student1.introduceYourself();
        student1.showGoal();

        System.out.println();

        // Creamos un segundo objeto Student
        Student student2 = new Student("Sofia", 16, "build a simple game");
        student2.introduceYourself();
        student2.showGoal();

        System.out.println();
        System.out.println("Great job! Keep practicing Java.");
    }
}