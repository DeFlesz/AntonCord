package view;

import javax.swing.*;
import java.awt.*;

public class NavigationPanel extends JPanel {
    JPanel serverNavigation;
    JPanel innerNavigation;

    public NavigationPanel() {
        setLayout(new BorderLayout());

        //initialize panels
        serverNavigation = new JPanel();
        innerNavigation = new InnerNavigationPanel();

        //temp panels setup
        ImageIcon imageIcon = new ImageIcon("images/placeholder_server.png");
        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton();
            jButton.setIcon(imageIcon);
            jButton.setBackground(null);
            serverNavigation.add(jButton);
        }
        serverNavigation.setLayout(new BoxLayout(serverNavigation, BoxLayout.Y_AXIS));
//        innerNavigation.add(new JLabel("server nav"));

        serverNavigation.setBackground(Color.decode(DebugColor.DEBUG_SECONDARY_LIGHT));
//        innerNavigation.setBackground(Color.decode(DebugColor.DEBUG_SECONDARY_LIGHT));

        //adding panels
        add(serverNavigation, BorderLayout.WEST);
        add(innerNavigation, BorderLayout.EAST);

        setVisible(true);
    }
}
