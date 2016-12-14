import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by HP on 30/11/2559.
 */
public class Background extends JFrame {

    BufferedImage img = ImageIO.read(new File("Pic//coverofgame.jpg"));
    BufferedImage img1 = ImageIO.read(new File("Pic//Livingroom//BGlivingroom.jpg"));
    BufferedImage img2 = ImageIO.read(new File("Pic//mother's room//BGmother'sroom1.jpg"));
    BufferedImage img3 = ImageIO.read(new File("Pic//sonroom//BGsonroom1.jpg"));
    BufferedImage img4 = ImageIO.read(new File("Pic//girlroom//BGgirlroom1.jpg"));
    BufferedImage img5 = ImageIO.read(new File("Pic//workingroom//BGworkingroom1.jpg"));

    private int width;
    private int height;

    JLayeredPane layeredPane = getLayeredPane();
    JLabel lbl = new JLabel();

    public Background() throws IOException {

        width = img1.getWidth();
        height = img1.getHeight();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - width) / 2);
        int y = (int) ((dimension.getHeight() - height) / 2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x,y,width,height);
        setResizable(false);
        setTitle("Detect Ghost");
        getContentPane().setBackground(Color.black);

        layeredPane.setBackground(Color.black);
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("Pic//pointer.png").getImage(),new Point(0,0),"custom cursor"));

        // Panel 1

        ImageIcon icon = new ImageIcon(img);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,img1.getWidth(),img1.getHeight());
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1,new Integer(1));
    }

    public void nextStage(){
        ImageIcon icon = new ImageIcon(img1);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,width,height);
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1,new Integer(1));
    }


    public void nextStage1() throws IOException {
        ImageIcon icon = new ImageIcon(img2);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,width,height);
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1,new Integer(1));
    }

    public void nextStage2() throws IOException {
        ImageIcon icon = new ImageIcon(img3);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, width, height);
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1, new Integer(1));
    }

    public void nextStage3() throws IOException {
        ImageIcon icon = new ImageIcon(img4);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, width, height);
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1, new Integer(1));
    }

    public void nextStage4() throws IOException {
        ImageIcon icon = new ImageIcon(img5);
        lbl.setIcon(icon);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, width, height);
        panel1.setOpaque(false);
        panel1.add(lbl);
        layeredPane.add(panel1, new Integer(1));
    }
}
