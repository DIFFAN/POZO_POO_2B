/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cilindro;
import ec.edu.intsuperior.modelo.Circulo;
import ec.edu.intsuperior.modelo.Linea;
import ec.edu.intsuperior.modelo.Punto;
/**
 *
 * @author DIFFAN
 */
public class Aplicacion {
    public static void main(String[] args){
        Punto p = new Punto(2, 2);
        Punto p1 = new Punto(7, -3);
        Punto p2 = new Punto(3, 2);
        Linea radio = new Linea(p1, p2);
        Circulo circulo = new Circulo(radio, p);
        Cilindro c1 = new Cilindro(circulo, radio);     
    }
}
