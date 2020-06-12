import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel{

    public GUI() {

        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        mainPanel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        mainPanel.setBackground(Color.LIGHT_GRAY);
        JLabel start = new JLabel("START");
        gbc.gridx = 6;
        gbc.gridy = 6;
        layout.setConstraints(start, gbc);
        mainPanel.add(start);




        frame.add(mainPanel);
        frame.setTitle("Monopoly");
        frame.setSize(1400, 900  );
        frame.setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
