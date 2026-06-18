import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Ingresa tu nombre:");
        String nombre = teclado.nextLine();        
        System.out.println("¡A jugar, " + nombre + "!");
    }
}