import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ecran extends JPanel implements MouseMotionListener {
    protected Terrain terrain;
    public Ecran(Terrain t){
        terrain = t;
        setPreferredSize(new Dimension(terrain.hight, terrain.width));
        setBackground(Color.WHITE);
    }
    public void  paintComponent (Graphics g){
        super.paintComponent(g);
        for(Entite e : terrain.entites){
            if (e instanceof Fruit){g.setColor(Color.GREEN);}
            if (e instanceof Bombe){g.setColor(Color.RED);}

            g.fillOval(e.x- e.z, e.y-e.z, 2*e.z, 2*e.z);
        }

    }
    public void mouseDragged (MouseEvent e){}
    public void mouseMoved(MouseEvent e ){
        terrain.coupe(e.getX(), e.getY());
        this.repaint();
    }
}
