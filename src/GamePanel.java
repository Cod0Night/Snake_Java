import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    static final int ballDiameter = 20;
    static final int gameWidth = 600;
    static final int gameHeight = 600;
    Dimension dimension = new Dimension(gameWidth,gameHeight);

    RandomBall randomBall;
    SnakeControl newSnake;
    Image image;
    Graphics graphics;



    GamePanel(){
        this.setPreferredSize(dimension);
        this.setBackground(Color.BLACK);

        newRandomBall();
        this.setVisible(true);

    }

    private void newRandomBall() {
        randomBall = new RandomBall(gameWidth,gameHeight,ballDiameter,ballDiameter);
    }


    public void paint(Graphics g) {
        image = createImage(getWidth(),getHeight());
        graphics  = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g){
       randomBall.draw(g);
    }
     public void move(){

     }
    public void checkCollision(){

    }

    @Override
    public void run() {
        long lastUpdate = System.currentTimeMillis();
        double fps = 1000/60;
        double delta = 0;
        while (true){
            double currentTime = System.currentTimeMillis();
            delta += (currentTime - lastUpdate)/fps;
            if(delta>=1){
                checkCollision();
                move();
                repaint();
            }
            delta--;
        }

    }
}
