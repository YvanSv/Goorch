package Goorch.GUI.Start;

import Goorch.Controleur;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.GridLayout;

public class PanelMultiActions extends JPanel{
    public PanelMultiActions(String s, Controleur c)
    {
        System.out.println("ICI");
        this.setLayout(new GridLayout(s.split("\n").length,1));
        for (String s2 : s.split("\n"))
        {
            if (s2.contains("lettre"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/"+s2.charAt(0)+".png").getImage().getScaledInstance((int)(178*c.getRatio()), (int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else if (s2.contains("Question"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Question.png").getImage().getScaledInstance((int)(178*c.getRatio()), (int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else if (s2.contains("à"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/"+s2.substring(s2.indexOf("a")-2)+".png").getImage().getScaledInstance((int)(178*c.getRatio()), (int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else if (s2.contains("x1.25"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Malus bonus.png").getImage().getScaledInstance((int)(178*c.getRatio()),(int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else if (s2.contains("premier"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Winner x0.5.png").getImage().getScaledInstance((int)(178*c.getRatio()), (int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else if (s2.contains("mauvais score"))
                this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Looser x2.png").getImage().getScaledInstance((int)(178*c.getRatio()), (int)(178*c.getRatio()), Image.SCALE_DEFAULT))));
            else this.add(new JLabel(s2));
        }

        this.setOpaque(false);
    }
}
