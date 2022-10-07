import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {

         Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the USD amount: ");

         double USD = myObj.nextDouble();

         double LL = USD*38000;

         System.out.println((int)USD + "$ is " + (int)LL + "L.L");

    }
}