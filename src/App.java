import  helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class App extends  JFrame{
        public static void main(String[] args) {

     JFrame frame = new JFrame("Game");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(1006, 544);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton buttonEasy = new JButton("Easy Mode (3)");
    buttonEasy.setBounds(230, 176, 188, 177);
    buttonEasy.setBackground(Color.decode("#2e2e2e"));
    buttonEasy.setForeground(Color.decode("#D9D9D9"));
    buttonEasy.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 22));
    buttonEasy.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    buttonEasy.setFocusPainted(false);
    
    buttonEasy.addActionListener(e -> System.out.println("selam"));
     OnClickEventHelper.setOnClickColor(buttonEasy, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(buttonEasy);

     JButton buttonHard = new JButton("Hard Mode (6)");
    buttonHard.setBounds(548, 175, 188, 177);
    buttonHard.setBackground(Color.decode("#2e2e2e"));
    buttonHard.setForeground(Color.decode("#D9D9D9"));
    buttonHard.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 22));
    buttonHard.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    buttonHard.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(buttonHard, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(buttonHard);

     JLabel Header = new JLabel("Choose the Game Mode!");
     Header.setBounds(330, 72, 500, 34);
     Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
     Header.setForeground(Color.decode("#D9D9D9"));
     panel.add(Header);

     frame.add(panel);
     frame.setVisible(true);

  }
        
}
