import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Librarie extends JFrame{

    private JTabbedPane tabPanel;

    public Librarie(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        //Create and set up the window.
//        JFrame frameLibrarie = new JFrame();
//        frameLibrarie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frameLibrarie.setSize(850,450);

        JPanel panelDiverse = new Diverse();
        JPanel panelCarti   = new Carti();
        JPanel panelJucarii = new Jucarii();

        String getAbsolutePathForToys = new File("Toys.png").getAbsolutePath();
        String getAbsolutePathForBooks = new File("Books.png").getAbsolutePath();
        String getAbsolutePathForDiverse = new File("Diverse.png").getAbsolutePath();

        ImageIcon tabToysIcon = new ImageIcon(getAbsolutePathForToys);
        ImageIcon tabBooksIcon = new ImageIcon(getAbsolutePathForBooks);
        ImageIcon tabDiverseIcon = new ImageIcon(getAbsolutePathForDiverse);

        tabPanel = new JTabbedPane();
//        tabPanel.setBounds(5,5,800,400);


        tabPanel.addTab("Diverse", tabDiverseIcon, panelDiverse);
        tabPanel.addTab("Carti",tabBooksIcon, panelCarti);
        tabPanel.addTab("Jucarii", tabToysIcon, panelJucarii);

//        frameLibrarie.add(tabPanel);
//        frameLibrarie.pack();
//        frameLibrarie.setVisible(true);
        setContentPane(tabPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Librarie("Librarie");
            }
        });
    }}