package Goorch.GUI;
import Goorch.Controleur;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.*;

public class PanelWelcome extends JPanel implements ActionListener {
    private Controleur c;
    private JComboBox<String> cbNbPlayers;
    private JComboBox<String> cbResolutions;
    private JButton btnGo;
    private int wasSelected;
    private JTextField[] lstPseudo;
    private JLabel[] lstLabel;
    private JButton btnFinito;

    public PanelWelcome(Controleur c)
    {
        this.c = c;

        String[] optionsToChoose = {"2","3","4","5","6"};
        this.cbNbPlayers = new JComboBox<>(optionsToChoose);
        String[] resols  = {"1920x1080","1760x990","1600x900","1440x810","1280x720","1120x630"};
        this.cbResolutions = new JComboBox<>(resols);
        this.btnGo = new JButton("Let's go !");

        this.add(new JLabel("Resolution : "));
        this.add(this.cbResolutions);
        this.add(new JLabel("Number of players : "));
        this.add(this.cbNbPlayers);
        this.add(this.btnGo);

        this.btnGo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        // Pour la résolution
        float ratio = Float.parseFloat((this.cbResolutions.getSelectedItem()+"").split("x")[0]) / 1600;
        this.c.setRatio(ratio);
        int select = Integer.parseInt(""+this.cbNbPlayers.getSelectedItem());

        if (e.getSource().equals(this.btnGo))
        {
            try
            {
                for (JTextField txt : this.lstPseudo) this.remove(txt);
                for (JLabel lbl     : this.lstLabel ) this.remove(lbl);
                this.remove(this.btnFinito);
            } catch (Exception ex) {}

            this.addPseudos(select);
            this.c.createGame(select);
            this.wasSelected = select;
        }
        else
        {
            String[] pseudos = new String[this.wasSelected];
            for (int i = 0; i < this.wasSelected; i++)
                pseudos[i] = this.lstPseudo[i].getText();
            
            this.c.setPseudos(pseudos);
            this.c.printStart();
        }

        this.c.resize();
    }

    private void addPseudos(int select)
    {
        this.lstPseudo = new JTextField[select];
        this.lstLabel = new JLabel[select];

        for (int i = 0; i < select; i++)
        {
            lstLabel[i] = new JLabel("Pseudo du joueur " + (i+1) + " : ");
            lstPseudo[i] = new JTextField("Pseudo de J"+(i+1));
            this.add(lstLabel [i]);
            this.add(lstPseudo[i]);
        }

        this.btnFinito = new JButton("Finito Pipo");
        this.add(this.btnFinito);
        this.btnFinito.addActionListener(this);
    }
}
