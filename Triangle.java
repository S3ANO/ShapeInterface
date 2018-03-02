import java.awt.*;
import java.util.ArrayList;
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle implements Shape
{
    // instance variables - replace the example below with your own
    private int coorX;
    private int coorY;
    private int x, y;
    private double z;
    private Color c;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(int coorX, int coorY, int x, int y, Color c)
    {
        // initialise instance variables
        this.coorX = coorX;
        this.coorY = coorY;
        this.x = x;
        this.y = y;
        this.c = c;
        this.z = Math.sqrt((x * x) + (y * y));
        this.z = (int)z;
    }
    
    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    public void draw(Graphics g){
        g.setColor(c);
        int[] xVals = {coorX, coorX, coorX + x};
        int[] yVals = {coorY, coorY + y, coorY + y};
        g.fillPolygon(xVals, yVals, 3);
        //String perArea = "Perim: " + perimeter() + " Area: " + area();
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString(perArea, x, y);
    }
    /**
     * All shapes must have a perimeter method
     *
     * @param    none
     * @return   perimeter
     */
    public double perimeter(){
        return x + y + z;
    }
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    public double area(){
        double s = (x + y + z)/2;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }
}
