import java.awt.*;

public class Bullet extends Sprite {
    public Bullet(int x, int y, int width, int height, int speed, int tileW, int tileH, String file, Board board){
        super(x, y, width, height, speed, tileW,tileH,file, board);
    }

    @Override
    public void paint(Graphics g) {

    }
}
