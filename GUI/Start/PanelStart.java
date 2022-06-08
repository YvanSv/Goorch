package Goorch.GUI.Start;
import Goorch.Controleur;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Graphics;
import java.io.File;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class PanelStart extends JPanel implements MouseListener{
    private Controleur c;
    private Image backgroundImage;
    private int nbClicked;

    public PanelStart(Controleur c)
    {
        this.c = c;
        this.setLayout(new BorderLayout());
        try { this.backgroundImage = ImageIO.read(new File("./images/Fond.png")); } catch(Exception e) {}
        this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Match classique.png").getImage().getScaledInstance((int)(616*c.getRatio()),(int)(103*c.getRatio()), Image.SCALE_DEFAULT))), BorderLayout.SOUTH);
        this.add(new PanelRecap(c));
        this.setOpaque(false);
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(this.backgroundImage, 0, 0, this);
    }

    public void mouseClicked (MouseEvent e)
    {
        this.nbClicked++;
        if (this.nbClicked >= 2) this.c.startGame();
        Thread t = new Thread(){
            public void run()
            {
                try { sleep(200); } catch(Exception e) {}
                PanelStart.this.nbClicked--;
            }
        };
        t.start();
    }
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited  (MouseEvent e) {}
    public void mousePressed (MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}