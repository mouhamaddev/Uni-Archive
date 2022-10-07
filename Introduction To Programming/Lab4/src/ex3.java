import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius: ");
        double c = myObj.nextDouble();

        double F = c * (9 / 5) + 32;

        System.out.println("The temperature is " + F + " F");


    }
}