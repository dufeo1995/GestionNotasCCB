/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class Nota extends NotaDTO {
    
    public void ingresar(NotaDTO nota) {
        this.setValor(nota.getValor());
    }

    public void modificar(NotaDTO nota) {
        this.setValor(nota.getValor());
    }

    public void eliminar(NotaDTO nota) {
        this.setValor(0);
    }
    
}
