/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author arjol
 */
public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agente agente1= new Agente();
        JOptionPane.showInputDialog(null, "Nobre del agente: ");     
        Factura mes =new Factura();
        //JOptionPane.showInternalInputDialog(null, "Indique el mes de la factura");
        //JOptionPane.showConfirmDialog(null, "El mes de la factura es "+ mes.getMes());
        Factura electronicos=new Factura();
        JOptionPane.showInputDialog(null, "Cuantos productos electronicos vendio ?");
       Factura automotrices=new Factura();
        JOptionPane.showInputDialog(null, "Cuantos productos automotrices vendio ?");
         Factura construccion =new Factura();
        JOptionPane.showInputDialog(null, "Cuantos productos de construccion vendio ?");
      Factura montoFactura =new Factura();
        JOptionPane.showInputDialog(null, "Cuanto fue el monto de su factura ?");
      
        
        Agente sucursal = new Agente();
        agente1.getSucursal();
        agente1.getCedula();
        agente1.getVehiculo();
        agente1.getCodigo();
        
       
      
        
        
       
    }
/*
    
        Usuario usuario = new Usuario();
        JOptionPane.showConfirmDialog(null, usuario.getPwd());
        usuario.setPwd(JOptionPane.showInputDialog("Digite el pwd"));
        JOptionPane.showConfirmDialog(null, usuario.getPwd());
        Usuario usuario1 = new Usuario("papito1", "papacito");
        JOptionPane.showConfirmDialog(null, "El usuario "  + usuario1.getUser() + " tiene el pwd "+ usuario1.getPwd());
        
    */    
}
