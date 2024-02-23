package areafinder;

import java.util.Scanner;

public class Areas {
    // static vars needed for calculations
    static Scanner sc = new Scanner(System.in);
// ** // ** //// ** // ** //// ** // ** //// ** // ** //// ** // ** //
    public static void rectArea(){
        System.out.println("Please enter the first sides length");
        final int vara = sc.nextInt();
        System.out.println("Please enter the second sides length");
        final int varb = sc.nextInt();
        final int eqc = vara * varb;
        System.out.println(eqc);
    }
// ** // ** //// ** // ** //// ** // ** //// ** // ** //// ** // ** //
    public static void circleArea(){
        final int radi;
        final double pi = 3.14_15;
        System.out.println("please enter the radius");
        radi = sc.nextInt();
        final double eqc = pi*(radi*radi);
        System.out.println(eqc);

    }
// ** // ** //// ** // ** //// ** // ** //// ** // ** //// ** // ** //
    public static void triArea(){
        final int base,  height;
        System.out.println("Please enter the base of the triangle");
        base = sc.nextInt();
        System.out.println("Please enter the height of the triangle");
        height = sc.nextInt();
        final double eqc = .5*base*height;
        System.out.println(eqc);
    }
}
