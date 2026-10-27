import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {

    // Declare Variables
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JLabel imageLabel;
    JPanel radioPanel;
    ButtonGroup group;

    // Scale your images down (e.g., width: 250, height: 200 pixels)
    ImageIcon birdIcon = new ImageIcon(new ImageIcon("images/bird.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
    ImageIcon catIcon = new ImageIcon(new ImageIcon("images/cat.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
    ImageIcon dogIcon = new ImageIcon(new ImageIcon("images/dog.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
    ImageIcon rabbitIcon = new ImageIcon(new ImageIcon("images/rabbit.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
    ImageIcon pigIcon = new ImageIcon(new ImageIcon("images/pig.jpg").getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));

    // Panel for radio buttons
    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 360);
        setLayout(new BorderLayout());

        radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add to group so only one is selected
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add listener
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // Default image
        imageLabel = new JLabel(pigIcon);
        pigButton.setSelected(true);

        add(radioPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            imageLabel.setIcon(birdIcon);
            JOptionPane.showMessageDialog(this, "You selected: Bird");
        } else if (e.getSource() == catButton) {
            imageLabel.setIcon(catIcon);
            JOptionPane.showMessageDialog(this, "You selected: Cat");
        } else if (e.getSource() == dogButton) {
            imageLabel.setIcon(dogIcon);
            JOptionPane.showMessageDialog(this, "You selected: Dog");
        } else if (e.getSource() == rabbitButton) {
            imageLabel.setIcon(rabbitIcon);
            JOptionPane.showMessageDialog(this, "You selected: Rabbit");
        } else if (e.getSource() == pigButton) {
            imageLabel.setIcon(pigIcon);
            JOptionPane.showMessageDialog(this, "You selected: Pig");
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
        }
