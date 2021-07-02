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

    public Punto getP1() {
        return p1;
    }

    public Linea getRadio() {
        return radio;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setRadio(Linea radio) {
        this.radio = radio;
    }
    public double areaDelCirculo(int radio){
        double a;
        a=Math.PI*Math.pow((double)(radio),2);
        return a;
     }
            
   
}
