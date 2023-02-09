package org.hmoldovan.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private Color color;

    public static final String GENERO_MASCULINO="Masculino";
    public static final String GENERO_FEMENINO="Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String lanzarPelota(){
        return "lanza la pelota al perro!";
    }

    public static String saludar(){
        return "Hola que tal?";
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
