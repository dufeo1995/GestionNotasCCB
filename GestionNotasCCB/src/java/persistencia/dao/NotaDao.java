/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.Nota;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface NotaDao {

    public boolean createNota(Nota nota);//Crear 

    public List<Nota> getAllNota(); //Consultar

    public boolean deleteNota(Nota nota); // Eliminar

    public boolean updateNota(Nota nota); //Actualizar

}
