package view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    JPanel headerPanel;
    JPanel mainPanel;
    JPanel membersPanel;

    public MainPanel() {
        setLayout(new BorderLayout());

        //intitialize panels
        headerPanel = new JPanel();
        mainPanel = new MessagesPanel();
//        inputPanel = new JPanel();
        membersPanel = new JPanel();

        //temp panels setup
        headerPanel.add(new JLabel("@placeholder"));

        membersPanel.add(new JLabel("users:"));
        for (int i = 0; i <  20; i++) {
            JButton jButton = new JButton("user" + (i > 9 ? i : "  "+i));
            jButton.setBackground(null);
            membersPanel.add(jButton);
        }
        membersPanel.setLayout(new BoxLayout(membersPanel, BoxLayout.Y_AXIS));

        headerPanel.setBackground(Color.decode(DebugColor.DEBUG_PRIMARY));
        membersPanel.setBackground(Color.decode(DebugColor.DEBUG_PRIMARY_DARK));

        //adding panels
        add(headerPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(membersPanel, BorderLayout.EAST);

        setVisible(true);
    }
}
