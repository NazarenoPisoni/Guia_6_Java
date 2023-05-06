package models;

import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private char sexo = 'H';
    private int peso = 0;
    private double altura = 0;


    public Persona() {
    }


    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, String dni, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = peso / (altura * altura);
        if (peso < 20){
            return -1;
        } else if (peso >= 20 && peso <= 25) {
            return 0;
        }else return 1;
    }

    public boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;
        }else return false;
    }

    private char comprobarSexo(char sexo){
        if(sexo != 'H'){
            return 'H';
        }else return sexo;
    }

    @Override
    public String toString() {
        return "Persona { " +
                "Nombre = '" + nombre + '\'' +
                ", Edad = " + edad +
                ", DNI = '" + dni + '\'' +
                ", Sexo = " + sexo +
                ", Peso = " + peso + " Kg." +
                ", Altura = " + altura + " m." +
                '}';
    }

    //Investigar como generar una letra aleatoria y lo mismo para numeros para el DNI
    public void generarLetra(){
        Random random = new Random();
        char valorMin = 'F';
        char valorMax = 'M';
        int numeroAleatorio = random.nextInt(valorMax - valorMin + 1);
        char letraAleatoria = (char) numeroAleatorio;
        System.out.print(letraAleatoria);
    }
}
