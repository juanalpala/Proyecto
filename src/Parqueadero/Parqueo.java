
package Parqueadero;

import java.util.Date;
import javax.swing.JOptionPane;

public class Parqueo {
 private String placa;
    private Date fechaHoraIngreso;
    private Date fechaHoraSalida;
    private String codigoDeBarras;

    public Parqueo(String placa, Date fechaHoraIngreso, String codigoDeBarras) {
        this.placa = placa;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.codigoDeBarras = codigoDeBarras;
    }

    public void registrarSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public double calcularTiempo() {
        if (fechaHoraSalida == null) {
            return 0;
        }
        return (fechaHoraSalida.getTime() - fechaHoraIngreso.getTime()) / (1000 * 60 * 60.0);
    }

    public double calcularValorTotal() {
        if (fechaHoraSalida == null) {
            return 0;
        }
        double tiempo = calcularTiempo();
        return tiempo; // Ajustar con la tarifa real
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }
}
    // Otros métodos como getters y setters
