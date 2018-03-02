import java.awt.*;
import java.util.ArrayList;
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hexagon implements Shape
{
    // instance variables - replace the example below with your own
    private int coorX;
    private int coorY;
    private int x, y;
    private Color c;

    /**
     * Constructor for objects of class Triangle
     */
    public Hexagon(int coorX, int coorY, int x, Color c)
    {
        // initialise instance variables
        this.coorX = coorX;
        this.coorY = coorY;
        this.x = x;
        this.y = x / 2;
        this.c = c;
    }
    
    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    public void draw(Graphics g){
        g.setColor(c);
        int[] xVals = {coorX, coorX + x, coorX + (2 * x), coorX + (2 * x), coorX + x, coorX};
        int[] yVals = {coorY, coorY - y, coorY, coorY + x, coorY + x + y, coorY + x};
        g.fillPolygon(xVals, yVals, 6);
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
        return x * 6;
    }
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    public double area(){
        return ((3 * Math.sqrt(3))/ 2) * (x * x);
    }
}