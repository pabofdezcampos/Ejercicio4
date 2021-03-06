package ficheros.Ejercicio4;

public class Persona {
    String str;
    int edad;
    protected String numeroDeTelefono;

    public Persona( String str, int edad, String numeroDeTelefono){
        this.str = str;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}