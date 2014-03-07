package q1;


/**
 * <p>This class takes input from the user about the length of three sides of a triangle
 * and outputes the area of said triangle using a simple formula.</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */

import java.util.Scanner;

public class TriangleArea {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

    	double side1, side2, side3, perim, halfPerim, area;
    	double multiplier = 1000;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Give the length of the three triangle sides: ");
    	side1 = scan.nextDouble();
    	side2 = scan.nextDouble();
    	side3 = scan.nextDouble();
    	
    	perim = side1 + side2 + side3;
    	
    	halfPerim = perim / 2;
    	
    	area = Math.sqrt(halfPerim * (halfPerim - side1) * (halfPerim - side2) * (halfPerim - side3));
    	
    	perim = Math.round(perim * multiplier) / multiplier;
    	
    	area = Math.round(area * multiplier) / multiplier;
    	
    	System.out.println("The perimeter of the triangle is " + perim + " and the area is " + area +".");
        System.out.println("Question one was called and ran sucessfully.");
        scan.close();
    }

};
