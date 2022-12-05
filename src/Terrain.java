import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terrain {
    protected int hight, width;
    protected List<Entite> entites;
    public Terrain(int h, int w)
    {
        hight = h;
        width = w;
        entites = new ArrayList<Entite>();
    }

    public int getHight() {
        return hight;
    }
    public int coupe(int x, int y){
        //auel score si le joueur coupe
        //cette position
        int s = 0;
        List<Entite> touches = new ArrayList<>();
        for (Entite e : entites){
            //si l'element est touche son score compte
            if (e.touched(x, y)) {
                s+=e.coupe();
                touches.add(e);
                //entites.remove(e);
            }
        }
        for (Entite e : touches){
            entites.remove(e);
        }
        return (s);
    }
    public void renouvellement ()
    {
        for (int i = 0; i < 10; i++){
            Random rnd = new Random();
            int x = rnd.nextInt(width);
            int y = rnd.nextInt(hight);
            int r = 20 + rnd.nextInt(20);
            if (rnd.nextDouble()< .5)
            { entites.add (new Fruit(x,y, r,1));}
            else  { entites.add (new Bombe(x,y, r,1));}
        }
    }
//    public void mousDragged (MouseEvent e){}
//    public void mouseMouve(MouseEvent e ){
//        coupe(e.)
//    }
}
