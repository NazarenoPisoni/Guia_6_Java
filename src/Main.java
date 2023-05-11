import models.Persona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la Edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el Sexo (H o M): ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese el Peso: ");
        int peso = sc.nextInt();
        System.out.println("Ingrese la Altura: ");
        double altura = sc.nextInt();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Nazareno");
        persona3.setEdad(31);
        persona3.setSexo('H');
        persona3.setPeso(75);
        persona3.setAltura(1.78);

        Map<String, Persona> personas = new HashMap<>();

    }
}