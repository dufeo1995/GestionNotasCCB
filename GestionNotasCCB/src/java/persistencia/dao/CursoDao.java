/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.Curso;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CursoDao {

    public boolean createCurso(Curso curso);//Crear 

    public List<Curso> getAllCurso(); //Consultar

    public boolean deleteCurso(Curso curso); // Eliminar

    public boolean updateCurso(Curso curso); //Actualizar

}
