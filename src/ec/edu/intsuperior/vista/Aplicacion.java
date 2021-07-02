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
import java.util.Scanner;
/**
 *
 * @author DIFFAN
 */
public class Aplicacion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        Punto p1 = new Punto(7, 5);
        Punto p2 = new Punto();
        System.out.println("ingrese los datos del punto 2");
        p2.setX(s.nextInt());
        p2.setY(s.nextInt());
        System.out.println("la distancia es:"+
                p1.distanciaEntreDosPuntos(p2.getX(), p1.getX(), p2.getY(), p1.getY()));
             
        Circulo c1 = new Circulo(5, p1);
        System.out.println("EL AREA DEL CIRCULO ES:"+c1.areaDelCirculo());
        
        
        
        
        
    }
}
