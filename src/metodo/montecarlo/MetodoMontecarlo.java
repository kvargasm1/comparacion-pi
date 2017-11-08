/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.montecarlo;

import javax.swing.JOptionPane;

/**
 *
 * @author RetailAdmin double semillax =
 * Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en x"));
 * double semillay = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la
 * semilla en y")); int periodo =
 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese el periodo"));
 *
 */
public class MetodoMontecarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            double semillax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en x"));
            double semillay = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en y"));
            int periodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el periodo"));
            int sumaPuntosCirculo = 0;
            for (int i = 0; i < periodo; i++) {
                
                Utilidades utilidades = new Utilidades();
                semillax = utilidades.calculaX(semillax);
                semillay = utilidades.calculaY(semillay);
                boolean verificaPunto = utilidades.verificaPunto(semillax, semillay);
                if(verificaPunto){
                    sumaPuntosCirculo++;
                }
            }
            
            double res = (4 * sumaPuntosCirculo)/periodo;
            double resta = (3.14159265358979323846 - res);
            if(Math.abs(resta) <= 0.1){
                JOptionPane.showMessageDialog(null, "la diferencia es menor o igual a 0.1");
            }else{
                JOptionPane.showMessageDialog(null, "la diferencia es mayor a 0.1 Diferencia: " + resta);
            }
            
        } catch (Exception ex) {

        }

    }

}
