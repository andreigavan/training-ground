import javax.swing.*;

//pentru Stefania
public class Jucarii extends JPanel{

    private String[] tip = {"Puzzle", "Societate", "Educative"};
    private String[] afiseaza = {"Toate", "Puzzle", "Societate", "Educative"};
    private String[] rows = {"Nume", "Producator", "ID", "Pret", "Info"};
    private String[][] columns = {{"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Autor1", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            {"Nume1", "Producator", "4546", "5656", "gvfd"},
            };

    Jucarii()  {
        super();
        createUIComponents();
    }

    public void createUIComponents() {
        JTextField textFieldNume = new JTextField("Nume");
        JTextField textFieldAutor = new JTextField("Producator");
        JTextField textFieldIsbn = new JTextField("ID");
        JTextField textFieldPret = new JTextField("Pret");
        JTextField textFieldInfo = new JTextField("Info");

        JButton addButton = new JButton("Adauga");
        JButton removeButton = new JButton("Sterge");
        JButton buyButton = new JButton("Cumpara");
        JButton printButton = new JButton("Afiseaza");

        JComboBox<String> comboBoxTip = new JComboBox<>(tip);
        JComboBox<String> comboBoxAfiseaza = new JComboBox<>(afiseaza);
        JComboBox<String> comboBoxCumpara = new JComboBox<>();
        JComboBox<String> comboBoxSterge = new JComboBox<>();

        JTable table = new JTable(columns, rows);
        JScrollPane scrollPane = new JScrollPane(table);

//        JPanel mainPanel = new JPanel();
        GroupLayout mainLayout = new GroupLayout(this);
        this.setLayout(mainLayout);
        mainLayout.setAutoCreateGaps(true);
        mainLayout.setAutoCreateContainerGaps(true);

        mainLayout.setHorizontalGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(textFieldNume)
                                .addComponent(textFieldAutor)
                                .addComponent(textFieldIsbn)
                                .addComponent(textFieldPret)
                                .addComponent(textFieldInfo))
                        .addComponent(scrollPane))
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(comboBoxTip)
                                .addComponent(addButton))
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(comboBoxAfiseaza)
                                .addComponent(printButton))
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(comboBoxCumpara)
                                .addComponent(buyButton))
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(comboBoxSterge)
                                .addComponent(removeButton)))
        );

        mainLayout.linkSize(SwingConstants.HORIZONTAL, addButton, printButton, buyButton, removeButton);

        mainLayout.setVerticalGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textFieldNume, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldIsbn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldPret, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxTip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton))
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxAfiseaza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(printButton))
                                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxCumpara, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buyButton))
                                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxSterge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(removeButton))))
        );

    }

}