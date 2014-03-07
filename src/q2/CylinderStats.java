package q2;

/**
 * <p>This program will take in two variables, the height and radius of a cylinder,
 * and tell your the cylinder's surface area and volume.</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */
import java.util.Scanner;

public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        double r, h, volume, area;
        double multiplier = 10000;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input the height of the cylinder: ");
        h = scan.nextDouble();
        
        System.out.print("Input the radius of the cylinder: ");
        r = scan.nextDouble();
        
        volume = Math.PI * Math.pow(r, 2) * h;
        
        area = 2 * Math.PI * r * (r + h);
        
        volume = Math.round(volume * multiplier) / multiplier;
        
        area = Math.round(area * multiplier) / multiplier;
        
        System.out.println("The area of your cylinder is " + area + " and the volume is " + volume + ".");
        
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

};
