import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Sprite {
    BufferedImage img;
    Game game;

    {
        try {
            img = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Player(int x, int y, int width, int height, int speed, int tileW, int tileH, String file, Board board, Game game){
        super(x, y, width, height, speed, tileW,tileH,file, board);
        this.game = game;
    }

    @Override
    public void move(){
        if(game.isShiftPress() == false){
            if(game.isRightPress() == true){
                x+=speed;
            }
            if(game.isLeftPress() == true){
                x-=speed;
            }
            if(game.isUpPress() == true){
                y-=speed;
            }
            if(game.isDownPress() == true){
                y+=speed;
            }
            else{
                y+=0;
                x+=0;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
            g.drawImage(img, x,y,null);
        }

    }

