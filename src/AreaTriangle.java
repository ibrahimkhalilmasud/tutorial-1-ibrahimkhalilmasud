package tutorial-1-ibrahimkhalilmasud

import java.util.Scanner;


public class AreaTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the width:");
        double base = scanner.nextDouble();

        System.out.println("Please enter the height:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("The area of triangle: " + area);
    }
}