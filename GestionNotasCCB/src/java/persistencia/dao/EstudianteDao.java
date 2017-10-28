/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;


import dominio.persona.Estudiante;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface EstudianteDao {
    
     public boolean createEstudiante(Estudiante estudiante);//Crear 

    public List<Estudiante> getAllEstudiante(); //Consultar

    public boolean deleteEstudiante(Estudiante estudiante); // Eliminar

    public boolean updateEstudiante(Estudiante estudiante); //Actualizar
    
}
