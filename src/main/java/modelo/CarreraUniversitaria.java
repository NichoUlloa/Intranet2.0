package modelo;

import java.util.ArrayList;
import java.util.List;

public class CarreraUniversitaria {
    private String nombreCarrera;
    private String codigoCarrera;
    private int cantidadSemestres;
    private ArrayList<Estudiante> listaEstudiantes;

    public CarreraUniversitaria(String nombreCarrera, String codigoCarrera, int cantidadSemestres) {
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
        this.cantidadSemestres = cantidadSemestres;
        this.listaEstudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (this.listaEstudiantes.contains(estudiante)) {
            return false;
        } else {
            this.listaEstudiantes.add(estudiante);
            return true;
        }
    }

    public boolean eliminarEstudiante(Estudiante estudiante) {
        if (this.listaEstudiantes.contains(estudiante)) {
            this.listaEstudiantes.remove(estudiante);
            return true;
        } else {
            return false;
        }
    }


}
