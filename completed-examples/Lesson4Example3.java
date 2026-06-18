class Personaje {
    String nombre;
    int energia;

    public void reportarse() {
        System.out.println("Soy " + nombre + " y mi energía está al " + energia + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje();
        heroe.nombre = "Juanito";
        heroe.energia = 100;
        
        Personaje aliado = new Personaje();
        aliado.nombre = "Pepito"; 
        aliado.energia = 80;

        heroe.reportarse();
        aliado.reportarse();
    }
}