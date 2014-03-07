package q4;

/**
 * <p>This program creates instance data for the class box.java and runs it.</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Box box1 = new Box(13, 15, 17);
        Box box2 = new Box(25, 10, 18);
        Box standard = new Box();
        
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(standard);
        System.out.println("Question four was called and ran sucessfully.");
    }

};
