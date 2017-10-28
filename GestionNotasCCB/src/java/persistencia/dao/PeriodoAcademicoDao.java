/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import dominio.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface PeriodoAcademicoDao {

    public boolean createPeriodoAcademico(PeriodoAcademico periodoAcademico);//Crear 

    public List<PeriodoAcademico> getAllPeriodoAcademico(); //Consultar

    public boolean deletePeriodoAcademico(PeriodoAcademico periodoAcademico); // Eliminar

    public boolean updatePeriodoAcademico(PeriodoAcademico periodoAcademico); //Actualizar

}
