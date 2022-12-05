import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ninja {
    public static void main(String[]args){
        JFrame frame  = new JFrame("Ninja");
        Terrain terrain = new Terrain(400, 300);
//        JPanel panel = new JPanel();
//        frame.setContentPane(panel);
        Ecran ecran = new Ecran(terrain);

        JLabel score = new JLabel("Score : " + 0);

        JLabel tmp = new JLabel("Perdu");
        frame.getContentPane().add(score);
        frame.getContentPane().add(tmp);
        frame.getContentPane().add(score, BorderLayout.SOUTH);
        frame.getContentPane().add(ecran, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ecran.addMouseMotionListener(ecran);
        Timer timer = new Timer(2000, (ActionEvent e)-> {
            terrain.renouvellement();
            ecran.repaint();
        });
        timer.setInitialDelay(0);
        timer.start();

    }
}
