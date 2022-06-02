package Goorch.GUI.Start;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class PanelRoundsAndImages extends JPanel{
    public PanelRoundsAndImages(int indexBegin)
    {
        this.add(new PanelRounds(indexBegin), BorderLayout.NORTH);
        this.add(new PanelImages(indexBegin));
    }
}
