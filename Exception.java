/* Online Java Compiler and Editor */
/* Compute the value of e = (2* A + B * 3.14) / (A - BE)*/
import java.util.Scanner;
public class JavaLab {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of A: ");
            double a = sc.nextDouble();

            System.out.println("Enter the value of B: ");
            double b = sc.nextDouble();

            if(a == b) {
                throw new Exception("A can not be equal to B");
            }

            double e = (2 * a + b * 3.14) / (a - b * Math.E);

            System.out.println("The value of e is " + e);
        } catch (Exception e) {
            System.out.println("Error\n" + e.getMessage());
        }
    }
}
