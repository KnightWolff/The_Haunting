
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Board extends JPanel implements ActionListener {

    BufferedImage img;
    String name;
    Timer timer;
    ArrayList<Sprite> entities;


    public Board(){
        if(Gamestates.MENU == true){
            STATS.setLvl(0);
        }
        else if(Gamestates.PLAY1 == true) {
            STATS.setLvl(1);
        }
        else{
            STATS.setLvl(2);
        }
        try {
            img = ImageIO.read(new File(getImageName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
    }

    public void setup(){
        entities = new ArrayList<>();
        entities.add(0, new Player(getWidth()/2, getHeight()/2, 30, 60, 2, 95, 92, "Assets/Hero.png", this ));



        timer = new Timer(1000/60, this);
        timer.start();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,this);

        for(Sprite thing: entities){
            thing.paint(g);
        }

    }



    public String getImageName(){
        if(STATS.getLvl() == 0){
            name = "Assets/Menu.png";
        }
        else if(STATS.getLvl() == 1)
            name = "Assets/Level1.png";
        else
            name = "Assets/LastLevel.png";
        return name;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
