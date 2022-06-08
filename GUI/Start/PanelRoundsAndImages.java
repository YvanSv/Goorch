package Goorch.GUI.Start;

import Goorch.Controleur;
import Goorch.Worker.Utils;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class PanelRoundsAndImages extends JPanel{
    public PanelRoundsAndImages(int indexBegin, Controleur c)
    {
        this.add(new PanelRounds(indexBegin, c), BorderLayout.NORTH);
        this.add(new PanelImages(indexBegin, c));
        this.setOpaque(false);
    }
}

class PanelImages extends JPanel{
    public PanelImages(int indexBegin, Controleur c)
    {
        this.setLayout(new GridLayout(1,9));
        String[] grid = Utils.getRoundActions();

        for (int i = indexBegin; i < indexBegin + 9; i++)
            try { if (grid[i].contains("")) this.add(new PanelMultiActions(grid[i], c)); }
            catch(Exception e) {this.add(new JLabel());}

        this.setOpaque(false);
    }
}

class PanelRounds extends JPanel{
    public PanelRounds(int indexBegin, Controleur c)
    {
        this.setLayout(new GridLayout(1,9,(int)(27*c.getRatio()),0));
        for (int i = indexBegin+1; i < indexBegin+10; i++)
            this.add(new JLabel(new ImageIcon(new ImageIcon("./images/Round "+i+".png").getImage().getScaledInstance((int)(150*c.getRatio()), (int)(20*c.getRatio()), Image.SCALE_DEFAULT))));
        this.setOpaque(false);
    }
}