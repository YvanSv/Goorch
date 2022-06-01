import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;

public class PanelWelcome extends JPanel implements ActionListener {
    private Controleur c;
    private JTextField txtNbPlayers;
    private JButton btnGo;

    public PanelWelcome(Controleur c)
    {
        this.c = c;

        this.txtNbPlayers = new JTextField("Enter here please");
        this.btnGo = new JButton("Let's go !");
        this.add(new JLabel("Number of players : "));
        this.add(this.txtNbPlayers);
        this.add(this.btnGo);
        this.btnGo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (this.txtNbPlayers.getText().equals("")) return;
        else try{ this.c.createGame(Integer.parseInt(txtNbPlayers.getText()));} catch(Exception ex) {}
    }
}
