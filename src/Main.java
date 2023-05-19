import models.Password;
import models.Persona;
import models.Serie;
import models.Videojuego;
import java.util.Scanner;

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
        char sexo = (char) sc.next().charAt(0);
        System.out.println("Ingrese el Peso: ");
        int peso = sc.nextInt();
        System.out.println("Ingrese la Altura: ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Nazareno");
        persona3.setEdad(31);
        persona3.setSexo('H');
        persona3.setPeso(65);
        persona3.setAltura(1.78);

        Map<String, Persona> personas = new HashMap<>();
        personas.put(persona1.getDni(), persona1);
        personas.put(persona2.getDni(), persona2);
        personas.put(persona3.getDni(), persona3);

        for (Map.Entry<String, Persona> entry : personas.entrySet()){
            if(entry.getValue().calcularIMC() == 1){
                System.out.println(entry.getValue().getNombre() + " tiene sobrepeso.");
            } else if (entry.getValue().calcularIMC() == 0) {
                System.out.println(entry.getValue().getNombre() + " está en su peso ideal.");
            } else if (entry.getValue().calcularIMC() == -1) {
                System.out.println(entry.getValue().getNombre() + " está por debajo de su peso ideal.");
            }
        }

        Password passwords[] = new Password[20];
        boolean[] fuertes = new boolean[20];
        int longitud = 30;
        for(int i=0; i<passwords.length; i++){
            passwords[i] = new Password(longitud);
            fuertes[i] = passwords[i].esFuerte(passwords[i].getContrasenia());
            passwords[i].mostrarPassword();
            if(fuertes[i] == true){
                System.out.println("La contraseña es fuerte");
            }else System.out.println("La contraseña es débil");
        }

        Videojuego[] juegos = new Videojuego[5];
        Serie[] series = new Serie[5];
        juegos[0] = new Videojuego("God Of War", 30, "Accion", "Sony");
        juegos[1] = new Videojuego("Bioshock", 25, "Shooter", "2K");
        juegos[2] = new Videojuego("FIFA 23", 99, "Deportes", "EA Sports");
        juegos[3] = new Videojuego("Resident Evil 4", 40);
        juegos[4] = new Videojuego("Call of Duty Modern Warfare", 35);
        series[0] = new Serie("Breaking Bad", "Vince Gilligan");
        series[1] = new Serie("Better Call Saul", "Vince Gilligan");
        series[2] = new Serie("Ozark", 4, "Accion", "Bill Dubuque");
        series[3] = new Serie("Breaking Bad", 5, "Accion", "Vince Gilligan");
        series[4] = new Serie("Dark", 3, "Accion/Suspenso", "Baran Bo Odar");
        if(juegos[0].equals(juegos[2])){
            System.out.println("ERROR, existen dos juegos con el mismo nombre");
        }
        if(series[0].equals(series[3])){
            System.out.println("ERROR, existen dos series con el mismo nombre");
        }
        juegos[0].entregar();
        juegos[1].entregar();
        juegos[4].entregar();
        series[0].entregar();
        series[2].entregar();
        int cantidadJuegosEntregados = 0;
        int cantidadSeriesEntregadas = 0;
        Videojuego conMasHoras = new Videojuego();
        Serie conMasTemporadas = new Serie();
        for(Videojuego v : juegos){
            if(v.isEntregado()){
                cantidadJuegosEntregados++;
            }
            if(v.compareTo(conMasHoras) > 0){
                conMasHoras = v;
            }
        }
        for(Serie s : series){
            if(s.isEntregado()){
                cantidadSeriesEntregadas++;
            }
            if(s.compareTo(conMasTemporadas) > 0){
                conMasTemporadas = s;
            }
        }
        System.out.println("La cantidad de Juegos entregados es: " + cantidadJuegosEntregados);
        System.out.println("La cantidad de Series entregadas es: " + cantidadSeriesEntregadas);
        System.out.println("El Juego con más horas estimadas es: " + conMasHoras.toString());
        System.out.println("La Serie con más temporadas es: " + conMasTemporadas.toString());

    }
}