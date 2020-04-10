
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
    int paddingNum = 25;


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
        entities.add(0, new Player(paddingNum, getHeight()/2, 30, 60, 2, 95, 92, "Assets/Hero.png", this ));
        for(int i = 0; i <STATS.getNumZoms(); i++){
            entities.add(new Enemy(randomizer("width"), randomizer("height"), 28, 46, 1, 28,46, "Assets/Untitled.png",this));
        }
        for(int i = 0; i <STATS.getNumSkels(); i++){
            entities.add(new Enemy(randomizer("width"), randomizer("height"), 18, 47, 2, 18,47, "Assets/skel.png",this));
        }
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


    private int randomizer(String area){
        int place = 0;
        if(area == "height"){
            place = (int)(Math.random()*(getHeight()- paddingNum));
            if(place > getHeight() - 60){
                place =getHeight()-60;
            }
        }
        else{
            place =  (int)(Math.random()*(getWidth()- paddingNum));
            if(place < getWidth()/3){
                place =  (int)(Math.random()*(getWidth()- (getWidth()/3))+getWidth()/3);
            }
        }
        return place;
    }
}
