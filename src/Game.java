import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Game extends JFrame implements KeyListener {

    Board board;
    int posX, posY;
    boolean leftPress, rightPress, upPress, downPress, shiftPress;
    boolean pPress, rPress, mouseClick = false;
    long moment;

    public Game(){
        setTitle("Haunting");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board = new Board(this);
        add(board);
        addKeyListener(this);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,2), new Point(0,0), "null"));
            }
        });

        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                posX = e.getX();
                posY = e.getY();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                mouseClick = true;
                moment = System.currentTimeMillis();
            }
        });


        pack();
        board.setup();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args){
        new Game();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            setLeftPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            setRightPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            setUpPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            setDownPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            setShiftPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_P){
            setpPress(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_R){
            setrPress(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            setLeftPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            setRightPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            setUpPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            setDownPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            setShiftPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_P){
            setpPress(false);
        }
        if(e.getKeyCode() == KeyEvent.VK_R){
            setrPress(false);
        }
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isLeftPress() {
        return leftPress;
    }

    public void setLeftPress(boolean leftPress) {
        this.leftPress = leftPress;
    }

    public boolean isRightPress() {
        return rightPress;
    }

    public void setRightPress(boolean rightPress) {
        this.rightPress = rightPress;
    }

    public boolean isUpPress() {
        return upPress;
    }

    public void setUpPress(boolean upPress) {
        this.upPress = upPress;
    }

    public boolean isDownPress() {
        return downPress;
    }

    public void setDownPress(boolean downPress) {
        this.downPress = downPress;
    }

    public boolean isShiftPress() {
        return shiftPress;
    }

    public void setShiftPress(boolean shiftPress) {
        this.shiftPress = shiftPress;
    }

    public boolean ispPress() {
        return pPress;
    }

    public void setpPress(boolean pPress) {
        this.pPress = pPress;
    }

    public boolean isrPress() {
        return rPress;
    }

    public void setrPress(boolean rPress) {
        this.rPress = rPress;
    }

    public boolean isMouseClick() {
        return mouseClick;
    }

    public void setMouseClick(boolean mouseClick) {
        this.mouseClick = mouseClick;
    }

    public long getMoment() {
        return moment;
    }

    public void setMoment(long moment) {
        this.moment = moment;
    }
}
