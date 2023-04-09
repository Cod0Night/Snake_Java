import java.awt.*;
import java.util.Random;

public class RandomBall extends Rectangle {

    int width;
    int height;
    int xlocation;
    int yloction;
    Random randomball;
    RandomBall(int x, int y, int width, int height){
        this.width=width;
        this.height = height;
        randomball = new Random();
        xlocation = randomball.nextInt(10,x-10);
        yloction = randomball.nextInt(10,y-10);
        setXlocation(xlocation);
        setYloction(yloction);

    }


    public void setXlocation(int xlocation) {
        x = xlocation;
    }

    public void setYloction(int yloction) {
        y = yloction;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);

    }
}
