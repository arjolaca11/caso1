/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author arjol
 */
//Hacemos los atributos 
public class Agente {
    private String nombre;
    private int cedula;
    private int codigo;
    private String  sucursal;
    private String vehiculo;
    
// definimos los metodos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        JOptionPane.showInputDialog("Ingrese su numero de cedula");
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        JOptionPane.showInputDialog("Ingrese su numero de codigo");
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        JOptionPane.showInputDialog("Ingrese su sucursal de trabajo");
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        JOptionPane.showInputDialog("Posee vehiculo?");
             /*   if (vehiculo ==1){
                    System.out.println("Si");
                    else{  
                            System.out.println("No");
                            }
                   */
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    

      
}
