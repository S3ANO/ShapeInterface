import java.awt.*;

/**
 * The Shape interface will define all required behaviors for all shapes
 *
 * @author (Mrs. Hardy)
 * @version (1.1)
 */
public interface Shape
{
    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    void draw(Graphics g);
    /**
     * All shapes must have a perimeter method
     *
     * @param    none
     * @return   perimeter
     */
    double perimeter();
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    double area();
}
