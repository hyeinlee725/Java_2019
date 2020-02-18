import ch.aplu.turtle.*;
import java.awt.Color;

public class Square2 {
    private double xcoord;
    private double ycoord;
    private double size;
    Turtle pen;
    public Square2(double x, double y, double s) {
        xcoord=x;
        ycoord=y;
        size=s;
        pen = new Turtle();
        pen.setColor(Color.red);
        pen.setPenColor(Color.green);
    }
    public void draw() {
        pen.penUp();
        pen.moveTo(xcoord,ycoord);
        pen.penDown();
        for (int i = 0; i < 4; i++) {
            pen.forward(size);
            pen.right(90);
        }
    }
    public static void main(String[] args) {
      Square2 s = new Square2(0.0, 100.0, 100.0);
      s.draw();
    }
}
