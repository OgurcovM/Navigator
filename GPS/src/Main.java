import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите расстояние: ");
        Car car = new Car(scanner.nextInt());
        car.run();
    }
}