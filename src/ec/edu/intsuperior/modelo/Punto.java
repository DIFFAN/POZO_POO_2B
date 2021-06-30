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
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        System.out.println("objeto creado");
    }
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
}
