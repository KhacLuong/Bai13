import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle C1 = new Circle();


        System.out.println(" nhap ten cua object 1");
        String name = scanner.nextLine();
        C1.setName(name);
        System.out.println(" nhap radius cua object 1");
        float radius = scanner.nextFloat();
        System.out.printf("Circle %s with Radius %f ",C1.getName(), C1.getRadius());

        System.out.println(" nhap ten cua oject 2");
        scanner.nextLine();
        name = scanner.nextLine();
        Circle C2 = new Circle(name);
        C2.setRadius(radius);
        System.out.printf("Area of Circle %s with Radius %f = %f", C2.getName(), C2.getRadius(), C2.calculatArea());



    }
}
