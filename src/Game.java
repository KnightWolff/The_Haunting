import javax.swing.*;

public class Game extends JFrame {

    Board board;

    public Game(){
        setTitle("Haunting");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board = new Board();
        add(board);

        pack();
        board.setup();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args){
        new Game();
    }
}
