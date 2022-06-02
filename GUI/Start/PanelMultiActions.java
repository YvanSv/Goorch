package Goorch.GUI.Start;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.GridLayout;

public class PanelMultiActions extends JPanel{
    public PanelMultiActions(String s)
    {
        this.setLayout(new GridLayout(s.split("\n").length,1));
        for (String s2 : s.split("\n"))
        {
            if (s2.contains("lettre"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/"+s2.charAt(0)+".png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else if (s2.contains("Question"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Question.png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else if (s2.contains("à"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/"+s2.substring(s2.indexOf("à")-2)+".png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else if (s2.contains("x1.25"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Malus bonus.png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else if (s2.contains("premier"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Winner x0.5.png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else if (s2.contains("mauvais score"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Looser x2.png").getImage().getScaledInstance(178, 178, Image.SCALE_DEFAULT))));
            else this.add(new JLabel(s2));
        }
    }
}
