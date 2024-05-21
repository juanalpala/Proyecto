
package Parqueadero;

import java.util.Date;

public class Persona {
 protected String identificacion;
    protected String nombre;
    protected String telefono;
    protected String email;
    protected Date fechaNacimiento;
    protected String clave;

    public Persona(String identificacion, String nombre, String telefono, String email, Date fechaNacimiento, String clave) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.clave = clave;
    }
    
}
