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
        
    }
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distanciaEntreDosPuntos(int x1, int x2, int y1, int y2){
        //x = (int) (Math.pow(((double)(x1)-(double)(x2)), 2));
       
        //y = (int) (Math.pow(((double)(y1)-(double)(y2)), 2));
        
        double d;
        d=Math.sqrt((Math.pow(((double)(x2)-(double)(x1)), 2))+(Math.pow(((double)(y2)-(double)(y1)), 2)));
        return d;
    }
}
