/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Curso;
import dominio.PeriodoAcademico;
import dominio.persona.Docente;
import dominio.persona.Estudiante;
import java.util.List;

/**
 *
 * @author Duvan
 */
public class CursoControlador {

    /**
     * Medoto en edicion...
     *
     * @param periodoAcademico
     * @return null por ahora...
     */
    public List<Curso> listarCursos(PeriodoAcademico periodoAcademico) {
        return null;
    }

    /**
     * Meodo en edicion...
     *
     * @param periodoAcademico
     * @param codigo
     * @param grado
     * @param estudiante
     * @param docente
     */
    public void crearCurso(PeriodoAcademico periodoAcademico, String codigo,
            int grado, List<Estudiante> estudiante, String docente) {

    }

    /**
     * Metodo en edicion...
     * @param curso
     * @param estudiante 
     */
    public void ingresarEstudiante(Curso curso, Estudiante estudiante) {

    }
    /**
     * Metodo en edicion...
     * @param curso
     * @param estudiante 
     */
    public void eliminarEstudiante(Curso curso, Estudiante estudiante) {

    }
    
    /**
     * Metodo en edicion..
     * @param curso
     * @param docente 
     */
    public void asignarDocente(Curso curso, Docente docente){
        
    }
   
}
