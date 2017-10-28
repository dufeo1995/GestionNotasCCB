/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Materia;
import dominio.Nota;
import dominio.NotaDTO;
import java.util.List;

/**
 *
 * @author Duvan
 */
public class NotaControlador {

    /**
     * Metodo en edicion
     *
     * @param materia
     * @return
     */
    public List<Nota> listarNotas(Materia materia) {
        return null;
    }

    /**
     * Metodo en edicion...
     *
     * @param materia
     * @param nota objeto tipo NotaDTO
     */
    public void ingresar(Materia materia, NotaDTO nota) {
        materia.agregarNota(nota);
    }

    /**
     * Metodo en edicion
     * @param nota Objeto tipo NotaDTO
     */
    public void eliminar(NotaDTO nota) {
        nota.setValor(0);
    }
    
    /**
     * Metodo en edicion
     * @param nota Objeto tipo NotaDTO
     * @param nuevaNota dato tipo double a establecere en el objeto del primer parametro
     */
    public void modificar (NotaDTO nota, double nuevaNota){
        nota.setValor(nuevaNota);
    }
}
