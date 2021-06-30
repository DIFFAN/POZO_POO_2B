/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author DIFFAN
 */
public class Circulo {
    private Linea radio;
    private Punto p1;

    public Circulo() {
    }

    public Circulo(Linea radio, Punto p1) {
        this.radio = radio;
        this.p1 = p1;
    }
    
}
