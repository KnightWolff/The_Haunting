import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Sprite {

    private static String file1;
    int x,y, width, height;
    double dx, dy;
    int speed;

    BufferedImage spriteSheet;
    private static int tileW, tileH;
    public String file;
    boolean remove = false;
    Board board;


    public Sprite(int x, int y, int width, int height, int speed, int tileW, int tileH, String file, Board board){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.tileW = tileW;
        this.tileH = tileH;
        this.file = file;
        this.board = board;
    }

    public abstract void paint(Graphics g);

    public void bounce(){
        double nextLeft = x + dx;
        double nextRight = (x+width) + dx;
        double nextTop = y+dy;
        double nextBottom = (y + height) + dy;


        if(nextTop < 0 || nextBottom > (double) board.getHeight()){
            dy*=-1;
        }

        if(nextLeft < 0 || nextRight > (double)board.getWidth()){
            dx*=-1;
        }
    }

    public BufferedImage getSprite(int xGrid, int yGrid, BufferedImage img) {
                spriteSheet = img;
        return spriteSheet.getSubimage(xGrid * tileW, yGrid * tileH, tileW, tileH);
    }

}
