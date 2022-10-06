package view;

import javax.swing.*;
import java.awt.*;

public class ServerNavPanel extends JPanel {
    JPanel serverBannerPanel;
    JPanel serverNavPanel;

    public ServerNavPanel() {
        setLayout(new BorderLayout());

        //initialize panels
        serverBannerPanel = new JPanel();
        serverNavPanel = new JPanel();

        //temp panels setup
        JLabel serverNameLabel = new JLabel("@server_name");
        serverNameLabel.setForeground(Color.white);
        serverBannerPanel.add(serverNameLabel);
        serverBannerPanel.setBackground(Color.decode(DebugColor.DEBUG_SECONDARY_DARK));

        JLabel channelCategoryLabel = new JLabel("MAIN CATEGORY");
        channelCategoryLabel.setForeground(Color.white);
        serverNavPanel.add(channelCategoryLabel);
        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton(" #text_channel"+i);
            jButton.setForeground(Color.white);
            jButton.setBackground(null);
            serverNavPanel.add(jButton);
        }
        serverNavPanel.setLayout(new BoxLayout(serverNavPanel, BoxLayout.Y_AXIS));
        serverNavPanel.setBackground(Color.decode(DebugColor.DEBUG_SECONDARY));

        add(serverBannerPanel, BorderLayout.NORTH);
        add(serverNavPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
