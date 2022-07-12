/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author juand
 */
public class ClsOperaciones {
    
    private double n1;
    private double n2;

    public ClsOperaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public ClsOperaciones(double n1) {
        this.n1 = n1;
    }
    
    
    public double suma () {
    
        return this.n1 + this.n2;
    }
    public double resta () {
    
        return this.n1 - this.n2;
    }
  
    public double multiplicacion () {
    
        return this.n1 * this.n2;
    }
    public double division () {
    
        return this.n1 / this.n2;
    }
        
    public double potencia () {
    
        return Math.pow(this.n1, this.n2);
    }
      
         public double raiz () {
    
        return Math.sqrt(this.n1);
    }
        

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    
}
