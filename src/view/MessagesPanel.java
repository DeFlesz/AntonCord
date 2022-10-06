package view;

import javax.swing.*;
import java.awt.*;

public class MessagesPanel extends JPanel {
    JPanel messagesPanel;
    JPanel inputPanel;
    
    public MessagesPanel() {
        setLayout(new BorderLayout());

        //initialize panels
        messagesPanel = new JPanel();
        inputPanel = new JPanel();

        //temp panels setup
        messagesPanel.setBackground(Color.decode(DebugColor.DEBUG_PRIMARY_LIGHT));
        for (int i = 0; i < 50; i++) {
            messagesPanel.add(new JLabel("message test " + i));
        }
        messagesPanel.setLayout(new BoxLayout(messagesPanel, BoxLayout.Y_AXIS));

        inputPanel.setBackground(Color.decode(DebugColor.DEBUG_PRIMARY));
        inputPanel.add(new JTextField("message to be sent"));

        //add panels
        add(messagesPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
