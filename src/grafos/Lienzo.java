/*
clase para pintar los nodos
 */
package grafos;

/*importacion de los metodos para la clase*/
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ana Vianey Garcia y Lizbeth Martinez de la Luz
 */
public class Lienzo extends JPanel implements MouseListener{ /*heredamos la clase jpanel e implementamos una interfaz*/
    /* MouseLustener sirve  para indicar que el mouse soltó el objeto. 
    Si se le añade esta interfaz a un boton, entonces el objeto es el boton*/
    private Vector<Nodo>vectorNodos; //creamos nuestro vector nodos
    private Vector<Lineas>vectorLinea; //creamos nuestro vector de lineas
    private Point p1,p2;
        
    
    public Lienzo (){ /*creamos nuestro constuctor de lienzo */
        this.vectorNodos = new Vector<>(); //inicializamos nuestro vector nodos en el constructor 
        this.vectorLinea = new Vector<>(); // inicializamos en el constuctor como al de nodos
        this.addMouseListener(this);    /*cada que creemos un objeto este es el que lo interpretara*/
        
    }
    @Override 
    public void paint (Graphics g){ /*este metodo recibe por parametro objetos del tipo grafipchs*/
        for (Nodo nodos : vectorNodos ) { /*con ayuda del for recorreremos todos los nodos y pintaremos asi nuestros circulos*/
            nodos.pintar(g); /* con ayuda de este metodo pintaremos*/
        }  
        for (Lineas lineas :vectorLinea)
            lineas.pintar(g); //por cada enlace pintaremos las lineas
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
      if (e.getButton ()==MouseEvent.BUTTON1) { /*indicamos que sea el click izquierdo con el que se van a pintar los circulos */
         
            this.vectorNodos.add(new Nodo(e.getX(), e.getY())); /*agregamos un nuevo nodo al vector cada que damos click, asi mismo pasamos lo que son las coordenadas*/
        repaint();  //repintaremos el lienzo cada que pintemos un nuevo nodo
    }
      if (e.getButton ()==MouseEvent.BUTTON3) { //indicamos que con el click derecho se uniran los nodos entre si 
          for (Nodo nodo : vectorNodos) { //recorreremos nuestros nodos
              if (new Rectangle(nodo.getX()-Nodo.d/2,nodo.getY() -Nodo.d/2, Nodo.d, Nodo.d).contains(e.getPoint())) { 
                  //con este metodo se confirmara si estamos sobre un objeto para asi poder pintar nuestras lineas
            if (p1==null) //si el punto 1 es igual a null entonces se inicializa 
                p1=new Point(nodo.getX(),nodo.getY());
            else {
                //si es falso se inicializa el punto 2 
                p2=new Point (nodo.getX(),nodo.getY()); 
                 
                this.vectorLinea.add(new Lineas(p1.x,p1.y,p2.x,p2.y));
                repaint();
                p1=null;
                p2=null; //el punto 1 y el punto 2 nos sirven para poder unir nuestrsos vertices 
            }
    }
}
}
            }
/*como el metodo que utilizamos es abstracto entonces tenemos que importar todos sus demas metodos*/
    @Override
    public void mousePressed(MouseEvent e) {
       /*Se usa para indicar que se presiono el objeto*/
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     /*Este se usa para indicar que el mouse soltó el objeto.
        Si se le añade esta interfaz a un boton, entonces el objeto es el boton, si se le añade a un circulo entonces el objeto sera el circulo.
        */  
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       /*Se usa para indicar que el puntero del mouse entro al area del objeto.*/
    }

    @Override
    public void mouseExited(MouseEvent e) {
        /*se usa para indicar que el puntero del mouse salio del area del objeto*/
    }
            
}

