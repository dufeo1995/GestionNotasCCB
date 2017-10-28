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
public class PeriodoAcademicoDTO {

    private String fechaInicio;
    private String fechaTermina;
    private List<Curso> cursos = new ArrayList<>();

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFehcaTermina() {
        return fechaTermina;
    }

    public void setFehcaTermina(String fehcaTermina) {
        this.fechaTermina = fehcaTermina;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
