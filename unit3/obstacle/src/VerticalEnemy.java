import java.awt.*;

public class VerticalEnemy extends Enemy {
    private int ySpeed, screenHeight;
    public VerticalEnemy(int x, int y, int w, int h, int sH, int yS) {
        super(x, y, w, h);
        ySpeed = yS;
        screenHeight = sH;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
    public void move() {
        Rectangle rect = getRectangle();
        rect.y+= ySpeed;
        if (rect.y < 0 || rect.y + rect.height >screenHeight) {
            ySpeed *= -1;
        }
    }
}