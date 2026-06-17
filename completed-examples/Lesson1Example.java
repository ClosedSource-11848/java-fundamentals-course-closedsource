
/*
Bienvenidos a JDoodle

Aquí puedes ejecutar programas en Java.
Presiona "Execute ▶" para ver cómo funciona el código.
*/

public class Main {

    /*
    El método main es donde inicia el programa.
    */
    public static void main(String[] args) throws InterruptedException {

        /*
        println muestra un mensaje en pantalla.
        */
        System.out.println("Sistema iniciado...");

        /*
        sleep pausa el programa.
        1000 ms = 1 segundo.
        */
        Thread.sleep(5000);

        System.out.println("Hola, usuario.");
        Thread.sleep(1000);

        System.out.println("¿Quieres aprender programación?");
        Thread.sleep(1500);

        System.out.println("Va a ser un camino muy largo.");
        Thread.sleep(1500);

        /*
        Las instrucciones se ejecutan una por una, en orden.
        */
        System.out.println("Recuerda siempre practicar tus habilidades.");
        Thread.sleep(1000);

        System.out.println("Éxitos :)");
        Thread.sleep(3000);

        System.out.println("Fin del programa.");

    }
}
