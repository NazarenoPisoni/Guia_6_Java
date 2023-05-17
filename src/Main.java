import models.Password;
import models.Persona;
import models.Serie;
import models.Videojuego;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el Nombre: ");
//        String nombre = sc.nextLine();
//        System.out.println("Ingrese la Edad: ");
//        int edad = sc.nextInt();
//        System.out.println("Ingrese el Sexo (H o M): ");
//        char sexo = (char) sc.next().charAt(0);
//        System.out.println("Ingrese el Peso: ");
//        int peso = sc.nextInt();
//        System.out.println("Ingrese la Altura: ");
//        double altura = sc.nextDouble();
//
//        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
//        Persona persona2 = new Persona(nombre, edad, sexo);
//        Persona persona3 = new Persona();
//        persona3.setNombre("Nazareno");
//        persona3.setEdad(31);
//        persona3.setSexo('H');
//        persona3.setPeso(65);
//        persona3.setAltura(1.78);
//
//        Map<String, Persona> personas = new HashMap<>();
//        personas.put(persona1.getDni(), persona1);
//        personas.put(persona2.getDni(), persona2);
//        personas.put(persona3.getDni(), persona3);
//
//        for (Map.Entry<String, Persona> entry : personas.entrySet()){
//            if(entry.getValue().calcularIMC() == 1){
//                System.out.println(entry.getValue().getNombre() + " tiene sobrepeso.");
//            } else if (entry.getValue().calcularIMC() == 0) {
//                System.out.println(entry.getValue().getNombre() + " está en su peso ideal.");
//            } else if (entry.getValue().calcularIMC() == -1) {
//                System.out.println(entry.getValue().getNombre() + " está por debajo de su peso ideal.");
//            }
//        }

//        Password passwords[] = new Password[20];
//        boolean[] fuertes = new boolean[20];
//        int longitud = 15;
//        for(int i=0; i< passwords.length; i++){
//            passwords[i] = new Password(longitud);
//            fuertes[i] = passwords[i].esFuerte(passwords[i].getContrasenia());
//            passwords[i].mostrarPassword();
//        }

        Videojuego[] juegos = new Videojuego[5];
        Serie[] series = new Serie[5];
        juegos[0] = new Videojuego("God of War", 30, "Accion", "Sony");
        juegos[1] = new Videojuego("Bioshock", 25, "Shooter", "Sony");
        juegos[2] = new Videojuego("FIFA 23", 99);
        juegos[3] = new Videojuego("Resident Evil 4", 40);
        juegos[4] = new Videojuego("Call of Duty Modern Warfare", 35);
        series[0] = new Serie("Breaking Bad", "Vince Gilligan");
        series[1] = new Serie("Better Call Saul", "Vince Gilligan");
        series[2] = new Serie("Ozark", 3, "Accion", "Juan Perez");
        series[3] = new Serie("Fargo", 3, "Accion", "Fulano");
        series[4] = new Serie("Dark", 3, "Accion/Suspenso", "Baran Bo Odar");

    }
}