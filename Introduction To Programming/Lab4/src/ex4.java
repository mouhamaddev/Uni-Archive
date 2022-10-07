import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        double r = myObj.nextDouble();

        double c = 2 * 3.14 * r;
        double a = 3.14 * r * r;

        System.out.println("The circumference is " + c);
        System.out.println("The area is " + a);

    }
}