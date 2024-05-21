
package Parqueadero;

import java.util.Date;

public class Cliente extends Persona{
    public Cliente(String identificacion, String nombre, String telefono, String email, Date fechaNacimiento, String clave) {
        super(identificacion, nombre, telefono, email, fechaNacimiento, clave);
    }
}
