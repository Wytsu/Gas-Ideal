/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo1;

/**
 *
 * @author ALUMNO
 */
public class Trabajo1 {
    private final double temperatura;
    private final double numerodeMoles;
    private final double volumen;
    private final double R = 8.314;
    
    public Trabajo1(double temperatura, double numerodeMoles, double volumen){
        this.temperatura = temperatura ;
        this.numerodeMoles = numerodeMoles;
        this.volumen = volumen;
    }
    public double calcularP() {
        return (numerodeMoles *R* temperatura) / volumen;
        
    }

    public static void main(String[] args) {
        Trabajo1 gas= new Trabajo1(100,20,5);
        
        System.out.println("La presion del gas ideal es: "+ gas.calcularP() + " atm");
    }
}
