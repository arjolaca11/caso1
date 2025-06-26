/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author arjol
 */
//definimos los atributos
public class Factura {
    private int mes; 
    private int electronicos;
    private int automotrices;
    private int construccion;
    private int montoFactura;
// definimos los metodos y los modificamos a necesidad 
    public int getMes() {
        //hacemos un if para que definir los numeros como meses
        if (mes == 1){
            System.out.println("Enero");
        } else if (mes == 2 ){
            System.out.println("Febrero");
        }else if (mes == 3 ){
            System.out.println("Marzo ");
             }else if (mes == 4 ){
            System.out.println("Abril");
        }else if (mes == 5 ){
            System.out.println("Mayo");
            }else if (mes == 6 ){
            System.out.println("Junio");
            }else if (mes == 7 ){
            System.out.println("Julio");
            }else if (mes == 8 ){
            System.out.println("Agosto");
            }else if (mes == 9 ){
            System.out.println("Septiembre");
            }else if (mes == 10 ){
            System.out.println("octubre");
        }else if (mes == 11 ){
            System.out.println("Noviembre");
            }else if (mes == 12 ){
            System.out.println("Diciembre");       
            }else { 
                System.out.print("Numero invalido, es entre 1 y 12");
            }
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getElectronicos() {
        return electronicos;
    }

    public void setElectronicos(int electronicos) {
        this.electronicos = electronicos;
    }

    public int getAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(int automotrices) {
        this.automotrices = automotrices;
    }

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }

    public int getMontoFactura() {
        return montoFactura;    
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }

   
    
}
