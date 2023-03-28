package exercises;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Length of twiangle please (that was not mis-spelled)");
        Double length = input.nextDouble();

        System.out.println("Width pwease (also not typo)");
        Double width = input.nextDouble();

        System.out.println("The area of the rectangle is: " + length*width);
        System.out.println();
        System.out.println();
    }
}
