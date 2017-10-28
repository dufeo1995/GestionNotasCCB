/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duvan Otero
 */
public class CursoDTO {

    private String codigo;
    private int grado;
    private dominio.persona.Docente docente;
    private List<dominio.persona.Estudiante> estudiante = new ArrayList<>();
    private List<Materia> materias  = new ArrayList<>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public dominio.persona.Docente getDocente() {
        return docente;
    }

    public void setDocente(dominio.persona.Docente docente) {
        this.docente = docente;
    }

    public List<dominio.persona.Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<dominio.persona.Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

}
