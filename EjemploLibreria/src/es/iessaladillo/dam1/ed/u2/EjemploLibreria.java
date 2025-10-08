package es.iessaladillo.dam1.ed.u2;

import org.joda.time.LocalDate;   // Importamos clase de la librería externa

public class EjemploLibreria {
    public static void main(String[] args) {
        LocalDate hoy = new LocalDate();        // Fecha actual
        LocalDate futuro = hoy.plusDays(10);    // Fecha dentro de 10 días

        System.out.println("Hoy es: " + hoy);
        System.out.println("Dentro de 10 días será: " + futuro);
    }
}
