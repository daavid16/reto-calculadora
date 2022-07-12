
package com.mycompany.reto1;
        
import javax.swing.JOptionPane;

import Clases.*;

/**
 *
 * @author JuanDavidBayonaPerez&DavidTibana.......
 */
public class Reto1 {

    public static void main(String[] args) {
        
        try{
        String menu
                = """
                    Seleccione una opcion:
                    1. Realizar una Operaciones
                    2. Salir
                                                             
               """;
               
        String opcion = JOptionPane.showInputDialog(menu);
        
        switch (opcion) {
            case "1":
               String operaciones
                = """
                Selecione una operacion
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Potencia
                6.Raiz Cuadrada
                7.Salir
             
                """;
 
                String opcion2 = JOptionPane.showInputDialog(operaciones); 
        
                
                switch (opcion2) {

                    case "1":

                        double s1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        double s2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        ClsOperaciones sum = new ClsOperaciones(s1,s2); 
                        double resultadoSuma = sum.suma();
                        JOptionPane.showInternalMessageDialog(null, "El resultado de la suma es " + resultadoSuma);
                        break;

                     case "2":

                        double r1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        double r2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        ClsOperaciones res = new ClsOperaciones(r1,r2); 
                        double resultadoResta = res.resta();
                        JOptionPane.showInternalMessageDialog(null, "El resultado de la resta es " + resultadoResta);
                        break;

                    case "3":

                        double m1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        double m2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        ClsOperaciones mul = new ClsOperaciones(m1,m2); 
                        double resultadoMultiplicacion = mul.multiplicacion();
                        JOptionPane.showInternalMessageDialog(null, "El resultado de la multiplicacion es " + resultadoMultiplicacion);
                        break;

                    case "4":

                        double d1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        double d2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        if (d2 == 0) { 
                            JOptionPane.showMessageDialog(null, "Error \n INo se puede dividir por cero ", "Division por cero!", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else {
                            ClsOperaciones div = new ClsOperaciones(d1,d2); 
                            double resultadoDivision = div.division();
                            JOptionPane.showInternalMessageDialog(null, "El resultado de la division es " + resultadoDivision);
                            break;
                        }
                        

                    case "5":

                        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero base"));
                        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero exponente"));
                        ClsOperaciones pot = new ClsOperaciones(p1,p2); 
                        double resultadoPotencia = pot.potencia();
                        JOptionPane.showInternalMessageDialog(null, "El resultado de la potencia es " + resultadoPotencia);
                        break;

                    case "6":

                        double raiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero "));
                        ClsOperaciones raz = new ClsOperaciones(raiz); 
                        double resultadoRaiz = raz.raiz();
                        JOptionPane.showInternalMessageDialog(null, "El resultado de la raiz cuadrada es " + resultadoRaiz);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Error \n Ingresar una opcion valida ", "Informacion Invalida!", JOptionPane.ERROR_MESSAGE);
            }
            case "2":
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Error \n Ingresar una opcion valida ", "Informacion Invalida!", JOptionPane.ERROR_MESSAGE);
           
        }
            
        
         
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error \n Ingresar solo numeros ", "Informacion Invalida!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
