/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;



/**
 *
 * @author Usuario
 */
public class Materia extends MateriaDTO {

    public void asignarGrado(int grado) {
        this.grado = grado;

    }

    public void crear(MateriaDTO materia) {

    }

    public void agregarNota(NotaDTO nota) {
        this.getNotas().add((Nota) nota);
    }

}
