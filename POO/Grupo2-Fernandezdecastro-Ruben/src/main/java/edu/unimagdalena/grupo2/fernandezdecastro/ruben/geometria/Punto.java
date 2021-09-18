/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdalena.grupo2.fernandezdecastro.ruben.geometria;

/**
 *
 * @author rdafe
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){   
    }
    public Punto(int x, int y) {
        this.x= x;
        this.y = y;
    }
    
    public Punto(Punto p){
        x=p.x;
        y=p.y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void incrementar(int x,int y){
        setX(getX()+x);
        setY(getY()+y);
    } 
}
