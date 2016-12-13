import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 13/12/2559.
 */
public class Timec {

    BufferedImage zero = ImageIO.read(new File("C://pic//time//zero.png"));
    BufferedImage one = ImageIO.read(new File("C://pic//time//one.png"));
    BufferedImage two = ImageIO.read(new File("C://pic//time//two.png"));
    BufferedImage three = ImageIO.read(new File("C://pic//time//three.png"));
    BufferedImage four = ImageIO.read(new File("C://pic//time//four.png"));
    BufferedImage five = ImageIO.read(new File("C://pic//time//five.png"));
    BufferedImage six = ImageIO.read(new File("C://pic//time//six.png"));
    BufferedImage seven = ImageIO.read(new File("C://pic//time//seven.png"));
    BufferedImage eight = ImageIO.read(new File("C://pic//time//eight.png"));
    BufferedImage nine = ImageIO.read(new File("C://pic//time//nine.png"));

    Icon zeroim = new ImageIcon(zero);
    Icon oneim = new ImageIcon(one);
    Icon twoim = new ImageIcon(two);
    Icon threeim = new ImageIcon(three);
    Icon fourim = new ImageIcon(four);
    Icon fiveim = new ImageIcon(five);
    Icon sixim = new ImageIcon(six);
    Icon sevenim = new ImageIcon(seven);
    Icon eightim = new ImageIcon(eight);
    Icon nineim = new ImageIcon(nine);

    JButton sec1 = new JButton();
    JButton sec2 = new JButton();
    JButton min = new JButton();

    private int x,y;

    public Timec() throws IOException {

    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void timeCall(JLayeredPane lp){
        setxy(1,1);

        sec1.setIcon(zeroim);
        sec2.setIcon(zeroim);
        min.setIcon(zeroim);

        sec1.setVisible(true);
        sec1.setOpaque(false);
        sec1.setContentAreaFilled(false);
        sec1.setFocusPainted(false);
        sec1.setBorder(BorderFactory.createEmptyBorder());
        sec1.setBounds(x+(zero.getWidth()*2),y,zero.getWidth(),zero.getHeight());
        lp.add(sec1,new Integer(3));

        sec2.setVisible(true);
        sec2.setOpaque(false);
        sec2.setContentAreaFilled(false);
        sec2.setFocusPainted(false);
        sec2.setBorder(BorderFactory.createEmptyBorder());
        sec2.setBounds(x+zero.getWidth(),y,zero.getWidth(),zero.getHeight());
        lp.add(sec2,new Integer(3));

        min.setVisible(true);
        min.setOpaque(false);
        min.setContentAreaFilled(false);
        min.setFocusPainted(false);
        min.setBorder(BorderFactory.createEmptyBorder());
        min.setBounds(x,y,zero.getWidth(),zero.getHeight());
        lp.add(min,new Integer(3));
    }

    public void countTime(JLayeredPane lp,int m,int s2,int s1){
        if(s1==0){
            sec1.setIcon(zeroim);
        }else if(s1==1){
            sec1.setIcon(oneim);
        }else if(s1==2){
            sec1.setIcon(twoim);
        }else if(s1==3){
            sec1.setIcon(threeim);
        }else if(s1==4){
            sec1.setIcon(fourim);
        }else if(s1==5){
            sec1.setIcon(fiveim);
        }else if(s1==6){
            sec1.setIcon(sixim);
        }else if(s1==7){
            sec1.setIcon(sevenim);
        }else if(s1==8){
            sec1.setIcon(eightim);
        }else if(s1==9){
            sec1.setIcon(nineim);
        }

        if(s2==0){
            sec2.setIcon(zeroim);
        }if(s2==1){
            sec2.setIcon(oneim);
        }if(s2==2){
            sec2.setIcon(twoim);
        }if(s2==3){
            sec2.setIcon(threeim);
        }if(s2==4){
            sec2.setIcon(fourim);
        }if(s2==5){
            sec2.setIcon(fiveim);
        }if(s2==6){
            sec2.setIcon(sixim);
        }if(s2==7){
            sec2.setIcon(sevenim);
        }if(s2==8){
            sec2.setIcon(eightim);
        }if(s2==9){
            sec2.setIcon(nineim);
        }

        if(m==0){
            min.setIcon(zeroim);
        }if(m==1){
            min.setIcon(oneim);
        }if(m==2){
            min.setIcon(twoim);
        }if(m==3){
            min.setIcon(threeim);
        }if(m==4){
            min.setIcon(fourim);
        }if(m==5){
            min.setIcon(fiveim);
        }if(m==6){
            min.setIcon(sixim);
        }if(m==7){
            min.setIcon(sevenim);
        }if(m==8){
            min.setIcon(eightim);
        }if(m==9){
            min.setIcon(nineim);
        }

    }
}
