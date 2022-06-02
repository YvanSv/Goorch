package Goorch.GUI.Start;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Image;

public class PanelStart extends JPanel {

    public PanelStart()
    {
        this.setLayout(new BorderLayout());
        this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Match classique.png").getImage().getScaledInstance(616, 103, Image.SCALE_DEFAULT))), BorderLayout.SOUTH);
        this.add(new PanelRecap());
    }
}