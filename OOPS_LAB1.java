import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;

    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class OOPS_LAB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car myCar = new Car();

        System.out.print("Enter Car Brand: ");
        myCar.brand = sc.nextLine();

        System.out.print("Enter Car Model: ");
        myCar.model = sc.nextLine();

        System.out.print("Enter Car Year: ");
        myCar.year = sc.nextInt();

        System.out.println("\n---- Car Details ----");
        myCar.showDetails();

        sc.close();
    }
}
