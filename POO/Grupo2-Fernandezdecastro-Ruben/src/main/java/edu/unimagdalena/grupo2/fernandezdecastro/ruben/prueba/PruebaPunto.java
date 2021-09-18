/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdalena.grupo2.fernandezdecastro.ruben.prueba;
import edu.unimagdalena.grupo2.fernandezdecastro.ruben.geometria.*;
/**
 *
 * @author rdafe
 */
public class PruebaPunto {
    public static void main(String[] args) {
        /*se declara la variable local punto1 
        y se le asigna un objeto de tipo punto con parametros (1,3)*/
        var punto1= new Punto(1,3);
        /*se muestra por consola la informacion de las propiedades x e y*/
        System.out.println("Coordenadas: ("+punto1.getX()+","+punto1.getY()+")");
        /*se declara la variable local punto2 
        y se le asigna un objeto de tipo punto construido sin parametros*/
        var punto2= new Punto();
        /*se muestra por consola la informacion de las propiedades x e y*/
        System.out.println("Coordenadas: ("+punto2.getX()+","+punto2.getY()+")");
         /*se declara la variable local punto3
        y se le asigna un objeto de tipo punto con parametro (punto1)*/
         var punto3= new Punto(punto1);
        /*se muestra por consola la informacion de las propiedades x e y*/
         System.out.println("Coordenadas: ("+punto3.getX()+","+punto3.getY()+")");
         /*se declara la variable local punto 4 y se le asigna la variable punto2*/
         var punto4=punto2;
         /*se modifican las propiedades de punto2*/
         punto2.setX(3);
         punto2.setY(7);
         /*se muestra por consola la informacion de las propiedades x e y para el punto2 y punto4*/
         System.out.println("Coordenadas: ("+punto2.getX()+","+punto2.getY()+")");
         System.out.println("Coordenadas: ("+punto4.getX()+","+punto4.getY()+")");
       
    }
}
