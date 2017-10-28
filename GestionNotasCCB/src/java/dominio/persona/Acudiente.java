/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.persona;

/**
 *
 * @author Usuario
 */
public class Acudiente extends AcudienteDTO {

    public void asignarEst(EstudianteDTO estudiante) {
        this.getEstudianteACargo().add(estudiante);
    }

    public void quitarEst(EstudianteDTO estudiante) {
        this.getEstudianteACargo().remove(estudiante);
    }
}
