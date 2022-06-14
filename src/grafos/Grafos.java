/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import javax.swing.JFrame;

/**
 *
 * @author Ana Vianey Garcia y Lizbeth Martinez de la Luz
 */
public class Grafos {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana =new JFrame ("GRAFO"); /*creamos una ventana con el titulo de grafo para poder observar lo que genera el programa */
        ventana.add(new Lienzo()); /*hacemos una configuracion agregando un nuevo lienzo*/
        ventana.setSize(600, 600); /*agregamos el tamaño del lienzo */
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*cada que se cierre la ventana, el programa termina de ejecutarse*/
        ventana.setVisible(true);
    }
    
}
