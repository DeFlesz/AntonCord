package view;

import javax.swing.*;
import java.awt.*;

public class AntonCordFrame extends JFrame {
    JPanel navigationPanel;
    MainPanel mainPanel;


    public AntonCordFrame(int width, int height){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //initialize panels
        navigationPanel = new NavigationPanel();
        mainPanel = new MainPanel();

        //temp panel setup
//        navigationPanel.add(new JLabel("nawigacja nawigacja nawigacja "));

//        mainPanel.add(new JLabel("treść"));

        //adding swing
        add(navigationPanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);

        //setters
        setTitle("AntonCord");
        setSize(width, height);
        setMinimumSize(new Dimension(width, height));
        setVisible(true);
    }
}
