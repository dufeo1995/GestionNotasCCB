/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.persona;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AcudienteDTO extends Persona{
    //Este dato es de tipo lista a diferencia del dato normal del diagrama de clases porque para un
    // acudiente pueden existir varios estudiantes a cargo.
    private List<EstudianteDTO> estudianteACargo = new ArrayList<>();

    
    
    
    public List<EstudianteDTO> getEstudianteACargo() {
        return estudianteACargo;
    }

    public void setEstudianteACargo(List<EstudianteDTO> estudianteACargo) {
        this.estudianteACargo = estudianteACargo;
    }
    
}
