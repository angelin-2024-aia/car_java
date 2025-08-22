
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
      
        Car myCar = new Car();

       
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        myCar.showDetails();
    }
}
