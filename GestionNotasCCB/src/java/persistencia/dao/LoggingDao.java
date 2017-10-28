/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.persona.Estudiante;
import dominio.persona.Acudiente;
import dominio.persona.Docente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface LoggingDao {
    
    public List<Estudiante> getAllEstudiante();
    public List<Acudiente> getAllAcudiente();
    public List<Docente> getAllDocente();
}
