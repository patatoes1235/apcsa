import java.awt.*;

public class StalkerEnemy extends Enemy{
    private Rectangle playerRect;
    public StalkerEnemy(int x, int y, int w, int h, Rectangle p) {
        super(x, y, w, h);
        playerRect = p;
    }

    @Override
    public Color getColor() {
        return Color.MAGENTA;
    }

    @Override
    public void move() {
        Rectangle thisRect = getRectangle();
        thisRect.x += (int)((playerRect.x - thisRect.x) /(2.0*Math.abs(playerRect.x - thisRect.x)) *2);
        thisRect.y += (int)((playerRect.y - thisRect.y) / (2.0*Math.abs(playerRect.y - thisRect.y))*2);
    }
}