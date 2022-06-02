package Goorch.GUI.Start;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Image;

public class PanelRounds extends JPanel{
    public PanelRounds(int indexBegin)
    {
        this.setLayout(new GridLayout(1,9,27,0));
        for (int i = indexBegin+1; i < indexBegin+10; i++)
            this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Round "+i+".png").getImage().getScaledInstance(150, 20, Image.SCALE_DEFAULT))));
    }
}
