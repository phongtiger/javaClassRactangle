import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        double width = scanner.nextDouble();
        System.out.println("Enter Height");
        double height = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle "+ rectangle1.getArea());

    }
}
