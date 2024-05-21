
package Parqueadero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class Parqueadero {
    private String nombre;
    private String claseTipo;
    private String direccion;
    private String ciudad;
    private String coordenadas;
    private String modoDeControl;
    private Administrador administrador;
    private int capacidad;
    private ArrayList<Horario> horarios;
    private ArrayList<Tarifa> tarifas;
    private ArrayList<Colaborador> colaboradores;
    private ArrayList<Parqueo> parqueos;

    public Parqueadero(String nombre, String claseTipo, String direccion, String ciudad, String coordenadas, String modoDeControl, Administrador administrador, int capacidad) {
        this.nombre = nombre;
        this.claseTipo = claseTipo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.coordenadas = coordenadas;
        this.modoDeControl = modoDeControl;
        this.administrador = administrador;
        this.capacidad = capacidad;
        this.horarios = new ArrayList<>();
        this.tarifas = new ArrayList<>();
        this.colaboradores = new ArrayList<>();
        this.parqueos = new ArrayList<>();
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void agregarTarifa(Tarifa tarifa) {
        tarifas.add(tarifa);
    }

    public void agregarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public void registrarParqueo(Parqueo parqueo) {
        parqueos.add(parqueo);
    }

    public ArrayList<Parqueo> getParqueosActivos() {
        ArrayList<Parqueo> activos = new ArrayList<>();
        for (Parqueo p : parqueos) {
            if (p.getFechaHoraSalida() == null) {
                activos.add(p);
            }
        }
        return activos;
    }

    public ArrayList<Parqueo> getParqueosCompletados() {
        ArrayList<Parqueo> completados = new ArrayList<>();
        for (Parqueo p : parqueos) {
            if (p.getFechaHoraSalida() != null) {
                completados.add(p);
            }
        }
        return completados;
    }

    public double calcularTotalIngresos() {
        double total = 0;
        for (Parqueo p : parqueos) {
            if (p.getFechaHoraSalida() != null) {
                total += p.calcularValorTotal();
            }
        }
        return total;
    }

    // Métodos para obtener indicadores
    public HashMap<String, Integer> obtenerHorasPico() {
        HashMap<String, Integer> horasPico = new HashMap<>();
        for (Parqueo p : parqueos) {
            String horaIngreso = p.getFechaHoraIngreso().toString().split(" ")[1].substring(0, 2);
            horasPico.put(horaIngreso, horasPico.getOrDefault(horaIngreso, 0) + 1);
        }
        return horasPico;
    }

    // Otros métodos como getters y setters
}
