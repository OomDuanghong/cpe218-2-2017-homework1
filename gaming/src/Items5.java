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
public class Items5 extends JComponent {
    BufferedImage clock = ImageIO.read(new File("Pic//Livingroom//clock.png"));  //i4
    BufferedImage books = ImageIO.read(new File("Pic//mother's room//books.png"));  //i8
    BufferedImage blood2 = ImageIO.read(new File("Pic//sonroom//bloodonthefloor.png")); //i13
    BufferedImage mirror = ImageIO.read(new File("Pic//girlroom//mirrorbase.png")); //i18
    BufferedImage radio = ImageIO.read(new File("Pic//workingroom//radio.png")); //i22
    BufferedImage key = ImageIO.read(new File("Pic//key.png")); //i28

    JButton botton4 = new JButton(new ImageIcon(clock));
    JButton botton8 = new JButton(new ImageIcon(books));
    JButton botton13 = new JButton(new ImageIcon(blood2));
    JButton botton18 = new JButton(new ImageIcon(mirror));
    JButton botton22 = new JButton(new ImageIcon(radio));
    JButton botton28 = new JButton(new ImageIcon(key));

    private int x,y;

    Items5() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall4(JLayeredPane lp){
        botton4.setVisible(true);
        botton4.setOpaque(false);
        botton4.setContentAreaFilled(false);
        botton4.setFocusPainted(false);
        botton4.setBorder(BorderFactory.createEmptyBorder());
        botton4.setBounds(x,y,clock.getWidth(),clock.getHeight());
        botton4.addActionListener(new Items5.CustomActionListener());
        lp.add(botton4,new Integer(2));
    }

    public void ItemCall8(JLayeredPane lp){
        botton8.setVisible(true);
        botton8.setOpaque(false);
        botton8.setContentAreaFilled(false);
        botton8.setFocusPainted(false);
        botton8.setBorder(BorderFactory.createEmptyBorder());
        botton8.setBounds(x,y,books.getWidth(),books.getHeight());
        botton8.addActionListener(new Items5.CustomActionListener());
        lp.add(botton8,new Integer(2));
    }

    public void ItemCall13(JLayeredPane lp){
        botton13.setVisible(true);
        botton13.setOpaque(false);
        botton13.setContentAreaFilled(false);
        botton13.setFocusPainted(false);
        botton13.setBorder(BorderFactory.createEmptyBorder());
        botton13.setBounds(x,y,blood2.getWidth(),blood2.getHeight());
        botton13.addActionListener(new Items5.CustomActionListener());
        lp.add(botton13,new Integer(2));
    }

    public void ItemCall18(JLayeredPane lp){
        botton18.setVisible(true);
        botton18.setOpaque(false);
        botton18.setContentAreaFilled(false);
        botton18.setFocusPainted(false);
        botton18.setBorder(BorderFactory.createEmptyBorder());
        botton18.setBounds(x,y,mirror.getWidth(),mirror.getHeight());
        botton18.addActionListener(new Items5.CustomActionListener());
        lp.add(botton18,new Integer(2));
    }

    public void ItemCall22(JLayeredPane lp){
        botton22.setVisible(true);
        botton22.setOpaque(false);
        botton22.setContentAreaFilled(false);
        botton22.setFocusPainted(false);
        botton22.setBorder(BorderFactory.createEmptyBorder());
        botton22.setBounds(x,y,radio.getWidth(),radio.getHeight());
        botton22.addActionListener(new Items5.CustomActionListener());
        lp.add(botton22,new Integer(2));
    }

    public void ItemCall28(JLayeredPane lp){
        botton28.setVisible(true);
        botton28.setOpaque(false);
        botton28.setContentAreaFilled(false);
        botton28.setFocusPainted(false);
        botton28.setBorder(BorderFactory.createEmptyBorder());
        botton28.setBounds(x,y,key.getWidth(),key.getHeight());
        botton28.addActionListener(new Items5.CustomActionListener());
        lp.add(botton28,new Integer(3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState() == 3 || main.getState2() == 3 || main.getState2() == 4 ){
                if (main.getState() == 3){
                    AudioPlayer PM = AudioPlayer.player;
                    AudioData MD;
                    AudioStream MBG = null;
                    try {
                        MBG = new AudioStream(new FileInputStream("Sound//clock-tick.wav"));

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM.start(MBG);
                }else if (main.getState2() == 4){
                    AudioPlayer PM = AudioPlayer.player;
                    AudioData MD;
                    AudioStream MBG = null;
                    try {
                        MBG = new AudioStream(new FileInputStream("Sound//Toy.wav"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM.start(MBG);
                }
                main.nextState();
                main.nextState2();
            }else if( main.getState3() == 2 ){
                main.nextState3();
            }else if (main.getState4() == 2 ){
                main.getState4();
            }else if ( main.getState5() == 5 || main.getState5() == 7 ){
                if(main.getState5() == 5){
                    AudioPlayer PM7= AudioPlayer.player;
                    AudioStream MBG7 = null;
                    try {
                        MBG7 = new AudioStream(new FileInputStream("Sound//voorheez3.wav"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM7.start(MBG7);
                }
                main.nextState5();
            }
        }
    }


}
