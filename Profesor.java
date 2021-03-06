package ficheros.Ejercicio4;

import java.util.List;

public class Profesor extends Persona{
    List<Prestamo> prestamos;

    public Profesor(String str, int edad, String numeroDeTelefono, List<Prestamo> prestamos) {
        super(str, edad, numeroDeTelefono);
        this.prestamos = prestamos;
    }

    public void printInformacionPersonal(){
        print();
    }


    public void printTodaLaInformacion(){
        print();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

    private void print() {
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

}

