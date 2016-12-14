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
import java.util.concurrent.TimeUnit;

/**
 * Created by HP on 7/12/2559.
 */
public class Items2 extends JComponent {

    BufferedImage fampic1 = ImageIO.read(new File("Pic//Livingroom//familypic1.png"));
    BufferedImage fampic2 = ImageIO.read(new File("Pic//Livingroom//familypic2.png"));
    BufferedImage fampic3 = ImageIO.read(new File("Pic//Livingroom//familypic3.png"));
    BufferedImage calender = ImageIO.read(new File("Pic//girlroom//calender.png")); //i15
    BufferedImage box1= ImageIO.read(new File("Pic//workingroom//boxx.png")); //i25
    BufferedImage win= ImageIO.read(new File("Pic//winner.jpg"));//i30

    JButton botton2 = new JButton(new ImageIcon(fampic1));
    JButton botton15 = new JButton(new ImageIcon(calender));
    JButton botton25 = new JButton(new ImageIcon(box1));
    JButton botton30 = new JButton(new ImageIcon(win));

    int x,y;

    Items2() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall2(JLayeredPane lp){
        botton2.setVisible(true);
        botton2.setOpaque(false);
        botton2.setContentAreaFilled(false);
        botton2.setFocusPainted(false);
        botton2.setBorder(BorderFactory.createEmptyBorder());
        botton2.setBounds(x,y,fampic1.getWidth(),fampic1.getHeight());
        botton2.addActionListener(new Items2.CustomActionListener());
        lp.add(botton2,new Integer(2));
    }

    public void ItemCall15(JLayeredPane lp){
        botton15.setVisible(true);
        botton15.setOpaque(false);
        botton15.setContentAreaFilled(false);
        botton15.setFocusPainted(false);
        botton15.setBorder(BorderFactory.createEmptyBorder());
        botton15.setBounds(x,y,calender.getWidth(),calender.getHeight());
        botton15.addActionListener(new Items2.CustomActionListener());
        lp.add(botton15,new Integer(2));
    }

    public void ItemCall25(JLayeredPane lp){
        botton25.setVisible(true);
        botton25.setOpaque(false);
        botton25.setContentAreaFilled(false);
        botton25.setFocusPainted(false);
        botton25.setBorder(BorderFactory.createEmptyBorder());
        botton25.setBounds(x,y,box1.getWidth(),box1.getHeight());
        botton25.addActionListener(new Items2.CustomActionListener());
        lp.add(botton25,new Integer(3));
    }

    public void ItemCall30(JLayeredPane lp){
        botton30.setVisible(true);
        botton30.setOpaque(false);
        botton30.setContentAreaFilled(false);
        botton30.setFocusPainted(false);
        botton30.setBorder(BorderFactory.createEmptyBorder());
        botton30.setBounds(x,y,win.getWidth(),win.getHeight());
        botton30.addActionListener(new Items2.CustomActionListener());
        lp.add(botton30,new Integer(3));
    }public void ChangePicState2(JLayeredPane lp){
        botton2.setIcon(new ImageIcon(fampic2));
    }

    public void ChangePicState3(JLayeredPane lp){
        botton2.setIcon(new ImageIcon(fampic3));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == 2) {

                AudioPlayer PM = AudioPlayer.player;
                AudioStream MBG = null;
                try {
                    MBG = new AudioStream(new FileInputStream("Sound//household042.wav"));

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                PM.start(MBG);
                main.nextState();
            }else if(main.getState3() == 0){
                main.nextState3();
            }else if(main.getState4() == 0 ){
                main.nextState4();
            }else if ( main.getState5()  == 3 || main.getState5() == 4 || main.getState5() ==  8){
                if (main.getState5() ==  8){
                    AudioPlayer PM9= AudioPlayer.player;
                    AudioStream MBG9 = null;
                    try {
                        MBG9 = new AudioStream(new FileInputStream("Sound//creaky_door_4.wav"));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PM9.start(MBG9);
                }
                main.nextState5();
            }
        }
    }
}
