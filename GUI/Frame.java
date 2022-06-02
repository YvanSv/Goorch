package Goorch.GUI;

import Goorch.Controleur;
import Goorch.GUI.Start.PanelStart;
import javax.swing.JFrame;
// import java.lang.Thread;

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
        this.setSize(1599,899);
        this.setSize(1600,900);
    }

    public void printStart()
    {
        this.remove(this.pnlWc);
        this.pnlStart = new PanelStart();
        this.add(this.pnlStart);
        this.resize();
        try{Thread.sleep(7500);} catch(Exception e) {}
        this.remove(this.pnlStart);
    }
}
