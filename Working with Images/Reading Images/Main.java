import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String args[]) {
        System.out.println("Reading Images in Java\n");

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("media/MSFS2020_SS_1.png"));
            displayImage(img);
        } catch(IOException e) {
            System.out.println("ERROR:\n\t" + e);
        }
    }

    public static void displayImage(final BufferedImage image) {
        displayImage("Reading Images with Java", image);
    }

    public static void displayImage(final String windowTitle, final BufferedImage image) {
        new JFrame(windowTitle) {
            {
                final JLabel label = new JLabel("", new ImageIcon(image), 0);
                add(label);
                pack();
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
            }
        };
    }
}