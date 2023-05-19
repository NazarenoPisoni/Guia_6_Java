package models;
import java.security.SecureRandom;

public class Password {
    private int longitud = 8;
    private String contrasenia;


    public Password() {
        this.contrasenia = generarPassword(longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenia = generarPassword(longitud);
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public static String generarPassword(int longitud){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<longitud; i++){
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();
    }

    public boolean esFuerte(String contrasenia){
        int cantMayus = 0;
        int cantMinus = 0;
        int cantNros = 0;

        for(int i=0; i<contrasenia.length(); i++){
            if(contrasenia.charAt(i) >= 'A'&& contrasenia.charAt(i) <= 'Z'){
                cantMayus++;
            }
            else if (contrasenia.charAt(i) <= 'z'&& contrasenia.charAt(i) >= 'a'){
                cantMinus++;
            }
            else if (contrasenia.charAt(i) >= '0'&& contrasenia.charAt(i) <= '9'){
                cantNros++;
            }
        }
        if(cantMayus > 2 && cantMinus > 1 && cantNros > 5){
            return true;
        }else return false;
    }

    public void mostrarPassword(){
        System.out.println("La contraseña es " + getContrasenia());
    }

}
