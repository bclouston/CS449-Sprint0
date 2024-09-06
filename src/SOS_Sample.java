import javax.swing.*;

public class SOS_Sample extends JFrame {
    private JPanel redPanel;
    private JPanel bluePanel;
    private JPanel midPanel;
    private JRadioButton humanPlayerRadioRed;
    private JRadioButton AIPlayerRadioRed;
    private JRadioButton humanPlayerRadioBlue;
    private JRadioButton AIPlayerRadioBlue;
    private JButton redButtonS;
    private JButton redButtonO;
    private JButton blueButtonS;
    private JButton blueButtonO;
    private JRadioButton newGameSimpleRadio;
    private JRadioButton generalRadioButton;
    private JPanel newGamePanel;
    private JButton infoButton;
    private JTextField textField1;
    private JButton newGameButton;
    private JPanel gamePanel;
    private JPanel SOSPanel;

    public SOS_Sample() {
        setTitle("SOS Game GUI Prototype");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(SOSPanel);
        setSize(900, 600);
    }
}
