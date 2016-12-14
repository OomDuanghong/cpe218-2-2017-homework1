import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by oom on 12/15/2016 AD.
 */
public class Items6 extends JComponent {
    BufferedImage chair = ImageIO.read(new File("Pic//girlroom//chair1.png")); //i16
    BufferedImage chair1 = ImageIO.read(new File("Pic//girlroom//chair2.png"));
    BufferedImage Dadpic = ImageIO.read(new File("Pic//workingroom//pic1.png")); // i21
    BufferedImage picdown = ImageIO.read(new File("Pic//workingroom//pic2.png")); //i27

    JButton botton16 = new JButton(new ImageIcon(chair));
    JButton botton21 = new JButton(new ImageIcon(Dadpic));
    JButton botton27 = new JButton(new ImageIcon(picdown));

    private int x, y;

    Items6() throws IOException {
    }

    public void setxy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void ItemCall16(JLayeredPane lp) {
        botton16.setVisible(true);
        botton16.setOpaque(false);
        botton16.setContentAreaFilled(false);
        botton16.setFocusPainted(false);
        botton16.setBorder(BorderFactory.createEmptyBorder());
        botton16.setBounds(x, y, chair.getWidth(), chair.getHeight());
        botton16.addActionListener(new Items6.CustomActionListener());
        lp.add(botton16, new Integer(2));
    }

    public void ItemCall21(JLayeredPane lp) {
        botton21.setVisible(true);
        botton21.setOpaque(false);
        botton21.setContentAreaFilled(false);
        botton21.setFocusPainted(false);
        botton21.setBorder(BorderFactory.createEmptyBorder());
        botton21.setBounds(x, y, Dadpic.getWidth(), Dadpic.getHeight());
        botton21.addActionListener(new Items6.CustomActionListener());
        lp.add(botton21, new Integer(2));
    }

    public void ItemCall27(JLayeredPane lp) {
        botton27.setVisible(true);
        botton27.setOpaque(false);
        botton27.setContentAreaFilled(false);
        botton27.setFocusPainted(false);
        botton27.setBorder(BorderFactory.createEmptyBorder());
        botton27.setBounds(x, y, picdown.getWidth(), picdown.getHeight());
        botton27.addActionListener(new Items6.CustomActionListener());
        lp.add(botton27, new Integer(2));
    }

    public void ChangePicState5(JLayeredPane lp){
        botton16.setIcon(new ImageIcon(chair1));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState4() == 1){
                main.nextState4();
            }else if (main.getState5() == 0 || main.getState5() == 6){
                main.nextState5();
            }
        }
    }
}
