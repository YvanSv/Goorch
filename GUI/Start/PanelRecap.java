package Goorch.GUI.Start;
import Goorch.Controleur;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class PanelRecap extends JPanel {

    public PanelRecap(Controleur c)
    {
        this.setLayout(new GridLayout(2,1));
        this.add(new PanelRoundsAndImages(0, c));
        this.add(new PanelRoundsAndImages(9, c));
        this.setOpaque(false);
    }
}