package org.hmoldovan.app.jardin;

import org.hmoldovan.app.hogar.*;

import static org.hmoldovan.app.hogar.Persona.GENERO_MASCULINO;
import static org.hmoldovan.app.hogar.Persona.saludar;

public class EjemploPaquetes {
    public static void main(String[] args) {

       // org.hmoldovan.app.hogar.Persona p = new org.hmoldovan.app.hogar.Persona(); sin import

        Persona p= new Persona(); //con import
        p.setNombre("Horatiu");
        p.setApellido("Moldovan");
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        p.setColor(Color.CAFE);

        Perro perro =new Perro();
        perro.nombre="Tobby";
        perro.raza="Bulldog";

        String jugando= perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        //con import estático se evita tener que estar indicando el nombre de la clase.
        // sin "import estático" seria de la forma "String saludo=Persona.saludar();"
        System.out.println("saludo = " + saludo);
        String generoMujer=Persona.GENERO_FEMENINO;
        String generoHombre=GENERO_MASCULINO;

    }
}
