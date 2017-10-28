/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.Materia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface MateriaDao {

    public boolean createMateria(Materia materia);//Crear 

    public List<Materia> getAllMateria(); //Consultar

    public boolean deleteMateria(Materia materia); // Eliminar

    public boolean updateMateria(Materia materia); //Actualizar
}
