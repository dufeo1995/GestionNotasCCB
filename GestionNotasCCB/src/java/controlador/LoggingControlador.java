/*
 * Esta clase se encarga de validar los datos recividos desde la capa GUI(login)
 * con los de la base de datos, para esto se utilza la clase persistencia.entidad.LoggingImp
 */
package controlador;

import dominio.persona.Acudiente;
import dominio.persona.Docente;
import dominio.persona.Estudiante;

/**
 *
 * @author Duvan
 */
public class LoggingControlador {
    
    /**
     * Metodo que valida los datos ingresados como argumento con los de la base de datos
     * @param usuario Dato tipo texto con el nombre del usuario en la base de datos
     * @param pass Dato tipo texto con la contraseña de usuario en la base de datos
     * @param tipoPersona Dato tipo entero que representa el tipo de persona:
     * <h1>tipoPersona</h1>
     * <ul>
     * <li><strong>1</strong> Perona tipo Estudienate</li>
     * <li><strong>2</strong> Perona tipo Docente</li>
     * <li><strong>3</strong> Perona tipo Acudiente</li>
     * <li><strong>Cualquier otro numero</strong> Si recibe un dato fuera del rango 1-3, retornará false</li>
     * </ul>
     * @return <strong>True</strong> si los datos coinciden con los devueltos desde la base de datos, 
     * <strong>False</strong> en caso contrario
     * 
     */
    public boolean validarDatos(String usuario, String pass, int tipoPersona){
        
        if(tipoPersona < 1 || tipoPersona > 3){
            return false;
        }else{
            if (tipoPersona == 1) {
                for (Estudiante est : new persistencia.entidad.LoggingImp().getAllEstudiante()) {
                    if((est.getCorreo().equals(usuario)) && (est.getPass().equals(pass))){
                        return true;
                    }
                }
            }
            if (tipoPersona == 2) {
                for (Docente doc : new persistencia.entidad.LoggingImp().getAllDocente()) {
                    if((doc.getCorreo().equals(usuario)) && (doc.getPass().equals(pass))){
                        return true;
                    }
                }
            }
            if (tipoPersona == 3) {
                for (Acudiente acu : new persistencia.entidad.LoggingImp().getAllAcudiente()) {
                    if((acu.getCorreo().equals(usuario)) && (acu.getPass().equals(pass))){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
