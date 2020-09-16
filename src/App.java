
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Shape;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class App {

    /**
     * Use this entry point to put your debugging tests
     */
    public static void main(String[] args) {

    }

    /**
     * Do not change anything below here
     */

    @Test
    

    @Test
    public void polymorphismCheck() {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Circle c1 = new Circle("Bill");
        list.add(c1);
        Circle c2 = new Circle("Charlie", 12);
        list.add(c2);
        Rectangle r1 = new Rectangle("Percy");
        list.add(r1);
        Rectangle r2 = new Rectangle("Fred", 3,65);
        list.add(r2)
        Square s1 = new Square("George");
        list.add(s1);
        Square s2 = new Square("Ron", 4);
        list.add(s2);
        
        for (int i = 0; i < list.size(); i++) {
            testShapeGenerics(list.get(i));
        }

        Shape biggestShape = maxArea(list.get(0), list.get(1));
        for (int i = 1; i < list.size() - 1; i++) {
            Shape nextCompare = maxArea(biggestShape, list.get(i));
            if (nextCompare != null) {
                biggestShape = nextCompare;
            }
        }
        assertEquals(biggestShape, c2);

    }

    public Shape maxArea(Shape s1, Shape s2) {
        if (s1.getArea() < s2.getArea()) {
            return s2;
        } else if (s1.getArea() > s2.getArea()) {
            return s1;
        } else {
            return null;
        }
    }

    public Shape maxPerimeter(Shape s1, Shape s2) {
        if (s1.getPerimeter() < s2.getPerimeter()) {
            return s2;
        } else if (s1.getPerimeter() > s2.getPerimeter()) {
            return s1;
        } else {
            return null;
        }
    }

    public void testShapeGenerics(Shape s) {
        assertNotNull(s.getName());
        s.setName("Bob");
        assertEquals(s.getName(), "Bob");
        assertNotNull(s.toString());

    }

}
