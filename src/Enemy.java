import java.awt.*;

public class Enemy extends Sprite {
    public Enemy(int x, int y, int width, int height, int speed, int tileW, int tileH, String file, Board board){
        super(x, y, width, height, speed, tileW,tileH,file, board);
    }

    @Override
    public void paint(Graphics g) {

    }
}
