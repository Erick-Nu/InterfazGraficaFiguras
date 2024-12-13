import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Figuras Geometricas");
        Screem1 screem1 = new Screem1();
        JScrollPane scrollPane = new JScrollPane(screem1.mainPanel);
        // Scroll
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.setContentPane(scrollPane);

        // Configurar el JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(1024, 768));
        frame.pack();
    }
}

