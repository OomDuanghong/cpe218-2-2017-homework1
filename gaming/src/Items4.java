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
public class Items4 extends JComponent {

    BufferedImage blood = ImageIO.read(new File("Pic//mother's room//blood.png"));  //i6
    BufferedImage ghost1 = ImageIO.read(new File("Pic//mother's room//ghost.png"));  //i10
    BufferedImage crackedW = ImageIO.read(new File("Pic//sonroom//crackedDisplay.png")); //i14
    BufferedImage basebox = ImageIO.read(new File("Pic//workingroom//boxx0.png")); //i23
    BufferedImage end = ImageIO.read(new File("Pic//end.png")); //i29

    JButton botton6 = new JButton(new ImageIcon(blood));
    JButton botton10 = new JButton(new ImageIcon(ghost1));
    JButton botton14 = new JButton(new ImageIcon(crackedW));
    JButton botton23 = new JButton(new ImageIcon(basebox));
    JButton botton29 = new JButton(new ImageIcon(end));

    private int x,y;

    Items4() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }


    public void ItemCall6(JLayeredPane lp){
        botton6.setVisible(true);
        botton6.setOpaque(false);
        botton6.setContentAreaFilled(false);
        botton6.setFocusPainted(false);
        botton6.setBorder(BorderFactory.createEmptyBorder());
        botton6.setBounds(x,y,blood.getWidth(),blood.getHeight());
        botton6.addActionListener(new Items4.CustomActionListener());
        lp.add(botton6,new Integer(2));
    }

    public void ItemCall10(JLayeredPane lp){
        botton10.setVisible(true);
        botton10.setOpaque(false);
        botton10.setContentAreaFilled(false);
        botton10.setFocusPainted(false);
        botton10.setBorder(BorderFactory.createEmptyBorder());
        botton10.setBounds(x,y,ghost1.getWidth(),ghost1.getHeight());
        botton10.addActionListener(new Items4.CustomActionListener());
        lp.add(botton10,new Integer(2));
    }

    public void ItemCall14(JLayeredPane lp){
        botton14.setVisible(true);
        botton14.setOpaque(false);
        botton14.setContentAreaFilled(false);
        botton14.setFocusPainted(false);
        botton14.setBorder(BorderFactory.createEmptyBorder());
        botton14.setBounds(x,y,crackedW.getWidth(),crackedW.getHeight());
        botton14.addActionListener(new Items4.CustomActionListener());
        lp.add(botton14,new Integer(3));
    }

    public void ItemCall23(JLayeredPane lp){
        botton23.setVisible(true);
        botton23.setOpaque(false);
        botton23.setContentAreaFilled(false);
        botton23.setFocusPainted(false);
        botton23.setBorder(BorderFactory.createEmptyBorder());
        botton23.setBounds(x,y,basebox.getWidth(),basebox.getHeight());
        botton23.addActionListener(new Items4.CustomActionListener());
        lp.add(botton23,new Integer(2));
    }

    public void ItemCall29(JLayeredPane lp){
        botton29.setVisible(true);
        botton29.setOpaque(false);
        botton29.setContentAreaFilled(false);
        botton29.setFocusPainted(false);
        botton29.setBorder(BorderFactory.createEmptyBorder());
        botton29.setBounds(x,y,end.getWidth(),end.getHeight());
        botton29.addActionListener(new Items4.CustomActionListener());
        lp.add(botton29,new Integer(4));
    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if( main.getState2() == 3) {
                main.nextState2();
            }else if ( main.getState3() == 4 || main.getState3() == 3 ){
                main.nextState3();
            }else if ( main.getState5() == 2){
                main.nextState5();
            }
        }
    }
}
