package Gui;
import GuessingGame.theGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainFrame extends JFrame implements ActionListener {
    int count = 0;
    JLabel label;
    JPanel panel;
    JButton button;
    public mainFrame() {
        initialize();
    }
    public void initialize(){
        button = new JButton("1. Number Guessing Game ");
        label = new JLabel("Number of clicks: "+count);
        panel = new JPanel();
        
        panel.add(label);
        panel.add(button);
        panel.setLayout(new GridLayout(5,5));
        button.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Java Games");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new mainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+ count);
        theGame firstGame = new theGame();
        firstGame.main();
    }
}

