/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.persona;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String correo;
    private String pass;//Contraseña para ingresar a la aplicacion 
    private String tipoPersona;
    private int telefono;
    private int ID;

    public void crear(String nombre, String apellido, String correo,
            String pass, String tipoPersona, int telefono, int ID) {

    }

    public void modificar(int ID) {

    }

    public void eliminar(int ID) {

    }
    
    
    /**
     * Metodo que retorna el correo de la persona
     * @return  dato del correo
     */
    public String getCorreo(){
        return this.correo;
    }
    /**
     * Metodo que retorna la contraseña de esta persona
     * @return dato que contiene la contraseña de esta persona
     */
    public String getPass(){
        return this.pass;
    }
}
