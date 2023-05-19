package models;

import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = generarDNI();
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    private char sexo = HOMBRE;
    private int peso = 0; //En Kg.
    private double altura = 0; //En Mts.


    public Persona() {
    }


    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
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
        if(sexo != HOMBRE && sexo != MUJER){
            return HOMBRE;
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

    private String generarDNI(){
        int numero = (int) (Math.random()*45000000 + 4000000);
        String dni = sexo + Integer.toString(numero);
        return dni;
    }

}
