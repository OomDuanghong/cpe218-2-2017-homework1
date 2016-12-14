import javafx.stage.Stage;
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
 * Created by HP on 12/11/2559.
 */
public class Items3 extends JComponent{

    BufferedImage note1 = ImageIO.read(new File("Pic//Livingroom//noteInLivingroom.png")); //i3
    BufferedImage note2 = ImageIO.read(new File("Pic//mother's room//note.png"));  //i7 not open
    BufferedImage car = ImageIO.read(new File("Pic//sonroom//car.png")); //i12
    BufferedImage ghost2 = ImageIO.read(new File("Pic//girlroom//ghostwithrope.png")); //i20
    BufferedImage Bigpic = ImageIO.read(new File("Pic//workingroom//fatherpicBig.png")); //i24

    JButton botton3 = new JButton(new ImageIcon(note1));
    JButton botton7 = new JButton(new ImageIcon(note2));
    JButton botton12 = new JButton(new ImageIcon(car));
    JButton botton20 = new JButton(new ImageIcon(ghost2));
    JButton botton24 = new JButton(new ImageIcon(Bigpic));

    private int x,y;

    Items3() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall3(JLayeredPane lp){
        botton3.setVisible(true);
        botton3.setOpaque(false);
        botton3.setContentAreaFilled(false);
        botton3.setFocusPainted(false);
        botton3.setBorder(BorderFactory.createEmptyBorder());
        botton3.setBounds(x,y,note1.getWidth(),note1.getHeight());
        botton3.addActionListener(new Items3.CustomActionListener());
        lp.add(botton3,new Integer(3));
    }

    public void ItemCall7(JLayeredPane lp) throws IOException {
        botton7.setVisible(true);
        botton7.setOpaque(false);
        botton7.setContentAreaFilled(false);
        botton7.setFocusPainted(false);
        botton7.setBorder(BorderFactory.createEmptyBorder());
        botton7.setBounds(x,y,note2.getWidth(),note2.getHeight());
        botton7.addActionListener(new Items3.CustomActionListener());
        lp.add(botton7,new Integer(2));
    }

    public void ItemCall12(JLayeredPane lp) throws IOException {
        botton12.setVisible(true);
        botton12.setOpaque(false);
        botton12.setContentAreaFilled(false);
        botton12.setFocusPainted(false);
        botton12.setBorder(BorderFactory.createEmptyBorder());
        botton12.setBounds(x,y,car.getWidth(),car.getHeight());
        botton12.addActionListener(new Items3.CustomActionListener());
        lp.add(botton12,new Integer(2));
    }

    public void ItemCall20(JLayeredPane lp){
        botton20.setVisible(true);
        botton20.setOpaque(false);
        botton20.setContentAreaFilled(false);
        botton20.setFocusPainted(false);
        botton20.setBorder(BorderFactory.createEmptyBorder());
        botton20.setBounds(x,y,ghost2.getWidth(),ghost2.getHeight());
        botton20.addActionListener(new Items3.CustomActionListener());
        lp.add(botton20,new Integer(3));
    }

    public void ItemCall24(JLayeredPane lp){
        botton24.setVisible(true);
        botton24.setOpaque(false);
        botton24.setContentAreaFilled(false);
        botton24.setFocusPainted(false);
        botton24.setBorder(BorderFactory.createEmptyBorder());
        botton24.setBounds(x,y,Bigpic.getWidth(),Bigpic.getHeight());
        botton24.addActionListener(new Items3.CustomActionListener());
        lp.add(botton24,new Integer(3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if (main.getState() == 1) {

                AudioPlayer PM = AudioPlayer.player;
                AudioStream MBG = null;
                try {
                    MBG = new AudioStream(new FileInputStream("Sound//pageflip.wav"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                PM.start(MBG);

                main.nextState();
            } else if (main.getState2() == 1 || main.getState2() == 2 || main.getState2() == 3 ) {
                if (main.getState2() == 1){
                    AudioPlayer PM = AudioPlayer.player;
                    AudioStream MBG = null;
                    try {
                        MBG = new AudioStream(new FileInputStream("Sound//pageflip.wav"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM.start(MBG);
                }else if (main.getState2() == 2){
                    AudioPlayer PM2 = AudioPlayer.player;
                    AudioStream MBG2 = null;
                    try {
                        MBG2 = new AudioStream(new FileInputStream("Sound//ScaryGirl.wav"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM2.start(MBG2);
                }
                main.nextState2();
            } else if (main.getState3() == 1) {
                main.nextState3();
            } else if (main.getState4() == 3) {
                main.nextState4();
            } else if (main.getState5() == 1 || main.getState5() == 2) {
                main.nextState5();
            }
        }
    }
}
