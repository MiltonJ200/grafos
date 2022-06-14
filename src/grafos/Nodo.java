/*representacion de vertices en circulos*/
package grafos;

import java.awt.Graphics;

 // @author Ana Vianey Garcia y Lizbeth Martinez de la Luz
public class Nodo {
    private int x,y; /*varianbles que representan las coordenadas del vertice */
    public static final int d=60; /*indica el diametro de nuestros circulos en un valor de 60 puntos*/
    
    public Nodo (int x, int y ) /*metodo constuctor para recibir los valores en "x" y en "y" */
    {
        this.x=x;
        this.y=y;
       
        
    
       
    }
 public void pintar(Graphics g) {   /*este metodo nos sirve para poder dibujar el grafo en nuestro lienzo*/
     g.drawOval(this.x - d/2, this.y - d/2, d, d); /*importamos el objeto de nuestro metodo, obteniendo asi otro metodo que nos ayudara a pintar*/
    
     
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

    public void setY(int y1) {
        this.y = y;
    }
}