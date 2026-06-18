class Personaje {
    // [ALUMNO]: 1. Declara aquí un atributo de tipo texto (String) llamado 'nombre':
    
    // [ALUMNO]: 2. Declara aquí un atributo de tipo entero (int) llamado 'energia':
    

    public void reportarse() {
        System.out.println("Soy " + nombre + " y mi energia esta al " + energia + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        // [ALUMNO]: 3. Crea un nuevo objeto de la clase Personaje llamado 'heroe'
        // Pista: Personaje heroe = new Personaje();
        
        
        // [ALUMNO]: 4. Asígnale a heroe.nombre el valor "juanito" (recuerda usar comillas dobles)
        
        
        // [ALUMNO]: 5. Asígnale a heroe.energia el valor 100 (recuerda que los números van SIN comillas)
        
        
        // Personaje 2 (Aliado) ya construido como ejemplo:
        Personaje aliado = new Personaje();
        aliado.nombre = "Pepito";
        aliado.energia = 80;

        // [ALUMNO]: 6. Haz que el héroe hable llamando a su método: heroe.reportarse();
        
        
        // El aliado también se reporta:
        aliado.reportarse();
    }
}