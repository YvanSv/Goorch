package Goorch.GUI;

import Goorch.Controleur;
import Goorch.GUI.Start.PanelStart;
import javax.swing.JFrame;

public class Frame extends JFrame{
    private Controleur c;
    private PanelWelcome pnlWc;
    private PanelStart pnlStart;

    public Frame(Controleur c)
    {
        this.c = c;
        this.setTitle("Goorch");
		this.setLocation(0,0);
        this.setSize(1600,900);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        this.pnlWc = new PanelWelcome(this.c);
        this.add(this.pnlWc);

        this.setVisible(true);
    }

    public void resize()
    {
        this.setSize((int)(1599*c.getRatio()),(int)(899*c.getRatio()));
        this.setSize((int)(1600*c.getRatio()),(int)(900*c.getRatio()));
    }

    public void printStart()
    {
        this.remove(this.pnlWc);
        this.pnlStart = new PanelStart(this.c);
        this.add(this.pnlStart);
        this.resize();
    }

    public void printFirstRound()
    {
        this.remove(this.pnlStart);
        this.resize();
    }
}
