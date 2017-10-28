/*
 * MATRIX CRUD:
 * ------------------------
 * ----------------Consultar
 */
package persistencia.entidad;

import dominio.persona.Acudiente;
import dominio.persona.Docente;
import dominio.persona.Estudiante;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LoggingImp implements persistencia.dao.LoggingDao{

    @Override
    public List<Estudiante> getAllEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Acudiente> getAllAcudiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Docente> getAllDocente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
