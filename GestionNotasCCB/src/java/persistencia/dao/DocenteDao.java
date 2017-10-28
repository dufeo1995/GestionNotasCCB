/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.persona.Docente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DocenteDao {

    public boolean createDocente(Docente docente);//Crear 

    public List<Docente> getAllDocente(); //Consultar

    public boolean deleteDocente(Docente docente); // Eliminar

    public boolean updateDocente(Docente docente); //Actualizar

}
