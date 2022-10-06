package view;

import javax.swing.*;
import java.awt.*;

public class InnerNavigationPanel extends JPanel {
    JPanel replacablePanel;
    JPanel userInfoPanel;

    public InnerNavigationPanel() {
        setLayout(new BorderLayout());

        //initialize panels
        replacablePanel = new ServerNavPanel();
        userInfoPanel = new JPanel();

        //temp panels setup
        JLabel jLabel = new JLabel("user#0000");
        jLabel.setForeground(Color.white);
        userInfoPanel.add(jLabel);

        userInfoPanel.setBackground(Color.decode(DebugColor.DEBUG_SECONDARY_DARK));

        //adding panels
        add(replacablePanel, BorderLayout.CENTER);
        add(userInfoPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
