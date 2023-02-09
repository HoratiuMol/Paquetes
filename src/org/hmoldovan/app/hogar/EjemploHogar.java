package org.hmoldovan.app.hogar;

import org.hmoldovan.app.jardin.Perro;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p=new Persona();
        Perro perro=new Perro();
        //no se puede invocar perro.jugar ya que al ser default no puede ser usado fuera de su zona, ergo el jardin

        String saludo=Persona.saludar();

    }
}
