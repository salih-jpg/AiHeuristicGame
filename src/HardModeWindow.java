import helper_classes.*;
import java.awt.*;
import  javax.swing.*;

public class HardModeWindow {
    private JFrame frame;

    public HardModeWindow() {
    frame = new JFrame("Hard Mode"); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(895, 484);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JLabel element1 = new JLabel("Your Text");
     element1.setBounds(19, 38, 106, 17);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element1.setForeground(Color.decode("#D9D9D9"));
     panel.add(element1);

     JLabel element2 = new JLabel("Your Text");
     element2.setBounds(154, 37, 106, 17);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setForeground(Color.decode("#D9D9D9"));
     panel.add(element2);

     JLabel element3 = new JLabel("Your Text");
     element3.setBounds(262, 37, 106, 17);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element3.setForeground(Color.decode("#D9D9D9"));
     panel.add(element3);

     JLabel element4 = new JLabel("Your Text");
     element4.setBounds(383, 39, 106, 17);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element4.setForeground(Color.decode("#D9D9D9"));
     panel.add(element4);

     JLabel element5 = new JLabel("Your Text");
     element5.setBounds(485, 37, 106, 17);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element5.setForeground(Color.decode("#D9D9D9"));
     panel.add(element5);

     JLabel element6 = new JLabel("Your Text");
     element6.setBounds(622, 37, 106, 17);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element6.setForeground(Color.decode("#D9D9D9"));
     panel.add(element6);

     JLabel element7 = new JLabel("Your Text");
     element7.setBounds(329, 128, 106, 17);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element7.setForeground(Color.decode("#D9D9D9"));
     panel.add(element7);

     JButton element8 = new JButton("Click Me");
     element8.setBounds(28, 237, 106, 29);
     element8.setBackground(Color.decode("#2e2e2e"));
     element8.setForeground(Color.decode("#D9D9D9"));
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element8.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element8.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element8, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element8);

     JButton element9 = new JButton("Click Me");
     element9.setBounds(180, 237, 106, 29);
     element9.setBackground(Color.decode("#2e2e2e"));
     element9.setForeground(Color.decode("#D9D9D9"));
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element9.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element9, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element9);

     JButton element10 = new JButton("Click Me");
     element10.setBounds(335, 235, 106, 29);
     element10.setBackground(Color.decode("#2e2e2e"));
     element10.setForeground(Color.decode("#D9D9D9"));
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element10.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element10, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element10);

     JButton element11 = new JButton("Click Me");
     element11.setBounds(476, 233, 106, 29);
     element11.setBackground(Color.decode("#2e2e2e"));
     element11.setForeground(Color.decode("#D9D9D9"));
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element11.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element11, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element11);

     JButton element12 = new JButton("Click Me");
     element12.setBounds(607, 231, 106, 29);
     element12.setBackground(Color.decode("#2e2e2e"));
     element12.setForeground(Color.decode("#D9D9D9"));
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element12.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element12.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element12, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element12);

     JButton element13 = new JButton("Click Me");
     element13.setBounds(759, 232, 106, 29);
     element13.setBackground(Color.decode("#2e2e2e"));
     element13.setForeground(Color.decode("#D9D9D9"));
     element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element13.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element13.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element13, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element13);
     
     frame.add(panel);
    }

    public void showWindow() {
        frame.setVisible(true);
    }
}
