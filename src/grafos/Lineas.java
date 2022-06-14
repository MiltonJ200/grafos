/*
creacion de las lineas que unen a los nodos
 */
package grafos;

import java.awt.Graphics;

/**
 *
 * @author Ana Vianey Garcia y Lizbeth Martinez de la Luz
 */
public class Lineas {
     /*creamos variables que nos sirven para guiar las lineas de nodo a nodo*/
    private int x1,y1,x2,y2;
    
    public Lineas (int x1,int y1, int x2, int y2 ){
        /*creamos un constructor con las coordenadas*/
        this.x1 =x1;
        this.y1 =y1;
        this.x2 =x2;
        this.y2 =y2;
       
        
    }
    
    public void pintar(Graphics g){    /*metodo para pintar las lineas*/
        g.drawLine(x1,y1,x2,y2);    /*le pasamos las coordenadas que hemos creado */
            }
    
    /*importamos el metodo de get para las variables de los nodos */
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
