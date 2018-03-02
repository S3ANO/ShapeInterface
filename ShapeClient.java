import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Benefits of polymorphism shown here:
 * polymorphism:    Ability for the same code to be used with 
 *                  different types of objects and behave 
 *                  differently with each.
 *
 *
 * @author (Mrs. Hardy)
 * @version (1.1)
 */
public class ShapeClient
{
    public static void main(String args[])
    {
      DrawingPanel draw = new DrawingPanel(1200,1200);
      Graphics g = draw.getGraphics();
      Scanner input = new Scanner(System.in);
      int startX;
      int startY;
      int xCoordinate;
      int yCoordinate;
      
      System.out.println("For a rectangle, input the two sides:");
      startX = input.nextInt();
      startY = input.nextInt();
      Rectangle r = new Rectangle(startX, startY, Color.GREEN);
      r.draw(g);
      printInfo(r);
      
      System.out.println("For a circle, input the x and y values for the circle:");
      startX = input.nextInt();
      startY = input.nextInt();
      Circle c = new Circle(startX, startY, startX/3, Color.BLUE);
      c.draw(g);
      printInfo(c);
      
      System.out.println("For a triangle, input the two sides and x and y coordinates:");
      startX = input.nextInt();
      startY = input.nextInt();
      xCoordinate = input.nextInt();
      yCoordinate = input.nextInt();
      Triangle t = new Triangle(xCoordinate, yCoordinate, startX, startY, Color.RED);
      t.draw(g);
      printInfo(t);
      
      System.out.println("For a hexagon, input the side and x and y coordinates:");
      startX = input.nextInt();
      xCoordinate = input.nextInt();
      yCoordinate = input.nextInt();      
      Hexagon h = new Hexagon(xCoordinate, yCoordinate, startX, Color.BLACK);
      h.draw(g);
      printInfo(h);     
    }
    public static void printInfo(Shape s){
        System.out.println("The shape is : " + s);
        System.out.println("area : " + s.area() );
        System.out.println("perimeter : " + s.perimeter() );
    }
}
