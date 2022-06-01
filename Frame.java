import javax.swing.JFrame;

public class Frame extends JFrame{
    private Controleur c;
    private PanelWelcome pnlWc;

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
}
