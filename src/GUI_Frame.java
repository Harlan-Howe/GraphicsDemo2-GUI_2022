import javax.swing.*;
import java.awt.*;

public class GUI_Frame extends JFrame
{

    private JButton firstButton;
    private JCheckBox happyCheckbox, knowItCheckbox;
    private JRadioButton morningRB, afternoonRB, eveningRB;
    private JTextField nameField;
    private JTextArea commentArea;
    private JComboBox dwarfPicker;

    public GUI_Frame()
    {
        super("GUI demo");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        build_GUI();
        setVisible(true);
    }

    public void build_GUI()
    {

        JButton button0 = new JButton("Button 0");
        button0.setForeground(Color.LIGHT_GRAY);
        JButton button1 = new JButton("Button 1");
        button1.setForeground(Color.PINK);
        JButton button2 = new JButton("Button 2");
        button2.setForeground(new Color(73,47,146));
        JButton button3 = new JButton("Button 3");
        button3.setForeground(new Color(255,196, 37));

        JCheckBox pointsCB = new JCheckBox("Show Points");
        JCheckBox linesCB = new JCheckBox("Show Lines");

        JRadioButton originalRB = new JRadioButton("Original");
        JRadioButton zoomedRB = new JRadioButton("Zoomed in");
        ButtonGroup scaleButtons = new ButtonGroup();
        scaleButtons.add(originalRB);
        scaleButtons.add(zoomedRB);

        Box bottomTools = Box.createHorizontalBox();
        bottomTools.add(Box.createHorizontalGlue());
        bottomTools.add(button0);
        bottomTools.add(button1);
        bottomTools.add(button2);
        bottomTools.add(Box.createHorizontalStrut(75));

        Box linesAndPoints = Box.createVerticalBox();
        linesAndPoints.add(pointsCB);
        linesAndPoints.add(linesCB);

        bottomTools.add(linesAndPoints);

        Box scales = Box.createVerticalBox();
        scales.add(originalRB);
        scales.add(Box.createVerticalStrut(30));
        scales.add(zoomedRB);

        bottomTools.add(scales);
        bottomTools.add(Box.createHorizontalGlue());

        getContentPane().add(bottomTools, BorderLayout.SOUTH);
        getContentPane().add(button3, BorderLayout.CENTER);

//        // Here's where we will add our GUI elements to the "contentPane" of this window.
//        JLabel greetingLabel = new JLabel("Hello, World!");
//        getContentPane().add(greetingLabel);
//
//        ImageIcon starIcon = new ImageIcon("star.png"); //https://www.veryicon.com/icons/holiday/free-christmas-flat/christmas-star-4.html
//        JLabel approvalLabel = new JLabel("Way to go!", starIcon, JLabel.RIGHT);
//        getContentPane().add(approvalLabel);
//
//        firstButton = new JButton("Press me.");
//        getContentPane().add(firstButton);
//
//        happyCheckbox = new JCheckBox("I'm happy.");
//        happyCheckbox.setSelected(true);
//        getContentPane().add(happyCheckbox);
//
//        knowItCheckbox = new JCheckBox("I know it.");
//        getContentPane().add(knowItCheckbox);
//
//        morningRB = new JRadioButton("Morning");
//        afternoonRB = new JRadioButton("Afternoon");
//        eveningRB = new JRadioButton("Evening");
//
//        ButtonGroup timeBG = new ButtonGroup();
//        timeBG.add(morningRB);
//        timeBG.add(afternoonRB);
//        timeBG.add(eveningRB);
//
//        morningRB.setSelected(true);
//        getContentPane().add(morningRB);
//        getContentPane().add(afternoonRB);
//        getContentPane().add(eveningRB);
//
//        nameField = new JTextField("What is your name?",30);
//        getContentPane().add(nameField);
//
//        commentArea = new JTextArea(10,30); // rows, cols
//        commentArea.setText("This is a comment.\nNifty, huh?");
//        //getContentPane().add(commentArea);
//        JScrollPane commentScroller = new JScrollPane(commentArea,
//                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        getContentPane().add(commentScroller);
//
//        String[] dwarfNames = {"Happy","Sleepy","Bashful","Sneezy","Grouchy","Dopey","Doc","Gimli"};
//        dwarfPicker = new JComboBox(dwarfNames);
//        dwarfPicker.setSelectedItem("Doc");
//        getContentPane().add(dwarfPicker);
    }
}
