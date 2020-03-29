import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Sprite {
    BufferedImage    img;

    {
        try {
            img = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int tileW = 95, tileH = 92;

    public Player(int x, int y, int width, int height, int speed, int tileW, int tileH, String file, Board board){
        super(x, y, width, height, speed, tileW,tileH,file, board);
    }

    @Override
    public void paint(Graphics g) {
            g.drawImage(img, x,y,null);
        }

    }

