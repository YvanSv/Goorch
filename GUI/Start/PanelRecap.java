package Goorch.GUI.Start;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class PanelRecap extends JPanel {

    public PanelRecap()
    {
        this.setLayout(new GridLayout(2,1));
        this.add(new PanelRoundsAndImages(0));
        this.add(new PanelRoundsAndImages(9));
    }
}