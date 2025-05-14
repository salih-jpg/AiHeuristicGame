import helper_classes.*;
import java.awt.*;
import  javax.swing.*;

public class EasyModeWindow {
    private JFrame frame;

    public EasyModeWindow() {
        frame = new JFrame("Easy Mode");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sadece bu pencereyi kapatır
        frame.setSize(895, 484);
        frame.setLocationRelativeTo(null); // Ekran ortasına getir

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

        JLabel element5 = new JLabel("Your Text");
        element5.setBounds(41, 51, 106, 17);
        element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element5.setForeground(Color.decode("#D9D9D9"));
        panel.add(element5);

        JLabel element6 = new JLabel("Your Text");
        element6.setBounds(264, 53, 106, 17);
        element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element6.setForeground(Color.decode("#D9D9D9"));
        panel.add(element6);

        JLabel element7 = new JLabel("Your Text");
        element7.setBounds(505, 56, 106, 17);
        element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element7.setForeground(Color.decode("#D9D9D9"));
        panel.add(element7);

        JLabel element8 = new JLabel("Your Text");
        element8.setBounds(267, 170, 106, 17);
        element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element8.setForeground(Color.decode("#D9D9D9"));
        panel.add(element8);

        JButton element9 = new JButton("Click Me");
        element9.setBounds(89, 283, 106, 29);
        element9.setBackground(Color.decode("#2e2e2e"));
        element9.setForeground(Color.decode("#D9D9D9"));
        element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        element9.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(element9, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(element9);

        JButton element10 = new JButton("Click Me");
        element10.setBounds(289, 281, 106, 29);
        element10.setBackground(Color.decode("#2e2e2e"));
        element10.setForeground(Color.decode("#D9D9D9"));
        element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        element10.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(element10, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(element10);

        JButton element11 = new JButton("Click Me");
        element11.setBounds(475, 277, 106, 29);
        element11.setBackground(Color.decode("#2e2e2e"));
        element11.setForeground(Color.decode("#D9D9D9"));
        element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        element11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        element11.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(element11, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(element11);

        frame.add(panel);
    }

    public void showWindow() {
        frame.setVisible(true);
    }
}
