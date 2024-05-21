
package Parqueadero;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Principal {

  private static ArrayList<Parqueadero> parqueaderos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Registrar Parqueadero", "Configurar Tarifa", "Configurar Horario", "Configurar Colaboradores", "Gestionar Parqueo Vehículos", "Obtener Reportes", "Obtener Indicadores", "Gestionar Usuarios", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    registrarParqueadero();
                    break;
                case 1:
                    configurarTarifa();
                    break;
                case 2:
                    configurarHorario();
                    break;
                case 3:
                    configurarColaboradores();
                    break;
                case 4:
                    gestionarParqueoVehiculos();
                    break;
                case 5:
                    obtenerReportes();
                    break;
                case 6:
                    obtenerIndicadores();
                    break;
                case 7:
                    gestionarUsuarios();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void registrarParqueadero() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del parqueadero:");
        String claseTipo = JOptionPane.showInputDialog("Ingrese la clase o tipo del parqueadero:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del parqueadero:");
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad del parqueadero:");
        String coordenadas = JOptionPane.showInputDialog("Ingrese las coordenadas GPS del parqueadero:");
        String modoDeControl = JOptionPane.showInputDialog("Ingrese el modo de control (impresión de tickets o manejo de tarjetas con código de barras):");
        String adminIdentificacion = JOptionPane.showInputDialog("Ingrese la identificación del administrador:");
        String adminNombre = JOptionPane.showInputDialog("Ingrese el nombre del administrador:");
        String adminTelefono = JOptionPane.showInputDialog("Ingrese el teléfono del administrador:");
        String adminEmail = JOptionPane.showInputDialog("Ingrese el email del administrador:");
        String adminClave = JOptionPane.showInputDialog("Ingrese la clave del administrador:");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del parqueadero (número de vehículos):"));

        Administrador administrador = new Administrador(adminIdentificacion, adminNombre, adminTelefono, adminEmail, new Date(), adminClave);
        Parqueadero parqueadero = new Parqueadero(nombre, claseTipo, direccion, ciudad, coordenadas, modoDeControl, administrador, capacidad);
        parqueaderos.add(parqueadero);

        JOptionPane.showMessageDialog(null, "Parqueadero registrado con éxito");
    }

    private static void configurarTarifa() {
        // Implementar lógica para configurar tarifas
    }

    private static void configurarHorario() {
        // Implementar lógica para configurar horarios
    }

    private static void configurarColaboradores() {
        // Implementar lógica para configurar colaboradores
    }

    private static void gestionarParqueo (){
        
    }

    private static void gestionarParqueoVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void obtenerReportes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void obtenerIndicadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void gestionarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      }
        
    
    

