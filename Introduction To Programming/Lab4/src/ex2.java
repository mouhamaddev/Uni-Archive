import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter m: ");
        double m = myObj.nextDouble();

        System.out.println("Enter g: ");
        double g = myObj.nextDouble();

        System.out.println("Enter h: ");
        double h = myObj.nextDouble();

        double PE = m*g*h;

        System.out.println("PE = " + PE + " j");

    }
}