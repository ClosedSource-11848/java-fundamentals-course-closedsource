
/*
Bienvenidos a JDoodle

En este entorno puedes ejecutar programas en el lenguaje Java.

Para ejecutar el código, presiona el botón "Execute ▶" y podrás observar cómo funciona.
*/

/*
Definición de la clase principal del programa.
En Java, todo programa debe estar contenido dentro de una clase.
*/
public class Main {
    
    /*
    Método principal (main).
    Es el punto de inicio de la ejecución del programa.
    
    "throws InterruptedException" indica que el programa puede generar
    una interrupción durante la pausa (sleep), y permite que Java la maneje.
    */
    public static void main(String[] args) throws InterruptedException {

        /*
        System.out.println es una instrucción que permite mostrar
        mensajes en la consola (pantalla).
        */
        System.out.println("Sistema iniciado...");
        
        /*
        Thread.sleep detiene temporalmente la ejecución del programa.
        El valor está en milisegundos:
        1000 ms = 1 segundo
        */
        Thread.sleep(5000);
        
        System.out.println("Hola, usuario.");
        Thread.sleep(1000);
        
        System.out.println("¿Quieres aprender programación?");
        Thread.sleep(1500);
        
        /*
        Cada línea que vemos es una instrucción que la computadora ejecuta
        paso a paso, siguiendo el orden en el que se escriben.
        */
        System.out.println("Va a ser un camino muy largo.");
        Thread.sleep(1500);
        
        System.out.println("Recuerda siempre practicar tus habilidades");
        Thread.sleep(1000);
        
        System.out.println("Éxitos :)");
        Thread.sleep(3000);
        
        /*
        Fin del programa. Todas las instrucciones han sido ejecutadas previamente.
        */
        System.out.println("Fin del programa.");

    }
}
