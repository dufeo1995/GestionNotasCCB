/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.persona.Acudiente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface AcudienteDao {
    public boolean createAcudiente(Acudiente acudiente);//Crear 

    public List<Acudiente> getAllAcudiente(); //Consultar

    public boolean deleteAcudiente(Acudiente acudiente); // Eliminar

    public boolean updateAcudiente(Acudiente acudiente); //Actualizar
}
