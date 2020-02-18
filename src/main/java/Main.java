import javax.swing.*;

import static java.lang.Math.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int a, b, c;
        float x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation: ax^2 + bx + c = 0");

        System.out.print("Please enter a: ");
        a =  sc.nextInt();
        System.out.print("Please enter b: ");
        b =  sc.nextInt();
        System.out.print("Please enter c: ");
        c =  sc.nextInt();

        float underRoot = calculateUnderRoot(a, b, c);

        if (underRoot < 0) {

            System.out.println("x has no real roots");
        }
        else {


            x1 = (float) (((-b) + (underRoot)) / (2 * a));
            x2 = (float) (((-b) - (underRoot)) / (2 * a));

            if (x1 == x2) {

                System.out.printf("x = %.0f\n", x1);

            }

            else {
                System.out.printf("x = %.2f or  x = %.2f\n", x1, x2);
            }



        }

    }

    public static float calculateUnderRoot(int a, int b, int c) {
        return (float) sqrt((b * b) - (4 * a * c));
    }
}