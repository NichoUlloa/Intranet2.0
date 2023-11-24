package modelo;

public class Estudiante extends Persona {
    private int numeroMatricula;

    public Estudiante(String nombre, String apellido, String rut, int numeroMatricula) {
        super(nombre, apellido, rut);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String getTipoPersona() {
        return "Estudiante";
    }
}