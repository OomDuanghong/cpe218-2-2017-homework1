import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 12/11/2559.
 */
public class Items extends JComponent{

    BufferedImage picmesseges = ImageIO.read(new File("C://pic//room1//messeges.png"));
    JButton botton = new JButton(new ImageIcon(picmesseges));
    private int x,y;

    Items() throws IOException {
    }

    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void ItemCall(JLayeredPane lp){

        botton.setVisible(true);
        botton.setOpaque(false);
        botton.setContentAreaFilled(false);
        botton.setFocusPainted(false);
        botton.setBorder(BorderFactory.createEmptyBorder());
        botton.setBounds(x,y,picmesseges.getWidth(),picmesseges.getHeight());
        botton.addActionListener(new CustomActionListener());
        lp.add(botton,new Integer(2));

    }

    public void removeItem(JLayeredPane lp,JButton b){
        lp.remove(b);
    }

    class CustomActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked");
            if(main.getState() == 0) {
                main.nextState();
            }
        }
    }

}
